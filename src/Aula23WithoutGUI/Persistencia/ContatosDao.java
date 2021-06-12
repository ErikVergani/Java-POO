package Aula23WithoutGUI.Persistencia;

import Aula23WithoutGUI.Negocio.Arquivo;
import Aula23WithoutGUI.Negocio.Contato;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class ContatosDao {

    public ArrayList<Contato> readAll() {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23WithoutGUI\\Persistencia\\Contatos.txt");
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
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23WithoutGUI\\Persistencia\\Contatos.txt");
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

    public boolean edit(int id, int opc, String info) {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23WithoutGUI\\Persistencia" + "\\Contatos.txt");
        ArrayList<Contato> contatosCad = readAll();
        boolean result = false;
        id--;

        if (arquivo.abrirLeitura()) {
            if (opc == 1) {
                contatosCad.get(id).setNome(info);
            } else if (opc == 2) {
                contatosCad.get(id).setTelefone(info);
            } else if (opc == 3) {
                contatosCad.get(id).setEmail(info);
            }
        }
        arquivo.fecharArquivo();

        if (arquivo.abrirEscrita()) {
            for (Contato c : contatosCad) {
                arquivo.escreverLinha(c.toString());
            }
            result = true;
        }
        arquivo.fecharArquivo();
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        Arquivo arq = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula23WithoutGUI\\Persistencia" + "\\Contatos.txt");
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
