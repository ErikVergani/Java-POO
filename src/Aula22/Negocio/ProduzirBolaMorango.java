package Aula22.Negocio;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class ProduzirBolaMorango implements ProcessarItem {

    MaquinaSorvete maquinaSorvete;

    public ProduzirBolaMorango(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        if (maquinaSorvete.getMorango() >= 7 && maquinaSorvete.getEmulsificante() >= 15 && maquinaSorvete.getLeite() >= 35) {
            maquinaSorvete.useMorango(7);
            maquinaSorvete.useEmulsificante(15);
            maquinaSorvete.useLeite(35);
            maquinaSorvete.addNumBolasMorango(1);
            System.out.println("1 bola de morango foi vendida!\n");
        }else{
            System.out.println("Não foi possivel vender a bola de morango pois algum ingrediente está faltando");
        }
    }
}