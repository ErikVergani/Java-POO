package Aula19;

/**
 * @author ErikVergani
 * @date 10/05/2021
 **/

public class SaldoIngredientes implements ProcessarItem {

    MaquinaSorvete maquinaSorvete;

    public SaldoIngredientes(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        System.out.println("Quantidade de essencia de chocolate disponivel: " + maquinaSorvete.getChocolate() + " ml");
        System.out.println("Quantidade de essencia de morango disponivel: " + maquinaSorvete.getMorango() + " ml");
        System.out.println("Quantidade de emulsificante disponivel: " + maquinaSorvete.getEmulsificante() + " ml");
        System.out.println("Quantidade de leite disponivel: " + maquinaSorvete.getLeite() + " ml\n");
    }
}
