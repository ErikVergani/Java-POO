package Aula20;
/*
* 1) Crie uma classe para representar uma Pessoa, contendo os atributos comuns a qualquer pessoa como, por exemplo,
* nome, endereço, telefone, etc.

* 2) Crie uma classe para modelar uma Pessoa Física, derivada de Pessoa, com os atributos típicos de uma pessoa física
*  como, por exemplo, salário, data de nascimento, nome do mãe, etc.

* 3) Crie uma classe para modelar uma Pessoa Jurídica, derivada de Pessoa, com os atributos típicos de uma pessoa
* jurídica (uma empresa) como, por exemplo, CNPJ, nome dos sócios, nome de fantasia, etc.

* 4) Crie uma classe Funcionário que é herdeira de Pessoa Física e tem (a mais) o número da CTPS, data de admissão,
*  salário e outros atributos típicos de funcionários.

* 5) Crie uma classe Vendedor que é herdeira de Funcionário e tem adicionalmente o percentual de comissão
*  que recebe sobre as vendas.

* 6) Crie uma classe Motorista que é herdeira de Funcionário e tem adicionalmente o número da CNH
* e data de vencimento da CNH.*/
public class Pessoa {
    private String nome;
    private String endereco;


    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}