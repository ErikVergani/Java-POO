package Aula18;

import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 29/04/2021
 **/

public class ExecMenu {

    private MenuModel modelo;

    public ExecMenu(MenuModel modelo) {
        this.modelo = modelo;
    }

    public void execMenu() {
        Scanner input = new Scanner(System.in);
        int op = 1;
        while (op != 0) {
            for (String listaOp : modelo.listaOpcoes()) {
                System.out.println(listaOp);

            }
            modelo.chooseOp(input.nextInt());
            input.nextLine();
            }
        }
    }

