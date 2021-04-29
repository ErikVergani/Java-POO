package Aula11;

import java.util.Scanner;

public class Tela {

    private MaquinaAlambique maquina;


    public Tela(MaquinaAlambique maquina) {
        this.maquina = maquina;
    }

    public void show() {

        Scanner input = new Scanner(System.in);

        //variaveis
        int opcao;
        int i;

        //Menus
        String menuFuncInfo = """
                1- Informações;
                2- Funcionalidades;
                3- Desligar máquina; 
                """;
        String menuInfo = """
                |--------------------Informações----------------------|
                |1- Consultar reservatório de caldo de cana;          |
                |2- Consultar reservatório de Alambique;              | 
                |3- Consultar reservatório de resíduos;               | 
                |4- Consultar níveis de todos os reservatórios;       | 
                |5- Consultar número de garrafas produzidas;          |
                |6- Consultar número de vezes que a máquina foi usada;|
                |0- Voltar;                                           |
                |-----------------------------------------------------|""";
        String menuFunc = """
                |-------------------Funcionalidades-------------------|
                |1- Reabastecer reservatório de caldo de cana(ml);    |
                |2- Produzir cachaça;                                 |
                |3- Engarrafar cachaça (750ml);                       |
                |4- Esvaziar reservatório de resíduos;                |
                |0- Voltar;                                           |
                |-----------------------------------------------------|
                """;

        while (true) {
            System.out.println(menuFuncInfo);
            opcao = input.nextInt();
            i = 1;
            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida, tente novamente!");
            } else if (opcao == 1) {
                while (i > 0) {
                    System.out.println(menuInfo);
                    opcao = input.nextInt();
                    if (opcao < 0 || opcao > 6) {
                        System.out.println("Opção inválida, tente novamente!");
                    } else if (opcao == 0) {
                        i = 0;
                    } else if (opcao == 1) {
                        System.out.println("Reservatório de caldo: " + (maquina.tankCaldo.getAmount() / 1000) + " " + "litros.\n");
                    } else if (opcao == 2) {
                        System.out.println("Reservatório de cachaça: " + (maquina.tankCachaca.getAmount() / 1000) + " " + "litros\n");
                    } else if (opcao == 3) {
                        System.out.println("Reservatório de resíduos: " + (maquina.tankResiduos.getAmount() / 1000) + " litros\n");
                    } else if (opcao == 4) {
                        System.out.println("Reservatório de caldo: " + (maquina.tankCaldo.getAmount() / 1000) + " " + "litros.\n");
                        System.out.println("Reservatório de cachaça: " + (maquina.tankCachaca.getAmount() / 1000) + " " + "litros\n");
                        System.out.println("Reservatório de resíduos: " + (maquina.tankResiduos.getAmount() / 1000) + " " + "litros\n");
                    } else if (opcao == 5) {
                        System.out.println("Foram produzidas " + maquina.garrafas.getAmount() + " garrafas.\n");
                    } else if (opcao == 6) {
                        System.out.println("A máquina deu " + maquina.getmachineUsages() + " bateladas\n");
                    }
                }
            } else if (opcao == 2) {
                while (i > 0) {
                    System.out.println(menuFunc);
                    opcao = input.nextInt();
                    if (opcao < 0 || opcao > 4) {
                        System.out.println("Opção inválida, tente novamente!\n");
                    } else if (opcao == 0) {
                        i = 0;
                    } else if (opcao == 1) {
                        System.out.println("Insira quantos ml de caldo de cana você deseja reabastecer.\n");
                        if (maquina.abastecerCaldo(input.nextDouble())) {
                            System.out.println("Valor reabastecido!\n");
                        } else {
                            System.out.println("Não foi possível reabastecer, confira os níveis dos reservatórios!\n");
                        }
                    } else if (opcao == 2) {
                        System.out.println("Produzindo cachaça.\n");
                        if (maquina.fazerCachaca()) {
                            System.out.println("Processo concluído com êxito!\n");
                        } else {
                            System.out.println("Não foi possível produzir a cachaça, confira os níveis dos reservatórios!\n");
                        }
                    } else if (opcao == 3) {
                        if (maquina.engarrafarCachaca()) {
                            System.out.println("+1 garrafa de alambique para o estoque.\n");
                        } else {
                            System.out.println("Não foi possível engarrafar, quantidade de alambique insuficiente para " + "encher uma garrafa!\n");
                        }
                    } else if (opcao == 4) {
                        maquina.tankResiduos.Flush();
                        System.out.println("Reservatório de resíduos esvaziado!");
                    }
                }
            } else {
                break;
            }
        }
    }
}
