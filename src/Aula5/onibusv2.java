package Aula5;

public class onibusv2 {
    int passageiros = 0;
    int limite = 40;
    double valorPassagens = 0;

    public void addPassageiros(int x) {
        passageiros += x;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int x){
       passageiros=x;
    }

    public int getLimite() {
        return limite;
    }

    public double setValorTotalPassagem( ) {
        valorPassagens += passageiros*2;
        return valorPassagens;
    }
}
