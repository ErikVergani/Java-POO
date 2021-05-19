package Aula20;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String endereco, String dataNasc, String cpf, String nomeMae, char sexo, Boolean spc, double ctps, String dataAdm, double comissao) {
        super(nome, endereco, dataNasc, cpf, nomeMae, sexo, spc, ctps, dataAdm);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
