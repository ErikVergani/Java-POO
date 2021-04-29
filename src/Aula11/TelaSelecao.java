package Aula11;

import java.util.Scanner;

public class TelaSelecao {

    private MaquinaAlambique alambique1;
    private MaquinaAlambique alambique2;
    private MaquinaAlambique alambique3;
public TelaSelecao(){
    alambique1 = new MaquinaAlambique(100000, 100000, 500000, 750);
    alambique2 = new MaquinaAlambique(500000, 200000, 1200000, 750);
    alambique3 = new MaquinaAlambique(500000, 200000, 1200000, 750);
}
    public void showMenu() {
        Scanner input = new Scanner(System.in);

        int op;
        String menuMaquina = """
                1- Maquina 1 (100L caldo, 100L resíduos, 500L alambique);
                2- Maquina 2 (500L caldo, 200L resíduos, 1200L alambique);
                3- Maquina 3 (500L caldo, 200L resíduos, 1200L alambique);
                4- Desligar todas as máquinas!;
                """;
        while (true) {
            System.out.println("Insira a máquina de alambique que deseja trabalhar...");
            System.out.println(menuMaquina);
            op = input.nextInt();
            if (op < 1 || op > 4) {
                System.out.println("Opção inválida, tente novamente!");
            } else if (op == 1) {
                Tela t = new Tela(alambique1);
                t.show();
            } else if (op == 2) {
                Tela t = new Tela(alambique2);
                t.show();
            } else if (op == 3) {
                Tela t = new Tela(alambique3);
                t.show();
            }else{
                break;
            }
        }
    }
}
