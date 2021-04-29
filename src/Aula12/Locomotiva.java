package Aula12;

public class Locomotiva {

    Vagao[] vagao;

    private double combustivel;

    private int odometro;
    private int kmViagem;
    private int numVagoes;

    public Locomotiva() {
        vagao = new Vagao[25];
         combustivel= 0;
        odometro = 0;
        kmViagem = 0;
    }

    public int getNumVagoes() {
        return numVagoes;
    }

    public int getOdometro() {
        return odometro;
    }

    public double getResComb() {
        return combustivel;
    }

    public int getKmViagem() {
        return kmViagem;
    }


    public void addOdometro(){
        this.odometro++;
    }

    public void addResComb(double resComb) {
        this.combustivel += resComb;
    }
    public void removeKmViagem() {
        this.kmViagem--;
    }

    public void setResComb(int resComb) {
        this.combustivel = resComb;
    }

    public void setNumVagoes(int numVagoes) {
        this.numVagoes = numVagoes;
    }

    public void setKmViagem(int kmViagem) {
        this.kmViagem = kmViagem;
    }

    public void abastecerLocomotiva() {
        this.combustivel = 2000;
    }
    public boolean consumirComb(){
        boolean validation = false;
        double consumo = 1.2+(0.4*getNumVagoes());
        if(combustivel >= consumo){
            combustivel -= consumo;
            validation = true;
        }
        return validation;
    }


    public boolean andar() {
        boolean result = false;
        while (true) {
            if (!consumirComb() || getKmViagem()<=0) {
                break;
            }
            addOdometro();
            removeKmViagem();
            result = true;
        }
        return result;
    }
}
