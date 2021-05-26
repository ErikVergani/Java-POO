package Aula22.Negocio;

/**
 * @author ErikVergani
 * @date 07/05/2021
 **/

public class ProduzirUmLitro implements ProcessarItem {

    MaquinaSorvete maquinaSorvete;

    public ProduzirUmLitro(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        if (maquinaSorvete.getLeite() >= 560 && maquinaSorvete.getEmulsificante() >= 240 && maquinaSorvete.getChocolate() >= 56 && maquinaSorvete.getMorango() >= 56) {
            maquinaSorvete.useChocolate(56);
            maquinaSorvete.useMorango(56);
            maquinaSorvete.useEmulsificante(240);
            maquinaSorvete.useLeite(560);
            maquinaSorvete.addNumBolasChoco(8);
            maquinaSorvete.addNumBolasMorango(8);
            maquinaSorvete.addLitrosVendidos(1);
            System.out.println("1 litro vendido com sucesso || 8 bolas de chocolate e 8 de morango! ||\n");
        }else {
            System.out.println("Não foi possivel vender 1 litro pois falta algum ingrediente, chame o proprietario");
        }
    }
}