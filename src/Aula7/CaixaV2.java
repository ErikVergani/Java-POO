package Aula7;

public class CaixaV2 {

    private double consumo = 0;

    public CaixaV2() {
        consumo = 0;
    }

    public boolean setConsumo(double consumo) {
        boolean ok = false;
        if (consumo > 0) {
            this.consumo += consumo;
            ok = true;
        }
        return ok;
    }

    public double getConsumo() {
        return consumo;
    }

    public void isZerarConsumo() {
        this.consumo = 0;
    }

}
