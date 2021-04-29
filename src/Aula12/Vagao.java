package Aula12;

public class Vagao {

    private int cargaMax;
    private int cargaAtual;
    private String tipoCarga;


    public Vagao() {
        cargaMax = 50;
        cargaAtual = 0;
        tipoCarga = " ";
    }

    // setters

    public boolean setCargaAtual(int cargaAtual) {
        boolean validation = false;
        if (cargaAtual <= getCargaMax() && (cargaAtual + getCargaAtual()) <= getCargaMax()) {
            this.cargaAtual += cargaAtual;
            validation = true;
        }
        return validation;
    }
    public boolean descarregar(int desc){
        boolean validation = false;
        if(getCargaAtual()>= desc){
            this.cargaAtual -=desc;
            validation = true;
        }
        return validation;
    }

    public boolean setTipoCarga(int tipoCarga) {
        boolean validation = false;
        if (tipoCarga == 1) {
            this.tipoCarga = "Grãos";
            validation = true;
        } else if (tipoCarga == 2) {
            this.tipoCarga = "Minério";
            validation = true;
        } else if (tipoCarga == 3) {
            this.tipoCarga = "Manufaturados";
            validation = true;
        }
        return validation;
    }

    // getters
    public int getCargaMax() {
        return cargaMax;
    }

    public int getCargaAtual() {
        return cargaAtual;
    }

    public String getTipoCarga() {
        return tipoCarga;

    }
}
