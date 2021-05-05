package Aula18;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 29/04/2021
 **/

public class MenuModelTeste implements MenuModel {

    @Override
    public ArrayList<String> listaOpcoes() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("[1] Ok");
        lista.add("[2] Nao ok ");
        lista.add("[0] Sair");
        return lista;
    }

    @Override
    public void chooseOp(int op) {
        if (op == 1) {
            System.out.println("Deu certo");
        } else if (op == 2) {
            System.out.println("tu é o cara");
        } else if (op == 0) {
            System.out.println("saindo");
        } else {
            System.out.println("OP invalida");
        }
    }
}
