package Aula4;
import java.util.Scanner;

public class pedagio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 1;
        int veic = 0;
        cancela in = new cancela();

        System.out.println("Insira 1 para carros, 2 para motos ou 3 para encerrar o expediente");
        while (i > 0) {
            System.out.println("\n Qual o tipo de veículo que está na cancela ? 1- carro ou 2- moto");
            veic = input.nextInt();
            if (veic == 1) {
                in.numCarro++;
            } else if (veic == 2) {
                in.numMoto++;
            } else if (veic == 3) {
                System.out.println("Fim expediente!");
                break;
            } else if (veic != 1 || veic != 2) {
                System.out.println("Opção inválida, tente novamente...");
            }
        }
        System.out.println("Passaram " + in.numCarro + " carros hoje. Arrecadado: " + in.arrecadadoCarro() + " reais");
        System.out.println("Passaram " + in.numMoto + " motos hoje. Arrecadado: " + in.arrecadadoMoto() + " reais");
        System.out.print("Total arrecadado: ");
        System.out.printf("%.2f", in.totalArrecadado());
        System.out.print(" reais");
    }
}