package Aula4;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira o lado A");
        a = input.nextDouble();
        System.out.println("Insira o lado B");
        b = input.nextDouble();
        System.out.println("Insira o lado C");
        c = input.nextDouble();

        trianguloCalculo tri = new trianguloCalculo();
        tri.ladoA = a;
        tri.ladoB = b;
        tri.ladoC = c;

        System.out.println("O perimetro é de: " + tri.calcularPerimetro());
        System.out.println("A área é de: "+tri.calcularArea());
    }
}
