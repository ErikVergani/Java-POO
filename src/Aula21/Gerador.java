package Aula21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
    }

    public void gerarGrupos() {
        Collections.shuffle(alunos); // embaralha a lista de alunos
        Scanner input = new Scanner(System.in);
        int alunosNoGrupo = 0;
        System.out.println("Quantos alunos terá cada grupo?");
        alunosNoGrupo = input.nextInt();
        input.nextLine();

        //calculos
        int qtdeGrupos = alunos.size() / alunosNoGrupo;
        int sobraAlunos = alunos.size() % alunosNoGrupo;

        for (int i = 0; i < qtdeGrupos; i++) {
            System.out.println("\nGrupo " + (i + 1));
            System.out.println("___________________");
            for (int j = 0; j < alunosNoGrupo; j++) {
                int escolha = (int) (Math.random() * alunos.size());
                System.out.println(alunos.get(escolha).getNome());
                alunos.remove(escolha);

            }
            System.out.println("___________________\n");

        }
        System.out.println("Num grupos: " + qtdeGrupos);
        System.out.println("Sobraram: " + sobraAlunos);
        System.out.println("Alunos que sobraram\n");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
            System.out.println("\ngrupo " + (qtdeGrupos+1));
            System.out.println("_________");
            for (int i = 0; i < sobraAlunos; i++) {
                System.out.println(alunos.get(i).getNome());
            }
    }
}
