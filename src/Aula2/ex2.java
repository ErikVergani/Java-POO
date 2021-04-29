package Aula2;

import java.util.Scanner;

/*
MÓDULO: Desenvolva um programa que tem como entradas os lados de um triângulo e como saída a área e o perímetro desse
 triângulo, mas faça um módulo para calcular o perímetro do triângulo e um módulo para calcular a área do triângulo
 (e outros módulos que julgar necessários).

*/
public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero para mostrar o fatorial...");
        int valor = input.nextInt();
        System.out.println("O fatorial de " + valor + " é igual a " + calcularFatorial(valor));
    }

    public static int calcularFatorial(int valor) {
        int fat = 1;
        for (int i = 2; i <= valor; i++) {
            fat *= i;
        }
        return fat;
    }
}