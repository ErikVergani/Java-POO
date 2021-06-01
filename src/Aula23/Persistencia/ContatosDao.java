package Aula23.Persistencia;

import Aula23.Negocio.Arquivo;
import Aula23.Negocio.Contato;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class ContatosDao {

    public void save(Contato contato) {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23\\Persistencia\\Contatos.txt");
        ArrayList<Contato> contatos = new ArrayList<>();

        if (arquivo.abrirLeitura()) {
            String contatoSalvo = arquivo.lerLinha();
            while (contatoSalvo != null) {
                String[] cs = contatoSalvo.split(";");
                contatos.add(new Contato(cs[0], cs[1], cs[2]));
                contatoSalvo = arquivo.lerLinha();
            }
            contatos.add(contato);
            arquivo.fecharArquivo();
            if (arquivo.abrirEscrita()) {
                for (Contato c : contatos) {
                    arquivo.escreverLinha(c.toString());
                }
            }
            arquivo.fecharArquivo();
        }

    }

    public ArrayList<Contato> read() {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23\\Persistencia\\Contatos.txt");
        ArrayList<Contato> contatos = new ArrayList<>();

        if (arquivo.abrirLeitura()) {
            String contatoSalvo = arquivo.lerLinha();
            while (contatoSalvo != null) {
                String[] cs = contatoSalvo.split(";");
                contatos.add(new Contato(cs[0], cs[1], cs[2]));
                contatoSalvo = arquivo.lerLinha();
            }
        }
        return contatos;
    }
}

