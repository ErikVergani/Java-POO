package Aula16;

import java.util.ArrayList;

public class Nf implements Printable {

    private String nomeCliente, data;
    private double vlTotal;
    private ArrayList<String> linhas;

    public Nf(String nomeCliente, String data, double vlTotal) {
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.vlTotal = vlTotal;
        linhas = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getData() {
        return data;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    @Override
    public String getProximaLinha() {
        String linha = null;
        if (linhas.size() > 0) {
            linha = linhas.remove(0);
        }
        return linha;
    }

    @Override
    public void gerarDocumento() {
        linhas.clear();
        linhas.add("- - - Nome: " + nomeCliente);
        linhas.add("- - - Dia: " + data);
        linhas.add("- - - Valor: " + vlTotal + " reais");
    }
}
