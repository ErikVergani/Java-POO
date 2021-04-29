package Aula10;

public class MaquinaAlambique {

    ReservatoriosAlambique tankCaldo;
    ReservatoriosAlambique tankResiduos;
    ReservatoriosAlambique tankCachaca;
    ReservatoriosAlambique garrafas;
    private int machineUsages;

    public MaquinaAlambique() {
        this.tankCaldo = new ReservatoriosAlambique(100000);
        this.tankResiduos = new ReservatoriosAlambique(100000);
        this.tankCachaca = new ReservatoriosAlambique(500000);
        this.garrafas = new ReservatoriosAlambique(750);
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
