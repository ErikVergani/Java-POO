package Aula7;

import java.util.Scanner;

public class testeTv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int acao = 0;

        tv tv = new tv();


        while(true){
            System.out.println("1- Volume--");
            System.out.println("2- Volume++");
            System.out.println("4- Canal-- ");
            System.out.println("5- Canal++");
            System.out.println("7- Desliga");
            System.out.println("8- Liga");
            acao = input.nextInt();
        }
    }
}
