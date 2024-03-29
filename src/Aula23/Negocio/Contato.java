package Aula23.Negocio;

/**
 * @author ErikVergani
 * @date 27/05/2021
 **/

public class Contato {

    private String nome, telefone, email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public Contato()
    {
        this.nome = "";
        this.email = "";
        this.telefone = "";
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getNome() + ";" + getTelefone() + ";" + getEmail();
    }

}
