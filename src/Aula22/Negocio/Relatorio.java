package Aula22.Negocio;

/**
 * @author ErikVergani
 * @date 09/05/2021
 **/

public class Relatorio implements ProcessarItem {

    private MaquinaSorvete maquinaSorvete;

    public Relatorio(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        System.out.println("Bolas chocolate vendidas: " + maquinaSorvete.getNumBolasChoco());
        System.out.println("Bolas Morango vendidas: " + maquinaSorvete.getNumBolasMorango());
        System.out.println("Litros de sorvete vendidos: "+maquinaSorvete.getLitrosVendidos()+"\n");
    }
}
