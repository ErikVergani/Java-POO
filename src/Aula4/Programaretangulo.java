package Aula4;
import java.util.Scanner;
       
public class Programaretangulo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base = input.nextDouble();
        double alt = input.nextDouble();
        double area = base*alt;
        
        System.out.println("Area é de: "+area);
               
    }
}
