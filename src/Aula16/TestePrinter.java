package Aula16;

public class TestePrinter {

    public static void main(String[] args) {
        Printable a = new Nf("Erik","29/04/2021",2510);
        Impressora p = new Impressora();
        p.addDocument(a);
        p.imprimir();
    }
}
