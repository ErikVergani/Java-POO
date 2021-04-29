package Aula9;

public class CasaDeShowsControles {

    private int eles, elas, lotacao;

    public CasaDeShowsControles() {
        this.elas = 0;
        this.eles = 0;
        this.lotacao = 200;
    }

    public boolean addElas() {
        boolean validation = false;
        if(this.lotacao > 0){
            this.elas++;
            this.lotacao--;
            validation = true;
        }
        return validation;
    }

    public boolean addEles() {
        boolean validation = false;
        if(this.lotacao > 0){
            this.eles++;
            this.lotacao--;
            validation = true;
        }
        return validation;
    }

    public boolean sairDaCasa() {
        boolean validation = false;
        if(this.lotacao< 200){ // deixar esse 200 conforme o limite do locacao la de cima do construtor...
            this.lotacao++;
            validation = true;
        }
        return validation;
    }

    public int getValorCaixa() {
        return ((this.elas * 40) + (this.eles * 55));
    }

    public int getLotacao() {
        return lotacao;
    }

    public int getTotalPessoas() {
        return elas + eles;
    }

}
