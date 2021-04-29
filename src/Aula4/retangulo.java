package Aula4;
public class retangulo {
    double base;
    double altura;

    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    public double calcularPerimetro() {
        return base * 2 + altura * 2;
    }
}
