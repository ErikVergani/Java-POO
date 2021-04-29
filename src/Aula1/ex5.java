package Aula1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = 1;
        double soma = 0;
        int cont = 0;

        System.out.println("Insira numeros para realizar a media, digite 0 para mostrar o resultado");
        while (num < 0 || num > 0) {
            num = input.nextDouble();
            if (num > 0) {
                soma += num;
                cont++;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println("A média dos números é de: " + (soma / cont));
    }
}