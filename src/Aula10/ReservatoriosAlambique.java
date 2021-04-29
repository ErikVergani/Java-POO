package Aula10;

public class ReservatoriosAlambique {

    private double limit, amount;

    public ReservatoriosAlambique(double capacidade) {
        this.limit = capacidade;
    }

    //SETTERS
    public void addAmount(double quantidade) {
        this.amount += quantidade;
    }

    public void Flush() {
        this.amount = 0;
    }
    // GETTERS

    public double getLimit() {
        return this.limit;
    }

    public double getAmount() {
        return amount;
    }
}
