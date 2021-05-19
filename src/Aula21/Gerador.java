package Aula21;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 18/05/2021
 **/

public class Gerador {

    private ArrayList<Aluno> alunos;
    private Arquivo arquivo;

    public Gerador() {
        this.alunos = new ArrayList<>();
        this.arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula21\\alunosPoo.csv");
    }

    public int qntdAlunos() {
        int aux = 0;

        if (arquivo.abrirLeitura()) {

            for (int i = -1; i < aux; i++) {
                while (arquivo.lerLinha() != null) {
                    aux++;
                }
            }

            System.out.println("Quantidade Alunos: " + aux);
            arquivo.fecharArquivo();
        } else {
            System.out.println("Error");
        }
        return aux;
    }

    public void addAlunos() {
        int qtdeLinhas = qntdAlunos();
        arquivo.abrirLeitura();
        for (int i = 0; i < qtdeLinhas; i++) {
            String[] nomeEmail = arquivo.lerLinha().split(";");
            alunos.add(new Aluno(nomeEmail[0], nomeEmail[1]));
        }
        for (Aluno alunos : alunos) {
            System.out.println(alunos.getNome() + " -> " + alunos.getEmail());
        }
    }

    public void gerarGrupos() {
        
    }
}
