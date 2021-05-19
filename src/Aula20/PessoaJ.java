package Aula20;

public class PessoaJ extends Pessoa{
    private String cnpj;
    private String dono;
    private String nomeFantasia;

    public PessoaJ(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
}
