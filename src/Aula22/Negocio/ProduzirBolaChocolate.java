package Aula22.Negocio;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class ProduzirBolaChocolate implements ProcessarItem {

    MaquinaSorvete maquinaSorvete;

    public ProduzirBolaChocolate(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        if (maquinaSorvete.getChocolate() >= 7 && maquinaSorvete.getEmulsificante() >= 15 && maquinaSorvete.getLeite() >= 35) {
            maquinaSorvete.useChocolate(7);
            maquinaSorvete.useEmulsificante(15);
            maquinaSorvete.useLeite(35);
            maquinaSorvete.addNumBolasChoco(1);
            System.out.println("1 bola de chocolate foi vendida!\n");
        } else {
            System.out.println("Não foi possivel vender a bola de chocolate pois algum ingrediente está faltando");
        }
    }
}
