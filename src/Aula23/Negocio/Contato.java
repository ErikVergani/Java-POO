package Aula23.Negocio;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class Contato implements Printable {

    private String nome, telefone, email;
    private ArrayList<String> linhas;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.linhas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return getNome() + ";" + getTelefone() + ";" + getEmail();
    }

    @Override
    public String getProximaLinha() {
        String linha = null;
        if (linhas.size() > 0) {
            linha = linhas.remove(0);
        }
        return linha;
    }

    @Override
    public void gerarDocumento() {
        linhas.clear();
        linhas.add("- - - Nome: " + getNome());
        linhas.add("- - - Telefone: " + getTelefone());
        linhas.add("- - - Email: " + getEmail());
        linhas.add("");
    }
}
