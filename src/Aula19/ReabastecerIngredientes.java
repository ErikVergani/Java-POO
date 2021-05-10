package Aula19;

/**
 * @author ErikVergani
 * @date 10/05/2021
 **/

public class ReabastecerIngredientes implements ProcessarItem{
MaquinaSorvete maquinaSorvete;

    public ReabastecerIngredientes(MaquinaSorvete maquinaSorvete) {
        this.maquinaSorvete = maquinaSorvete;
    }

    @Override
    public void processarItem() {
        maquinaSorvete.reabastecer();
        System.out.println("Todos os ingrediente foram abastecidos\n");
    }
}
