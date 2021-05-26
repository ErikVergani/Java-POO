package Aula22.Persistencia;

import Aula22.Negocio.Arquivo;
import Aula22.Negocio.MaquinaSorvete;

/**
 * @author ErikVergani
 * @date 25/05/2021
 **/

public class MaquinaSorveteDao {

    public void save(MaquinaSorvete maquinaSorvete) {
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula22\\Persistencia\\MaquinaSorvete.txt");

        if (arquivo.abrirEscrita()) {
            // insumos
            arquivo.escreverLinha(maquinaSorvete.getLeite() + "");
            arquivo.escreverLinha(maquinaSorvete.getEmulsificante() + "");
            arquivo.escreverLinha(maquinaSorvete.getChocolate() + "");
            arquivo.escreverLinha(maquinaSorvete.getMorango() + "");
            // vendas
            arquivo.escreverLinha(maquinaSorvete.getLitrosVendidos() + "");
            arquivo.escreverLinha(maquinaSorvete.getNumBolasChoco() + "");
            arquivo.escreverLinha(maquinaSorvete.getNumBolasMorango() + "");

            arquivo.fecharArquivo();
        }

    }

    public MaquinaSorvete read() {
        MaquinaSorvete maquinaSorvete = null;
        Arquivo arquivo = new Arquivo("E:\\Software Engineer\\WorkSpace\\Univates\\JavaPoo\\src\\Aula22\\Persistencia\\MaquinaSorvete.txt");

        if (arquivo.abrirLeitura()) {
            int qtdeLeite = Integer.parseInt(arquivo.lerLinha());
            int qtdeEmulsificante = Integer.parseInt(arquivo.lerLinha());
            int qtdeEssenciaChoco = Integer.parseInt(arquivo.lerLinha());
            int qtdeEssenciaMorango = Integer.parseInt(arquivo.lerLinha());
            int qtdeLitrosVendidos = Integer.parseInt(arquivo.lerLinha());
            int qtdeBolasChocoVendidas = Integer.parseInt(arquivo.lerLinha());
            int qtdeBolasMorangoVendidas = Integer.parseInt(arquivo.lerLinha());

            maquinaSorvete = new MaquinaSorvete(qtdeLeite, qtdeEmulsificante, qtdeEssenciaChoco, qtdeEssenciaMorango,
                    qtdeLitrosVendidos, qtdeBolasChocoVendidas, qtdeBolasMorangoVendidas);
            arquivo.fecharArquivo();
        }
        return maquinaSorvete;
    }
}
