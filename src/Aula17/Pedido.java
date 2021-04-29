package Aula17;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author NandoFilter
 * @date 04/27/2021
 */

@Getter
@Setter
public class Pedido implements MenuConfig {

    private ArrayList<String> pedidos;

    public Pedido() {
        this.pedidos = new ArrayList<>();
    }

    public void addMenu() {

    }

    @Override
    public ArrayList<String> getProximaOpcao() {
        ArrayList<String> opcao = new ArrayList<>(pedidos);

        return opcao;
    }

    @Override
    public void gerarMenuOpcoes() {
        pedidos.add("Salada");
        pedidos.add("Costela");
    }
}