package Aula2;
import java.util.Scanner;

/*MÓDULO: Desenvolva um programa que tem como entradas os lados de um triângulo e como saída a área e o perímetro desse
 triângulo, mas faça um módulo para calcular o perímetro do triângulo e um módulo para calcular a área do triângulo
  (e outros módulos que julgar necessários).
 */
public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite os 3 lados do triangulo");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println("perimetro: " + calcPerimetro(a, b, c));
        System.out.println("Area: " + calcArea(a, b, c));
    }

    public static int calcPerimetro(int a, int b, int c) {
        return a + b + c;

    }

    private static double calcArea(int a, int b, int c) {
        double calc = calcPerimetro(a, b, c) / 2;
        double area = Math.sqrt(calc * (calc - a) * (calc - b) * (calc - c));
        return area;
    }
}
