package Aula15Prova1;

import java.util.ArrayList;
import java.util.Random;

/*um número de 1 a 6 estivesse sendo sorteado (gerado aleatoriamente).
Construa uma classe para simular o funcionamento de um DADO. O artefato poderá ser lançado e sempre que isso ocorrer o
usuário poderá observar o número que está estampado na face que ficou para cima. Um chip instalado no interior de cada
DADO conta quantos lançamentos foram feitos e quantas vezes cada uma das faces ficou para cima. Essas informações
 poderão ser solicitadas aos objetos dessa classe a qualquer momento (2 pontos).
Obs: não é necessário desenvolver nenhum sistema que utiliza o artefato, apenas modelar a classe. Opcionalmente você
poderá desenvolver um módulo main para testar o funcionamento do objeto.*/
public class Dado {

    Random dado;
    private int contTotalLancamento;
    private int[] ladoDadoSorteado;

    public Dado() {
        dado = new Random();
        contTotalLancamento = 0;
        ladoDadoSorteado = new int[6];
    }

    public int lancarDado() {
        int numDado = dado.nextInt(6) + 1;
        ladoDadoSorteado[numDado - 1]++; // adiciona no vetor +1 na posicao que caiu o dado
        contTotalLancamento++; // ++ no total de lancamento
        return numDado; // retorna o valor que caiu no dado
    }

    public int getContLancamento() {
        return contTotalLancamento;
    }

    public int[] getLadoDadoSorteado() {
        return ladoDadoSorteado; // retorna o vetor com as vezes que os numeros foram sorteados no dado sendo
        // necessario fazer um fori na tela para exibir...
    }
}
