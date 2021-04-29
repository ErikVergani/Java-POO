package Aula16;

public class Triangulo implements FormaGeometrica {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = 0;
        this.ladoB = 0;
        this.ladoC = 0;
        this.setTriangulo(ladoA, ladoB, ladoC);
    }

    private boolean isValido(double a, double b, double c) {
        double maior = Math.max(a, Math.max(b, c));
        double soma = a + b + c - maior;
        return (soma > maior);
    }

    public void setTriangulo(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if (isValido(a, b, c)) {
                this.ladoA = a;
                this.ladoB = b;
                this.ladoC = c;
            }
        }
    }

    public void setLadoA(double ladoA) {
        if (ladoA > 0 && isValido(ladoA, this.ladoB, this.ladoC)) {
            this.ladoA = ladoA;
        }
    }

    public void setLadoB(double ladoB) {
        if (ladoB > 0 && isValido(this.ladoA, ladoB, this.ladoC)) {
            this.ladoB = ladoB;
        }
    }

    public void setLadoC(double ladoC) {
        if (ladoC > 0 && isValido(this.ladoA, this.ladoB, ladoC)) {
            this.ladoC = ladoC;
        }
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    @Override
    public double getPerimetro() {
        double p = ladoA + ladoB + ladoC;
        return p;
    }

    @Override
    public double getArea() {
        double sp = getPerimetro() / 2;
        double area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));
        return area;
    }

}