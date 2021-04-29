package Aula5;
import java.util.Scanner;

public class testeOnibusv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passageiros = 0;

        onibusv2 oni = new onibusv2();

        while (true) {
            System.out.println("Insira a quantidade de passageiros que entraram ou sairam || 0 para finalizar");
            passageiros = input.nextInt();
            oni.addPassageiros(passageiros);
            if (passageiros != 0) {
                if (oni.getPassageiros() > oni.getLimite()) {
                    System.out.println("Limite máximo é de: " + oni.getLimite() + "pessoas");
                    oni.setPassageiros(oni.getLimite());
                }else if(oni.getPassageiros() < 0){
                    System.out.println("Impossivel sair mais pessoas do que entraram");
                    oni.setPassageiros(0);
                }
                System.out.println("Limite de passageiros disponivel: " + (oni.getLimite() - oni.getPassageiros()));
            } else {
                System.out.println("\nValor total arrecadado das passagens hoje: " + oni.setValorTotalPassagem() + " " +
                        "reais");
                break;
            }
        }
        System.exit(1);
    }
}
