package Aula20;

public class Motorista extends Funcionario{
    private int numCnh;
    private String validadeCnh;

    public Motorista(String nome, String endereco, String dataNasc, String cpf, String nomeMae, char sexo, Boolean spc, double ctps, String dataAdm, int numCnh) {
        super(nome, endereco, dataNasc, cpf, nomeMae, sexo, spc, ctps, dataAdm);
        this.numCnh = numCnh;
    }
}
