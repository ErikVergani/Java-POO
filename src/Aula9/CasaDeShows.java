package Aula9;
/*Maria é administradora de uma casa de shows e, devido a pandemia, precisa controlar o número de pessoas no interior
 do estabelecimento. A casa tem duas portas e isso dificulta o controle, mas com um software é possível facilitar esse
 trabalho. A capacidade máxima da casa é de 200 pessoas (já considerando a pandemia). Aproveitando a oportunidade, Maria
  deseja também controlar a receita com ingressos a cada noite. Elas pagam R$ 40,00 e eles pagam R$ 55,00. Construa um
  software que exibe um menu com as opções "entrar na casa (ele)", "entrar na casa (ela)", "sair da casa", "consultar
  valor em caixa", "consultar lotação atual", "encerrar expediente". A solução, claro, deve ser implementada sob o
  paradigma OO.
*/

import java.util.Scanner;

public class CasaDeShows {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CasaDeShowsControles control = new CasaDeShowsControles();

        String menu = """
                1- (ELES - entrada 1) Entrar na casa.
                2- (ELAS - entrada 2) Entrar na casa.
                3- Tirar 1 pessoa da casa.
                4- Consultar valor em caixa.
                5- Consultar lotação.
                6- Encerrar o expediente.
                """;
        int op = 0;

        while (true) {
            System.out.println(menu);
            op = input.nextInt();
            if (op < 1 || op > 6) {
                System.out.println("Opção inválida, tente novamente...\n");
            } else if (op == 1) {
                if(control.addEles()){
                    System.out.println("+1 pessoa dentro da casa.\n");
                }else{
                    System.out.println("Lotação máxima atingida!\n");
                }
            } else if (op == 2) {
                if(control.addElas()){
                    System.out.println("+1 pessoa dentro da casa.\n");
                }else{
                    System.out.println("Lotação máxima atingida!\n");
                }
            } else if (op == 3) {
               if(control.sairDaCasa()){
                   System.out.println("-1 pessoa dentro da casa.\n");
               }else{
                   System.out.println("Não há mais ninguém dentro da casa.\n");
               }
            } else if (op == 4) {
                System.out.println("O valor em caixa é de: " + control.getValorCaixa() + " reais.\n");
            } else if (op == 5) {
                System.out.println("No momento temos " + control.getLotacao() + " vagas disponiveis\n");
            } else if (op == 6) {
                System.out.println("Fim expediente \n");
                System.exit(0);
            }
        }

    }
}
