package Aula23.Apresentacao;
import Aula23.Negocio.Contato;
import Aula23.Negocio.Printable;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 01/06/2021
 **/


public class RelatorioContatos implements Printable {

    private ArrayList<Contato> contatos;
    private int proxLinha;

    public RelatorioContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
        this.proxLinha = 0;
    }

    @Override
    public String getProximaLinha() {
        String linha = null;
        if (proxLinha < contatos.size()) {
            Contato c = contatos.get(proxLinha);
            proxLinha++;

            linha =
                    "\n- - - ID: "+proxLinha+"\n" + "- - - Nome: "+c.getNome() + "\n- - - Telefone: " + c.getTelefone()+"\n- - - Email: "+c.getEmail();
        }
        return linha;
    }

    @Override
    public void gerarDocumento() {

    }
}
