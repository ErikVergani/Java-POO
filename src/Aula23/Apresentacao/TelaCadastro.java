package Aula23.Apresentacao;

import Aula23.Negocio.Contato;
import Aula23.Persistencia.ContatosDao;

import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 01/06/2021
 **/

public class TelaCadastro {

    public void exibir() {

        Scanner scanner = new Scanner(System.in);
        ContatosDao contatosDao = new ContatosDao();

        System.out.println("Insira o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Insira o numero de " + nome);
        String numero = scanner.nextLine();
        System.out.println("Insira o email de " + nome);
        String email = scanner.nextLine();

        contatosDao.save(new Contato(nome, numero, email));
        System.out.println("\nContato adicionado com sucesso!");

    }
}