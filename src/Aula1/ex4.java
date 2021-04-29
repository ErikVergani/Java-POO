package Aula1;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = 1;
        double soma = 0;

        System.out.println("Insira números para somar, para mostrar a soma aperte 0");
        while (num > 0) {
            num = input.nextDouble();
            if (num == 0) {
                break;
            } else {
                soma += num;
            }
        }
        System.out.println("\n A soma é de: " + soma);
    }
}