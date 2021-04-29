package Aula6;
/*Construa uma classe para modelar o funcionamento de uma
máquina de fazer refrigerantes, aquelas que existem nas hamburguerias expressas (com refil). A máquina pode servir 3
sabores diferentes, portanto ela tem estoque de 3 xaropes diferentes, água e gás. Se faltar um dos insumos não é possível
 servir. Para cada 100 ml de refrigerante são consumidos 95 ml de água, 5 ml de xarope e um dose de gás. Construa primeiramente
  a classe que representa o funcionamento dessa máquina e depois uma tela com menu (main) que vai interagir com a máquina, fazendo ela funcionar.
 */
import java.util.Scanner;

public class MaquinaRefrigerante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menuRefri = """
                1- Refigerante de Coca
                2- Refigerante de Guaraná
                3- Refigerante de Limão
                4- Reabastecer gás(un)
                5- Reabastecer água(ml)
                6- Reabastecer xarope(ml)
                """;
        String menuCopo = """
                1- Copo de 300ml
                2- Copo de 500ml
                3- Copo de 700ml
                """;
        String menuXarope = """
                1- Xarope de Coca
                2- Xarope de Guaraná
                3- Xarope de Limão
                """;

        boolean isLigada;
        int op = 0;
        int tamanhoCopo = 0;
        int quantidade = 0;

        Refrigerantes refri = new Refrigerantes();

        while (isLigada = true) {
            System.out.println(menuRefri);
            op = input.nextInt();
            if (op == 1 || op == 2 || op == 3) {
                System.out.println(menuCopo);
                tamanhoCopo = input.nextInt();
                if (tamanhoCopo == 1) {
                    if (refri.servirRefri(300, op)) {
                        System.out.println("Refri servido.");
                    } else {
                        System.out.println("Algum ingrediente necessário para fazer o refri acabou, por favor chame " + "o atendente.\n");
                    }
                } else if (tamanhoCopo == 2) {
                    if (refri.servirRefri(500, op)) {
                        System.out.println("Refri servido.");
                    } else {
                        System.out.println("Algum ingrediente necessário para fazer o refri acabou, por favor chame " + "o atendente.\n");
                    }
                } else if (tamanhoCopo == 3) {
                    if (refri.servirRefri(700, op)) {
                        System.out.println("Refri servido.");
                    } else {
                        System.out.println("Algum ingrediente necessário para fazer o refri acabou, por favor chame " + "o atendente.\n");
                    }
                }
            } else if (op == 4) {
                System.out.println("Insira a quantidade de gás(unidades) que deseja reabastecer a máquina.");
                quantidade = input.nextInt();
                if (quantidade + refri.getQuantGas() <= refri.getLimiteGas()) {
                    refri.addQuantGas(quantidade);
                    System.out.println("Foram reabastecidos " + quantidade + " unidades de gás!\n");
                } else {
                    System.out.println("Este valor excede o imite máximo de unidades de gás! Operação " + "cancelada\n");
                }
            } else if (op == 5) {
                System.out.println("Insira a quantidade de água(ml) que deseja reabastecer a máquina.");
                quantidade = input.nextInt();
                if (quantidade + refri.getQuantAgua() <= refri.getLimiteAgua()) {
                    refri.addQuantAgua(quantidade);
                    System.out.println("Foram reabastecidos " + quantidade + "ml de água!\n");
                } else {
                    System.out.println("Limite máximo de ml de água atingido! Operação cancelada\n");
                }
            } else if (op == 6) {
                System.out.println("Insira qual xarope voce deseja reabastecer.");
                System.out.println(menuXarope);
                op = input.nextInt();
                if (op == 1) {
                    System.out.println("Insira a quantidade de Xarope de coca(ml) que deseja reabastecer a máquina.");
                    quantidade = input.nextInt();
                    if (quantidade + refri.getQuantXaropeCoca() <= refri.getLimiteXarope()) {
                        refri.addXarope(1, quantidade);
                        System.out.println("Foram reabastecidos " + quantidade + "ml de xarope\n");
                    } else {
                        System.out.println("Limite máximo de ml de xarope atingido! Operação cancelada\n");
                    }
                } else if (op == 2) {
                    System.out.println("Insira a quantidade de Xarope de Guarana(ml) que deseja reabastecer a máquina" + ".");
                    quantidade = input.nextInt();
                    if (quantidade + refri.getQuantXaropeGuarana() <= refri.getLimiteXarope()) {
                        refri.addXarope(2, quantidade);
                        System.out.println("Foram reabastecidos " + quantidade + "ml de xarope\n");
                    } else {
                        System.out.println("Limite máximo de ml de xarope atingido! Operação cancelada\n");
                    }
                } else if (op == 3) {
                    System.out.println("Insira a quantidade de Xarope de Limão(ml) que deseja reabastecer a máquina.");
                    quantidade = input.nextInt();
                    if (quantidade + refri.getQuantXaropeLimao() <= refri.getLimiteXarope()) {
                        refri.addXarope(3, quantidade);
                        System.out.println("Foram reabastecidos " + quantidade + "ml de xarope!\n");
                    } else {
                        System.out.println("Limite máximo de ml de xarope atingido! Operação cancelada\n");
                    }
                }
            }
        }
    }
}