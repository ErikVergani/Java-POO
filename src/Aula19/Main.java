package Aula19;



/**
 * @author ErikVergani
 * @date 09/05/2021
 **/

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MaquinaSorvete maquina = new MaquinaSorvete();
        menu.addItem(new ItemMenu("Menu Cliente",new MenuUser(maquina),1));
        menu.addItem(new ItemMenu("Menu Proprietario", new MenuProp(maquina),2));
        menu.gerarMenu();

    }
}
