package Aula4;
public class cancela {
    int numCarro = 0;
    int numMoto = 0;

    public double arrecadadoCarro() {
        double vCarro = 4.60;
        return numCarro * vCarro;
    }

    public double arrecadadoMoto() {
        double vMoto = 2.30;
        return numMoto * vMoto;
    }

    public double totalArrecadado() {
        double total = arrecadadoMoto() + arrecadadoCarro();
        return total;
    }
}