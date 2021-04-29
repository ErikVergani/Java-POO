package Aula14.radio;

import java.util.Scanner;

/*3) Criar com um pequeno menu que permita interagir com o rádio . O menu deve permitir ligar ou desligar o rádio,
trocar de estação ou mudar o modo de transmissão da estação sintonizada, aumentar e reduzir o volume.
*/
public class Tela {

    private Radio radio;

    public Tela() {
        this.radio = new Radio();
    }

    public void show() {

        Scanner input = new Scanner(System.in);
        String menuLigar = """
                
                1- Ligar/Desligar
                """;
        String menuRadio = """
                
                1- Aumentar frequencia da estação
                2- Diminuir frequencia da estação
                3- Definir frequencia manualmente
                4- Definir volume
                5- Trocar modo de transmissão
                0- Voltar
                
                """;

        int op = 0;

        while (true) {
            System.out.println(menuLigar);
            op = input.nextInt();
            if (op != 1) {
                System.out.println("Opção inválida, tente novamente!");
            } else if (op == 1) {
                if ((radio.turnOn())) {
                    System.out.println("Radio ligado");
                    int x = 1;
                    while (x > 0) {
                        System.out.println(menuRadio);
                        op = input.nextInt();
                        if (op == 1) {
                            if ((radio.getEstacaoSincronizada().increaseFrequency())) {
                                System.out.println("Estação atual: " + radio.getEstacaoSincronizada().getFrequency());
                            }
                        } else if (op == 2) {
                            if ((radio.getEstacaoSincronizada().reduceFrequency())) {
                                System.out.println("Estação atual: " + radio.getEstacaoSincronizada().getFrequency());
                            }
                        } else if (op == 3) {
                            System.out.println("Insira a frequencia desejada no intervalo de: " + radio.getEstacaoSincronizada().getMinFrequency() + " <-> " + radio.getEstacaoSincronizada().getMaxFrequency());
                            if ((radio.getEstacaoSincronizada().setFrequency(input.nextDouble()))) {
                                System.out.println("Estação definida para: " + radio.getEstacaoSincronizada().getFrequency());
                            } else {
                                System.out.println("Não foi possível definir a estação");
                            }
                        } else if (op == 4) {
                            System.out.println("insira o volume desejado: ");
                            if ((radio.changeVolume(input.nextInt()))) {
                                System.out.println("Volume definido para: " + radio.getVolume());
                            } else {
                                System.out.println("Não foi possível definir o volume, insira um valor inteiro entre: " + radio.getMinVolume() + " <-> " + radio.getMaxVolume());
                            }
                        } else if (op == 5) {
                            radio.getEstacaoSincronizada().changeMode();
                            System.out.println("Modo atual: " + radio.getEstacaoSincronizada().getMode());
                        } else if (op == 0) {
                            x = 0;
                        }
                    }
                } else {
                    System.out.println("Radio desligado");
                }
            }
        }
    }
}
