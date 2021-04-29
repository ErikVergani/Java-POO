package Aula2;
import java.util.Scanner;

/*MÓDULO: Desenvolva um programa que tem como entradas os lados de um triângulo e como saída a área e o perímetro desse triângulo, mas faça um módulo para calcular o perímetro do triângulo e um módulo para calcular a área do triângulo (e outros módulos que julgar necessários).*/
public class ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = input.nextLine();

        if (ePalindromo(palavra)) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
        System.exit(0);
    }
    public static String palindromo(String palavra) {
        String palavrabug = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavrabug += palavra.charAt(i);
        }
        return palavrabug;
    }
    public static boolean ePalindromo(String palavra) {
        if (palindromo(palavra).equals(palavra)) {
            return true;
        } else {
            return false;
        }
    }
}