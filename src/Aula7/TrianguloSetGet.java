package Aula7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrianguloSetGet {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double perimetro;
    private double area;


    public TrianguloSetGet() {
        ladoA = 0;
        ladoB = 0;
        ladoC = 0;
        perimetro = 0;
        area = 0;
    }

    public double getPerimetro() {
        return (getLadoA()+getLadoB()+getLadoC());
    }

    public double getArea() {
        double sp = getPerimetro() / 2;
        double area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));
        return area;
    }
}
