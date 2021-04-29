package Aula13;

import java.util.ArrayList;

public class Pedido {

    private String nome, endereco, tel;
    private ArrayList<Pratos> pratos;

    public Pedido() {

    }

    public void addPrato(int opcao, int quantidade, String obs) {
        Pratos prato = new Pratos();

        selecPrato(opcao, prato);
        prato.setQntdPrato(quantidade);
        prato.setObsPrato(obs);
        pratos.add(prato);
    }

    private void selecPrato(int opcao, Pratos prato) {
        if (opcao == 1) {
            prato.setNomePrato("Pizza Grande");
        } else if (opcao == 2) {
            prato.setNomePrato("Xis Filé");
        } else if (opcao == 3) {
            prato.setNomePrato("Prato Executivo");
        } else {
            prato.setNomePrato("A la Minuta");
        }
    }
    //setters

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPratos(ArrayList<Pratos> pratos) {
        this.pratos = pratos;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //getters
    public ArrayList<Pratos> getPratos() {
        return pratos;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }
}
