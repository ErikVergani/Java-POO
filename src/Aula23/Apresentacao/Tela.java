package Aula23.Apresentacao;

import Aula23.Negocio.*;
import Aula23.Persistencia.ContatosDao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class Tela {

    public void show() {
        Menu menu = new Menu();
        menu.addItem(new ItemMenu("Cadastrar contato", new CadastrarContato(), 1));
        menu.addItem(new ItemMenu("Lista de contatos", new ListaContatos(), 2));
        menu.addItem(new ItemMenu("Editar contato", new EditarContato(), 3));
        menu.addItem(new ItemMenu("Deletar contato", new ExcluirContato(), 4));

        menu.gerarMenu();
    }

    public class CadastrarContato implements ProcessarItem {

        @Override
        public void processarItem() {
            //TelaCadastro telaCadastro = new TelaCadastro();
            //telaCadastro.exibir();
            Contato contato = new Contato();
            TelaCadastroGUI telaCadastroGUI = new TelaCadastroGUI();
            telaCadastroGUI.setContentPane(telaCadastroGUI.getter());
            telaCadastroGUI.pack();
            telaCadastroGUI.setContato(contato);
            telaCadastroGUI.setVisible(true);

        }
    }

    public class ListaContatos implements ProcessarItem {

        @Override
        public void processarItem() {
            Impressora impressora = new Impressora();
            ArrayList<Contato> contatos = new ArrayList<>();
            ContatosDao contatosDao = new ContatosDao();
            contatos = contatosDao.readAll();

            impressora.addDocument(new RelatorioContatos(contatos));
            impressora.imprimir();
        }
    }

    public class EditarContato implements ProcessarItem {

        @Override
        public void processarItem() {

            Scanner scanner = new Scanner(System.in);
            ListaContatos listaContatos = new ListaContatos();
            ContatosDao contatosDao = new ContatosDao();
            listaContatos.processarItem();

            System.out.println("---- Editar Contato ----");
            System.out.print("Qual ID do contato que deseja editar ? ");
            int id = scanner.nextInt();
            scanner.nextLine();
            id--;

//            System.out.println("""
//                    O que deseja alterar ?
//                    [1] Nome
//                    [2] Telefone
//                    [3] E-mail""");
//            System.out.print("");
//            int opc = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.print("\nDigite aqui a nova informação: ");
//            String info = scanner.nextLine();
            ArrayList<Contato> c = new ArrayList<>();
            c = contatosDao.readAll();

//            JFrame frame = new JFrame("TelaCadastroGUI");
//            TelaCadastroGUI telaCadastroGUI = new TelaCadastroGUI();
//            frame.setContentPane(telaCadastroGUI.getter());
//            telaCadastroGUI.setContato(c.get(id));
//            telaCadastroGUI.setIdContato(id);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setLocationRelativeTo(null);
//            frame.pack();
//            frame.setVisible(true);

            TelaCadastroGUI telaCadastroGUI = new TelaCadastroGUI();
            telaCadastroGUI.setContentPane(telaCadastroGUI.getter());
            telaCadastroGUI.pack();
            telaCadastroGUI.setContato(c.get(id));
            telaCadastroGUI.setIdContato(id);
            telaCadastroGUI.setVisible(true);

//            if (contatosDao.edit(id, opc, info)) {
//                System.out.println("Contato alterado com sucesso");
//            } else {
//                System.out.println("Não foi possível aterar o contato");
//            }
        }
    }

    public class ExcluirContato implements ProcessarItem {

        @Override
        public void processarItem() {
            Scanner scanner = new Scanner(System.in);
            ListaContatos listaContatos = new ListaContatos();
            ContatosDao contatosDao = new ContatosDao();
            listaContatos.processarItem();

            System.out.println("Qual ID do contato que deseja excluir ?");
            System.out.println("[0] Voltar");

            int id = scanner.nextInt();
            if (id == 0) {
                System.out.println();
            } else {
                if (contatosDao.delete(id)) {
                    System.out.println("Contato deletado com sucesso!");
                } else {
                    System.out.println("Não foi possível deletar o contato!");
                }
            }
        }
    }
}

