package Aula16;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        Circulo c = new Circulo(4);
        Triangulo t = new Triangulo(4, 5, 6);

        System.out.println(somarArea(c, t));
        ArrayList<FormaGeometrica> list = new ArrayList();
        list.add(t);
        list.add(c);

        for (FormaGeometrica fg : list) {
            System.out.println(fg.getPerimetro());
        }

    }

    public static double somarArea(FormaGeometrica x1, FormaGeometrica x2) {
        return x1.getArea() + x2.getArea();

    }
}
