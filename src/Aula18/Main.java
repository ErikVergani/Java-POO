package Aula18;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addItem(new ItemMenu("Abrir a porta", new AbrirPorta(), 1));
        menu.addItem(new ItemMenu("Fechar a porta", new FecharPorta(), 2));

        menu.gerarMenu();
    }

}
