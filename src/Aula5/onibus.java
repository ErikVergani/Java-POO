package Aula5;

public class onibus {
    int limiteDisponivel = 30;
    double valorTotalPassagem = 0;

    public void setLimiteDisponivel(int x) {
        limiteDisponivel -= x;
        if (limiteDisponivel < 0) {
            System.out.println("Passagem negada, lotação maxima atingida!");
            limiteDisponivel = 0;
        } else if (limiteDisponivel > 30) {
            System.out.println("Limite máximo é de " + limiteDisponivel + " pessoas");
            limiteDisponivel = 30;
        }
    }

    public int getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setValorTotalPassagem(int x) {
        if (x > 0) {
            valorTotalPassagem += 3.50 * x;
        }
    }

    public double getValorTotalPassagem() {
        return valorTotalPassagem;
    }

}