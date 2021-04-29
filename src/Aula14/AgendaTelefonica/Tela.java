package Aula14.AgendaTelefonica;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Tela {

    AgendaTelefonica agendaTelefonica;

    public Tela() {
        this.agendaTelefonica = new AgendaTelefonica();
    }

    public void show() {
        Scanner input = new Scanner(System.in);
        int op = 0;
        while (true) {
            System.out.println("1- add contato");
            System.out.println("2 pesquisar contato");
            op = input.nextInt();
            input.nextLine();
            if (op == 1) {
                for (int i = 0; i < 5 ; i++) {

                    System.out.println("Insira o nome do contato");
                    String nome = input.nextLine();
                    System.out.printf("Insira o telefone");
                    float num = input.nextFloat();
                    input.nextLine();
                    agendaTelefonica.adicionarContato(nome, num);
                }
            } else {
                for (int i = 0; i < agendaTelefonica.getAgendaDeContatos().size(); i++) {

                    System.out.println(agendaTelefonica.getAgendaDeContatos().get(i).getNome().toUpperCase());
                }
            }
        }
    }
}
