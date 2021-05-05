package Aula17;

/**
 * @author ErikVergani
 * @date 29/04/2021
 **/

public class TesteMain {

    public static void main(String[] args) {
        MenuModelTeste menuModelTeste = new MenuModelTeste();
        ExecMenu execMenu = new ExecMenu(menuModelTeste);
        execMenu.execMenu();
    }
}
