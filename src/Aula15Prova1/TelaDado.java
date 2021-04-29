package Aula15Prova1;

import java.util.Scanner;

public class TelaDado {

    public static void main(String[] args) {

        Dado dado =new Dado();
        while (true){
            Scanner input = new Scanner(System.in);
            input.nextLine();
            System.out.println("O numero sorteado foi: "+dado.lancarDado());

            System.out.println("total de lancamentos: "+ dado.getContLancamento());

            for (int i = 0; i < dado.getLadoDadoSorteado().length; i++) {
                System.out.print("O numero: " + (i + 1) + " caiu: " + dado.getLadoDadoSorteado()[i] + "\n");
            }
        }
    }
}
