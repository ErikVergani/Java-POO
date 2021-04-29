package Aula16;
public class Retangulo implements FormaGeometrica {

    private int base;
    private int altura;

    public Retangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public void setBase(int base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    @Override
    public double getArea() {
        return this.altura * this.altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.base * this.altura);
    }

}
