package Aula20;

public class PessoaF extends Pessoa {

    private String dataNasc;
    private int idade;
    private String cpf;
    private String nomeMae;
    private char sexo;
    private Boolean spc;

    public PessoaF(String nome, String endereco, String dataNasc, String cpf, String nomeMae, char sexo, Boolean spc) {
        super(nome, endereco);
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.nomeMae = nomeMae;
        this.sexo = sexo;
        this.spc = spc;
    }
}
