package Aula14.AgendaTelefonica;

public class Contato {

    private String nome;
    private float tel;

    public Contato(String nome, float tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }
    public float getTel() {
        return tel;
    }

}
