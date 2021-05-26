package Aula22.Apresentacao;

import Aula22.Negocio.ItemMenu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class Menu {

    private String nomeItem;
    private ArrayList<ItemMenu> itens;

    public Menu(String nomeItem) {
        this.nomeItem = nomeItem;
        this.itens = new ArrayList<>();
    }

    public Menu() {
        this.nomeItem = """
                |----------------------|
                |         MENU         |
                |----------------------|
                """;
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemMenu item) {
        this.itens.add(item);
    }

    public void gerarMenu() {
        String menu = this.nomeItem + "\n";
        for (ItemMenu item : itens) {
            menu += "[" + item.getAtalhoItem() + "] " + item.getItemName() + "\n";
        }
        menu += "[0] Sair";
        int op = 1;
        while (op != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println(menu + "");
            System.out.println("Qual a opção desejada?");
            op = input.nextInt();
            for (ItemMenu item : itens) {
                if (op == item.getAtalhoItem()) {
                    item.getExecutarAcao().processarItem();
                }
            }
        }
    }
}
