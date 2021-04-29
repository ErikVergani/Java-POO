package Aula4;
import java.util.Scanner;
       
public class Programaretangulov2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base = input.nextDouble();
        double alt = input.nextDouble();
        
        retangulo r = new retangulo();
        r.altura = alt;
        r.base = base;
     
        double area = r.calcularArea();
        System.out.println("Area é de: "+area);
               
    }
}
