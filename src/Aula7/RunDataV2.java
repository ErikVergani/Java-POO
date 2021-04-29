package Aula7;

import java.util.Scanner;

public class RunDataV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DateV2 data = new DateV2();

        System.out.println("Insira um ano:");
        data.setYear(input.nextInt());
        System.out.println("Insira um mês:");
        data.setMonth(input.nextInt());
        System.out.println("Insira um dia:");
        data.setDay(input.nextInt());
        if (data.ValidateMonth()) {
            System.out.println(data.getDay() + "/" + data.getMonth() + "/" + data.getYear() + " é uma data válida");
        } else {
            System.out.println("Data inválida");
        }
    }
}
