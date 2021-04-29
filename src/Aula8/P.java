package Aula8;

import java.util.Scanner;

public class P {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PlanilhaV2 plan = new PlanilhaV2();

        // grava os nomes
        for (int i = 0; i < plan.getLength(); i++) {
            System.out.println("Insira o nome do Atleta.");
            plan.setNomes(i, input.nextLine());
        }
        System.out.println("Quantas passagens cada atleta terá que fazer?");
        plan.setPassagens(input.nextInt());
        for (int j = 0; j < plan.getLength(); j++) {
            for (int i = 0; i < plan.getPassagens(); i++) {
                System.out.println("Insira o tempo " + i + " do atleta " + plan.getNomes()[j]);
                plan.setTempos(i, j, input.nextDouble());
            }
        }

        for (int i = 0; i < plan.getLength(); i++) {
            System.out.println("nome: " + plan.getNomes()[i] + " | número do atleta: " + i + " | passagens: " + plan.getPassagens());
        }
        System.out.println();
        System.out.println("Média geral do tempo: " + plan.getMediaGeral() + " segundos.");
        System.out.println("O melhor tempo foi de " + plan.getMenorTempo() + " segundos e quem conseguiu foi o atleta" + " " + plan.getNomes()[plan.getMelhorAtleta()]);
        System.out.println("O pior tempo foi de " + plan.getMaiorTempo() + " segundos e quem conseguiu foi o atleta " + plan.getNomes()[plan.getPiorAtleta()]);
        System.out.println("Os atletas que conseguiram fazer 100metros em menos de 10seg foram: ");
        System.out.println();
        for (int i = 0; i < plan.getLessThan().length; i++) {
            System.out.println(plan.getNomes()[plan.catchLessThan()[i]]);
        }
    }
}
