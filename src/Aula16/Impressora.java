package Aula16;

import java.util.ArrayList;

public class Impressora {

    private ArrayList<Printable> filaImpressao;

    public Impressora() {
        this.filaImpressao = new ArrayList();
    }

    public void addDocument(Printable arq) {
        filaImpressao.add(arq);
    }

    public void imprimir() {
        if (filaImpressao.size() > 0) {
            Printable doc = filaImpressao.remove(0);
            doc.gerarDocumento();
            String linha = doc.getProximaLinha();
            while (linha != null) {
                System.out.println(linha);
                linha = doc.getProximaLinha();
            }
        }
    }

    public void removerDocumento() {
        if (filaImpressao.size() > 0) {
            filaImpressao.remove(0);
        }
    }
}
