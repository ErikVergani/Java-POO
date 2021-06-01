package Aula23.Apresentacao;

import Aula23.Negocio.*;
import Aula23.Persistencia.ContatosDao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class Tela {

    public void show(){
        Menu menu = new Menu();
        menu.addItem(new ItemMenu("Cadastrar contato", new CadastrarContato(),1));
        menu.addItem(new ItemMenu("Lista de contatos",new ListaContatos(),2));
        menu.gerarMenu();
    }
    public class CadastrarContato implements ProcessarItem {

        @Override
        public void processarItem() {
            Scanner scanner = new Scanner(System.in);
            ContatosDao contatosDao = new ContatosDao();

            System.out.println("Insira o nome do contato: ");
            String nome = scanner.nextLine();
            System.out.println("Insira o numero de " + nome);
            String numero = scanner.nextLine();
            System.out.println("Insira o email de " + nome);
            String email = scanner.nextLine();

            contatosDao.save(new Contato(nome,numero,email));
            System.out.println("\nContato adicionado com sucesso!");
        }
    }

    public class ListaContatos implements ProcessarItem {

        @Override
        public void processarItem() {
            Impressora impressora = new Impressora();
            ArrayList<Contato> contatos = new ArrayList<>();
            ContatosDao contatosDao = new ContatosDao();

            for (Contato contato : contatos = contatosDao.read()) {
                impressora.addDocument(contato);
                impressora.imprimir();
            }

        }
    }
}
