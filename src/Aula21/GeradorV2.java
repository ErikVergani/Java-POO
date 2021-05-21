package Aula21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ErikVergani
 * @date 20/05/2021
 **/

public class GeradorV2 {

    private Arquivo arquivo;
    private Arquivo arquivoGrupos;
    private ArrayList<Aluno> alunos;
    private ArrayList<Grupo> grupos;

    public GeradorV2() {
        this.arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula21\\alunosPoo.csv");
        this.arquivoGrupos = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula21\\grupos" + ".txt");
        this.alunos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public int qtdePessoas() {
        int num = 0;

        if (arquivo.abrirLeitura()) {

            for (int i = -1; i < num; i++) {
                while (arquivo.lerLinha() != null) {
                    num++;
                }
            }
            System.out.println("Quantidade de pessoas: " + num);
            arquivo.fecharArquivo();
        } else {
            System.out.println("Error");
        }
        return num;
    }

    public void embaralhar() {
        int qtdeLinhas = qtdePessoas();
        arquivo.abrirLeitura();
        for (int i = 0; i < qtdeLinhas; i++) {
            String[] nomeEmail = arquivo.lerLinha().split(";");
            alunos.add(new Aluno(nomeEmail[0], nomeEmail[1]));
        }
        Collections.shuffle(alunos);
        arquivo.fecharArquivo();
    }

    public void gerarGrupo() {

        Scanner input = new Scanner(System.in);
        int alunosNoGrupo = 0;
        System.out.println("Quantos alunos terá cada grupo?");
        alunosNoGrupo = input.nextInt();
        input.nextLine();

        //calculos
        int qtdeGrupos = alunos.size() / alunosNoGrupo;
        int sobraAlunos = alunos.size() % alunosNoGrupo;

        // cria os crupos
        for (int i = 0; i < qtdeGrupos; i++) {
            Grupo grupo = new Grupo((i + 1));
            for (int j = 0; j < alunosNoGrupo; j++) {
                int escolha = (int) (Math.random() * alunos.size());
                grupo.addAluno(alunos.get(escolha).getNome(), alunos.get(escolha).getEmail());
                alunos.remove(escolha);
            }
            grupos.add(grupo);
        }
        if(alunos.size() != 0 ){
            for (int i = 0; i < alunos.size() ; i++) {
                int grupoEscolhido = (int) (Math.random() * grupos.size());
                for (int j = 0; j < alunos.size() ; j++) {
                    grupos.get(grupoEscolhido).addAluno(alunos.get(j).getNome(),alunos.get(j).getEmail());
                }
            }
        }
    }

    public void mostrarGrupos(){
        for (int i = 0; i < grupos.size() ; i++) {
            System.out.println(grupos.get(i).getNomeGrupo());
            for (int j = 0; j <grupos.get(i).getAlunos().size() ; j++) {
                System.out.println((j+1)+"- "+grupos.get(i).getAlunos().get(j).getNome());
            }
        }
    }
}
