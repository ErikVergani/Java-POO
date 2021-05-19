package Aula21;

/**
 * @author ErikVergani
 * @date 18/05/2021
 **/

public class Aluno {

    private String nome;
    private String email;

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
