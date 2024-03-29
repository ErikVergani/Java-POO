package Aula23.Persistencia;

import Aula23.Negocio.Arquivo;
import Aula23.Negocio.Contato;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class ContatosDao {

    public ArrayList<Contato> readAll() {
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

    public void save(Contato contato) {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23\\Persistencia\\Contatos.txt");
        ArrayList<Contato> contatos = readAll();

        contatos.add(contato);
        arquivo.fecharArquivo();
        if (arquivo.abrirEscrita()) {
            for (Contato c : contatos) {
                arquivo.escreverLinha(c.toString());
            }
        }
        arquivo.fecharArquivo();
    }

    public void edit(int id, /*int opc, String info*/String nome,String telefone,String email) {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23\\Persistencia" + "\\Contatos.txt");
        ArrayList<Contato> contatosCad = readAll();

        contatosCad.get(id).setNome(nome);
        contatosCad.get(id).setTelefone(telefone);
        contatosCad.get(id).setEmail(email);

        if (arquivo.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arquivo.escreverLinha(c.toString());
            }
            arquivo.fecharArquivo();
        }
    }


    public boolean delete(int id) {
        boolean result = false;
        Arquivo arq = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23\\Persistencia" + "\\Contatos.txt");
        ArrayList<Contato> contatosCad = readAll();
        id--;

        contatosCad.remove(id);

        if (arq.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arq.escreverLinha(c.toString());
            }
            result = true;
        }
        arq.fecharArquivo();
        return result;
    }
}
