package Aula16;

public class Circulo implements FormaGeometrica {

    private int raio;

    public Circulo(int r) {
        this.raio = r;
    }

    public void setRaio(int raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
