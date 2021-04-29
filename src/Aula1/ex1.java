package Aula1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, B, H;

        System.out.println("Insira os três lados do triângulo:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
       
        double p = a + b + c;
        double sp = p / 2;
        double ar = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));

        System.out.println("Perimetro: "+p);
        System.out.println("Area: "+ar);
    }
}