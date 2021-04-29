package Aula5;

import java.util.Scanner;


public class testeCaixaAgua {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cont = 1;
        double cons = 0;

        caixa classe = new caixa();

        while (cont > 0) {
            System.out.println("Insira o consumo de agua em LITROS || 0 para mostrar o consumo total || Insirir um " +
                    "numero " +
                    "negativo irá zerar o contador!");
            cons = input.nextDouble();
            if (cons > 0) {
                classe.consumo+= cons;
                System.out.println("Volume adicionado.\n");
            } else if (cons == 0) {
                System.out.println("O consumo até agora foi de: "+classe.consumo+" litros\n");
            } else if (cons < 0) {
                System.out.println("Contador de consumo zerado com sucesso!");
                classe.isZerarConsumo();
            }
        }
    }
}
