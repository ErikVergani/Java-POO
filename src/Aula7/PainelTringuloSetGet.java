package Aula7;

import java.util.Scanner;

public class PainelTringuloSetGet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TrianguloSetGet tri = new TrianguloSetGet();

        System.out.println("Insera o lado A, B e C");
        tri.setLadoA(input.nextDouble());
        tri.setLadoB(input.nextDouble());
        tri.setLadoC(input.nextDouble());

        System.out.println("O perimetro é de: " + tri.getPerimetro());
        System.out.println("A área é de: "+tri.getArea());
    }
}
