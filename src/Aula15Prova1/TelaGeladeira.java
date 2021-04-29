package Aula15Prova1;

import java.util.Scanner;

public class TelaGeladeira {

    Geladeira geladeira;

    public TelaGeladeira() {
        this.geladeira = new Geladeira();
    }

    public void show() {
        Scanner input = new Scanner(System.in);

        String menuUser = """
                -------------- MENU USUARIO --------------
                1- Doar alimentos
                2- Receber alimentos
                0- Voltar
                """;
        String tipoAlimento = """
                1- Perecivel
                2- Não perecivel
                """;
        String menuAdm = """
                ---------------- MENU ADM ----------------
                1- Consultar Kg de alimentos na geladeira
                2- Limpar toda a geladeira
                0- Voltar
                """;
        String operationMode = """
                1- Entrar como usuario
                2- Entrar como ADM
                0- Fechar geladeira
                """;

        int op = 0;
        while (true) {
            System.out.println(operationMode);
            op = input.nextInt();
            input.nextLine();
            if (op < 0 || op > 2) {
                System.out.println("Opção inválida, tente novamente!");
            } else if (op == 1) {
                int i = 1;
                while (i > 0) {
                    System.out.println(menuUser);
                    op = input.nextInt();
                    input.nextLine();
                    if (op < 0 || op > 2) {
                        System.out.println("Opção inválida, tente novamente!");
                    } else if (op == 1) {
                        System.out.println("Informe o tipo do alimento");
                        System.out.println(tipoAlimento);
                        int opTipoAlimento = input.nextInt();
                        input.nextLine();
                        if (opTipoAlimento == 1) {
                            System.out.println("Quantos Kg de alimentos deseja doar?");
                            int kgAlimentos = input.nextInt();
                            input.nextLine();
                            if (geladeira.doarAlimentoPerecivel(kgAlimentos)) {
                                System.out.println("Alimento doado com sucesso");
                            } else {
                                System.out.println("Não foi possivel doar");
                            }
                        } else if (opTipoAlimento == 2) {
                            System.out.println("Quantos Kg de alimentos deseja doar?");
                            int kgAlimentos = input.nextInt();
                            input.nextLine();
                            if (geladeira.doarAlimentoNaoPerecivel(kgAlimentos)) {
                                System.out.println("Alimento doado com sucesso");
                            } else {
                                System.out.println("Não foi possivel doar");
                            }
                        }
                    } else if (op == 2) {
                        System.out.println("Informe o tipo de alimento");
                        System.out.println(tipoAlimento);
                        int opTipoAlimento = input.nextInt();
                        input.nextLine();
                        if(opTipoAlimento ==1){
                            System.out.println("Quantos Kg de alimentos deseja receber?");
                            int kgAlimentos = input.nextInt();
                            input.nextLine();
                            if (geladeira.receberAlimentosPereciveis(kgAlimentos)) {
                                System.out.println("Alimentos recebidos com sucesso");
                            } else {
                                System.out.println("Quantidade de alimentos deseja não está disponivel");
                            }
                        }else if(opTipoAlimento==2){
                            System.out.println("Quantos Kg de alimentos deseja receber?");
                            int kgAlimentos = input.nextInt();
                            input.nextLine();
                            if (geladeira.receberAlimentosNaoPereciveis(kgAlimentos)) {
                                System.out.println("Alimentos recebidos com sucesso");
                            } else {
                                System.out.println("Quantidade de alimentos deseja não está disponivel");
                            }
                        }
                    } else if (op == 0) {
                        i = 0;
                    }
                }
            } else if (op == 2) {
                int i = 1;
                while (i > 0) {
                    System.out.println(menuAdm);
                    op = input.nextInt();
                    input.nextLine();
                    if (op < 0 || op > 2) {
                        System.out.println("Opção inválida, tente novamente!");
                    } else if (op == 1) {
                        System.out.println("---KG DE ALIMENTOS DISPONIVEL---");
                        System.out.println("-> Total: " + geladeira.consultarTotalAlimentos() + " Kg de alimentos, " +
                                "capacidade: "+geladeira.getCapacidadeAlimentos()+ " Kg");
                        System.out.println("-> Total alimentos pereciveis: " + geladeira.getKgAlimentoPereciveis() + " Kg de " + "alimentos");
                        System.out.println("-> Total alimentos nao pereciveis: " + geladeira.getKgAlimentoNaoPereciveis() + " Kg de alimentos");
                    } else if (op == 2) {
                        System.out.println("A geladeira será esvaziada completamente em 3,2,1 ...");
                        geladeira.limparGeladeira();
                        System.out.println("Geladeira completamente esvaziada");
                    } else if (op == 0) {
                        i = 0;
                    }
                }
            }else if(op ==0){
                break;
            }
        }
    }
}
