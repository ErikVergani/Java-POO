package Aula7;


import java.util.Scanner;

public class testeOnibus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passageiros = 0;

        onibus oni = new onibus();

        while (true) {
            System.out.println("Insira a quantidade de passageiros que entraram ou sairam || 0 para finalizar");
            passageiros = input.nextInt();
            if(passageiros !=0){
                oni.setLimiteDisponivel(passageiros);
                oni.setValorTotalPassagem(passageiros);
                System.out.println("Limite de passageiros disponivel: "+oni.getLimiteDisponivel());
            }else{
                System.out.println("\nValor total arrecadado das passagens hoje: "+oni.getValorTotalPassagem()+" " +
                        "reais");
                break;
            }
        }
        System.exit(1);
    }
}