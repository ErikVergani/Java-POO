package Aula1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        int vet[] = new int[11];

        System.out.println("Insira um numero para exibir a tabuada...");
        num = input.nextInt();
        System.out.println();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i * num;
            System.out.println(num + " x " + i + " = " + vet[i]);
        }
    }
}
