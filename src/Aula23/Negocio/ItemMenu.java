package Aula23.Negocio;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class ItemMenu {

    private String itemName;
    private ProcessarItem executarAcao;
    private int atalhoItem;

    public ItemMenu(String itemName, ProcessarItem executarAcao, int atalhoItem) {
        this.itemName = itemName;
        this.executarAcao = executarAcao;
        this.atalhoItem = atalhoItem;
    }

    public String getItemName() {
        return itemName;
    }

    public ProcessarItem getExecutarAcao() {
        return executarAcao;
    }

    public int getAtalhoItem() {
        return atalhoItem;
    }
}
