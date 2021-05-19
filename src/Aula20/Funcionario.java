package Aula20;

public class Funcionario extends PessoaF{

    private double salario;
    private double ctps;
    private String dataAdm;

    public Funcionario(String nome, String endereco, String dataNasc, String cpf, String nomeMae, char sexo, Boolean spc, double ctps, String dataAdm) {
        super(nome, endereco, dataNasc, cpf, nomeMae, sexo, spc);
        this.ctps = ctps;
        this.dataAdm = dataAdm;
    }
}
