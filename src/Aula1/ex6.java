package Aula1;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int veic = 0;
        double carro = 4.60;
        double moto = 2.30;
        int numcarros = 0;
        int nummotos = 0;
        int control = 0;

        System.out.println(
                "\n Olá, registre o veículo que passará pela cancela, 1 para carros e 2 para motos, para finalizar o expediente, aperte 3.");
        while (control == 0) {
            System.out.println("\n Qual o tipo de veículo que está na cancela ? 1- carro ou 2- moto");
            veic = input.nextInt();
            if (veic == 1) {
                numcarros++;
            } else if (veic == 2) {
                nummotos++;
            } else if (veic == 3) {
                System.out.println("Saida confirmada...");
                break;
            } else if (veic != 1 || veic != 2) {
                System.out.println("Opção inválida, tente novamente...");
            }
        }
        double arrecadado = 0;
        arrecadado = (numcarros * carro) + (nummotos * moto);
        System.out.println("Passaram " + numcarros + " carros hoje. Arrecadado: " + (numcarros * carro) + " reais");
        System.out.println("Passaram " + nummotos + " motos hoje. Arrecadado: " + (nummotos * moto) + " reais");
        System.out.println("Total arrecadado: " + arrecadado);
    }
}