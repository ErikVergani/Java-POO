package Aula23.Negocio;

import Aula23.Negocio.Printable;

import java.util.ArrayList;

public class Impressora {

    private ArrayList<Aula23.Negocio.Printable> filaImpressao;

    public Impressora() {
        this.filaImpressao = new ArrayList();
    }

    public void addDocument(Aula23.Negocio.Printable arq ) {
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
