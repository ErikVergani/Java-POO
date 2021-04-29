package Aula4;
public class trianguloCalculo {
    double ladoA = 0;
    double ladoB = 0;
    double ladoC = 0;

    public double calcularPerimetro() {
        double perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }

    public double calcularArea() {
        double sp = calcularPerimetro() / 2;
        double area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));
        return area;
    }
}
