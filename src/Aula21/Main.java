package Aula21;

/**
 * @author ErikVergani
 * @date 18/05/2021
 **/

public class Main {

    public static void main(String[] args) {
    Gerador gerador = new Gerador();
    Tela tela = new Tela(gerador);
    tela.show();
    }

}
