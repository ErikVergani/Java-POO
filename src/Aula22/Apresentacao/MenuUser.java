package Aula22.Apresentacao;

import Aula22.Negocio.*;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/
/*
 * Essa máquina contém um estoque de leite, base emulsificante e essência de morango ou chocolate. Para fazer uma porção
 *  (uma bola) de sorvete são consumidos 35 ml de leite, 15 g de emulsificante e 7 ml de essência conforme o sabor
 *  escolhido pelo cliente. A máquina deve ter opções para o usuário comprar uma porção (de uma bola) de morango
 * ou chocolate ou comprar um litro de sorvete. Um litro é equivalente a 16 bolas de sorvete.
 * Também deve ter uma interface que permita ao dono do estabelecimento recarregar os ingredientes. Ao final do
 * expediente o
 * proprietário quer saber quantas bolas de sorvete de cada tipo foram vendidas (lembre-se que um
 * litro equivale a 16 bolas) e poderá também querer saber o saldo existente de cada ingrediente (prova em 2017B).
 * Requisitos não-funcionais:
 * - deve ter duas camadas de software: "business layer" e "presentation layer"
 * - a camada de apresentação (view ou presentation) deve ter uma classes para cada uma das telas
 * - se existir um menu ele deve ser gerado por meio da classe Menu (versão 01 ou versão 02)*/
public class MenuUser implements ProcessarItem {

    private ProcessarItem processarItem;
    private MaquinaSorvete maquinaSorvete;

    public MenuUser(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;

    }

    @Override
    public void processarItem() {
        Menu m = new Menu("MENU DO CLIENTE");
        m.addItem(new ItemMenu("Comprar bola Chocolate", new ProduzirBolaChocolate(this.maquinaSorvete), 1));
        m.addItem(new ItemMenu("Comprar bola de morango",new ProduzirBolaMorango(this.maquinaSorvete),2));
        m.addItem(new ItemMenu("Comprar um litro de sorvete",new ProduzirUmLitro(this.maquinaSorvete),3));

        m.gerarMenu();
    }
}

