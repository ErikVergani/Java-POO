package Aula1;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Insira o seu nome completo");

        nome = input.nextLine();

        String[] nomeS = nome.split(" ");

        System.out.print(nomeS[nomeS.length - 1].toUpperCase() + ", ");

        for (int i = 0; i < nomeS.length - 1; i++) {
            System.out.print(nomeS[i].toUpperCase().charAt(0) + ".");
        }
    }
}
