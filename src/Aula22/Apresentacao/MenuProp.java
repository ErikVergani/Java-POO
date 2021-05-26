package Aula22.Apresentacao;

import Aula22.Negocio.*;

/**
 * @author ErikVergani
 * @date 09/05/2021
 **/

public class MenuProp implements ProcessarItem {

    MaquinaSorvete maquinaSorvete;

    public MenuProp(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;

    }

    @Override
    public void processarItem() {
        Menu m = new Menu("MENU DO PROPRIETARIO");
        m.addItem(new ItemMenu("Relatório de vendas", new Relatorio(this.maquinaSorvete), 1));
        m.addItem(new ItemMenu("Saldo de ingredientes", new SaldoIngredientes(this.maquinaSorvete), 2));
        m.addItem(new ItemMenu("Reabastecer todos os ingredientes", new ReabastecerIngredientes(this.maquinaSorvete), 3));
        m.gerarMenu();
    }
}