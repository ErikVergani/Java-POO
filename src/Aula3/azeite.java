package Aula3;
import java.util.Scanner;
/*
       * Faça um programa que recebe do usuário o raio da base (fundo ou tampa) e a
       * altura da lata. Então calcule o volume da lata e mostre na tela para ajudar o
       * Marcão a saber quanto cabe em cada lata (o programa deve ter um módulo para
       * calcular o volume da lata).
       */

public class azeite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, altura;

        System.out.println("Insira o raio da tampa da lata");
        raio = input.nextDouble();
        System.out.println("Insira a altura da lata");
        altura = input.nextDouble();

        System.out.print("O volume da lata é de: ");
        System.out.printf("%.2f", calcularVolume(raio, altura));
        System.out.print(" cm³");
    }

    public static double calcularVolume(double r, double h) {
        double volume = 0;

        volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }
}
