package Aula21;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ErikVergani
 * @date 20/05/2021
 **/

public class Grupo {

    private ArrayList<Aluno> alunos;
    private String nomeGrupo;

    public Grupo(int numGrupo) {
        this.alunos = new ArrayList<>();
        nomeGrupo = "\nGrupo: " + numGrupo;
    }

    public void addAluno(String nome,String email) {
        alunos.add(new Aluno(nome, email));

    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }
}
