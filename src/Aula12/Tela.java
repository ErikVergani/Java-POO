package Aula12;

import java.util.Scanner;

/*Um trem de carga contém até 25 vagões. Cada vagão é formatado para um certo tipo de carga
(grãos, minério, manufaturados, etc.) e possui uma capacidade máxima (peso máximo em toneladas).
 Os vagões podem estar não estar cheios (carga atual), ou seja, o trem não é obrigado a levar os
 vagões com a carga máxima (podem estar com menos do que 100% de se sua capacidade). Cada vagão pode
  ser carregado ou descarregado. A locomotiva contém um reservatório de combustível que consome 1,2
  litros de combustível por km rodado, mais 0,4 litros por vagão que a locomotiva está puxando.
  Ao transportar (movimentar o trem) o trem sempre puxa todos os vagões conectados à locomotiva e
   desloca-se um certa quantidade de quilômetros (km). O painel do operador mostra o total de
   quilômetros que o trem já percorreu (em sua história - odômetro), o combustível que há no tanque,
   o número de vagões e o peso total que está sendo transportado (que está carregado)*/
public class Tela {

    private Locomotiva loco;

    public Tela() {
        loco = new Locomotiva();
    }

    public void show() {
        Scanner input = new Scanner(System.in);
        //menus
        String menuInicial = """
                1- Carregar vagões
                2- Descarregar vagão
                3- Abastecer locomotiva
                4- Inserir quantidade de km da viagem.
                5- Iniciar viagem.
                6- Painel do operador
                """;
        String menuCargas = """
                1 -Grãos
                2- Minério
                3- Manufaturados
                """;
        //variaveis
        int numVagoes = 0;
        int op = 0;
        System.out.println("Quantos vagões a locomotiva puxará ?");
        numVagoes = input.nextInt();
        loco.setNumVagoes(numVagoes);
        while (true) {
            System.out.println(menuInicial);
            op = input.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Opção inválida, tente novamente");
            } else if (op == 1) {
                for (int i = 0; i < numVagoes; i++) {
                    loco.vagao[i] = new Vagao();
                    System.out.println("Insira a carga desejada para o vagão " + (i + 1));
                    System.out.println(menuCargas);
                    if (loco.vagao[i].setTipoCarga(input.nextInt())) {
                        System.out.println("Tipo de carga definido\n");
                        System.out.println("Com quantas toneladas deseja carregar? (max 50ton)");
                        if (loco.vagao[i].setCargaAtual(input.nextInt())) {
                            System.out.println("Carga adicionada\n");
                        } else {
                            System.out.println("Não foi possivel carregar o vagao\n");
                            i--;
                        }
                    } else {
                        System.out.println("Não foi possível deifinir o tipo da carga, opção inválida.\n");
                        i--;
                    }
                }
            } else if (op == 2) {
                System.out.println("A locomotiva está puxando " + numVagoes + " vagões qual vagão deseja " + "descarregar ?");
                op = input.nextInt();
                if (op >= 1 && op <= numVagoes) {
                    System.out.println("Quantas ton deseja descarregar do vagão " + (op) + " que está carregado com " + loco.vagao[(op - 1)].getCargaAtual() + " ton de " + loco.vagao[(op - 1)].getTipoCarga());
                    int desc = input.nextInt();
                    if ((loco.vagao[(op - 1)].descarregar(desc))) {
                        System.out.println("Descarregamento do vagão " + (op) + " executado com sucesso");
                        System.out.println("O vagão ainda possui " + loco.vagao[(op - 1)].getCargaAtual() + " toneladas de " + loco.vagao[(op - 1)].getTipoCarga() + "\n");
                    } else {
                        System.out.println("Não foi possível descarregar o vagão, tente novamente.");
                    }
                } else {
                    System.out.println("Vagão não localizado.\n");
                }
            } else if (op == 3) {
                System.out.println("Locomotiva abastecida com sucesso!");
                loco.abastecerLocomotiva();
            } else if (op == 4) {
                System.out.println("Quantos Km será a viagem?");
                loco.setKmViagem(input.nextInt());
            } else if (op == 5) {
                System.out.println("Iniciando viagem...");
                if (loco.andar()) {
                    System.out.println("Viagem realizada com sucesso");
                } else {
                    System.out.println("Falta de combustivel, adicione mais gasosa");
                }
            } else if (op == 6) {
                System.out.println("Odometro: " + loco.getOdometro() + " km");
                System.out.println("Quantidade de combustivel no tanque: " + loco.getResComb() + " litros");
                System.out.println("Num de vagoes conectados a locomotiva: " + numVagoes);
                int pesototal = 0;
                for (int i = 0; i < numVagoes; i++) {
                    pesototal += loco.vagao[i].getCargaAtual();
                }
                System.out.println("peso total: " + pesototal + " toneladas\n");
            }
        }
    }
}
