package Aula7;

import java.util.Scanner;

public class RunCaixaV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        double cons = 0;

        CaixaV2 caixa = new CaixaV2();

        while (running) {
            System.out.println("Insira o consumo em litros de cada apartamento.\nPressione 0 para mostrar o consumo total do prédio.");
            cons = input.nextInt();
            if (caixa.setConsumo(cons)) {
                System.out.println("Consumo registrado!\n");
            } else {
                System.out.println("Valor inválido\n");
            }
            if (cons == 0) {
                System.out.println("O consumo total do prédio foi de: " + caixa.getConsumo());
                System.exit(0);
            }
        }
    }
}
