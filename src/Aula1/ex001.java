package Aula1;
import java.util.Scanner;
import java.util.Random;

public class ex001 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[4][5];
        int somaL = 0;
        int somaC = 0;

        // preenche a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        // Soma da linha
        System.out.println("De qual linha você deseja saber a soma ?");
        int linha = input.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == (linha - 1)) {
                    somaL += matriz[i][j];
                }
            }
        }
        // media da coluna
        System.out.println("De qual coluna você deseja saber a média ?");
        int coluna = input.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == (coluna - 1)) {
                    somaC += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da linha " + linha + " é de: " + somaL);
        System.out.println("A média da coluna " + coluna + " é de: " + ((double) somaC / 5));
    }
}