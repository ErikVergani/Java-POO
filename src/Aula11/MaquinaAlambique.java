package Aula11;

public class MaquinaAlambique {

    ReservatoriosAlambique tankCaldo;
    ReservatoriosAlambique tankResiduos;
    ReservatoriosAlambique tankCachaca;
    ReservatoriosAlambique garrafas;
    private int machineUsages;

    public MaquinaAlambique(double limiteCaldo, double limiteResiduo, double limiteCachaca, double limiteGarrafa) {
        this.tankCaldo = new ReservatoriosAlambique(limiteCaldo);
        this.tankResiduos = new ReservatoriosAlambique(limiteResiduo);
        this.tankCachaca = new ReservatoriosAlambique(limiteCachaca);
        this.garrafas = new ReservatoriosAlambique(limiteGarrafa);
        this.machineUsages = 0;
    }

    public boolean abastecerCaldo(double quantidade) {
        boolean validation = false;
        if (quantidade <= tankCaldo.getLimit() && (quantidade + tankCaldo.getAmount()) <= tankCaldo.getLimit()) {
            tankCaldo.addAmount(quantidade);
            validation = true;
        }
        return validation;
    }

    public boolean fazerCachaca() {
        boolean validation = false;
        while (true) {
            if (this.tankCaldo.getAmount() >= 1000 && checkReservatorioCachaca() && checkReservatorioResiduos()) {
                this.tankCaldo.addAmount(-1000);
                this.tankResiduos.addAmount(200);
                this.tankCachaca.addAmount(400);
                validation = true;
                this.machineUsages++;
            } else {
                break;
            }
        }
        return validation;
    }

    public boolean engarrafarCachaca() {
        boolean validation = false;
        if (this.tankCachaca.getAmount() >= this.garrafas.getLimit()) {
            this.tankCachaca.addAmount(-this.garrafas.getLimit());
            this.garrafas.addAmount(1);
            validation = true;
        }
        return validation;
    }

    // checkers

    public boolean checkReservatorioResiduos() {
        boolean validation = false;
        if ((this.tankResiduos.getAmount() + (this.tankCaldo.getAmount() * 0.2)) <= this.tankResiduos.getLimit()) {
            validation = true;
        }
        return validation;
    }

    public boolean checkReservatorioCachaca() {
        boolean validation = false;
        if ((this.tankCachaca.getAmount() + (this.tankCaldo.getAmount() * 0.4)) <= this.tankCachaca.getLimit()) {
            validation = true;
        }
        return validation;
    }

    //getters
    public int getmachineUsages() {
        return this.machineUsages;
    }
}
