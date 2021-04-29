package Aula1;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double peso;

        System.out.println("Bem-Vindo!");
        System.out.println("Insira o peso do caminhao...");
        peso = input.nextDouble();

        if (peso > 40000) {
            System.out.println(
                    "O peso está acima do limite, você está sendo multado e não poderá prosseguir viagem por essa estrada");
        } else {
            System.out.println("Boa viagem");
        }
    }
}
