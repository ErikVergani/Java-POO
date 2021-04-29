package Aula6;

/*Construa uma classe para modelar o funcionamento de uma máquina de fazer refrigerantes, aquelas que existem nas
hamburguerias expressas (com refil). A máquina pode servir 3 sabores diferentes, portanto ela tem estoque de 3 xaropes
diferentes, água e gás. Se faltar um dos insumos não é possível servir. Para cada 100 ml de refrigerante são consumidos
 95 ml de água, 5 ml de xarope e um dose de gás. Construa primeiramente a classe que representa o funcionamento dessa
 máquina e depois uma tela com menu (main) que vai interagir com a máquina, fazendo ela funcionar.
 */

import lombok.Getter;

@Getter

public class Refrigerantes {

    int quantAgua = 0;
    int limiteAgua = 20000;
    int quantXaropeCoca = 0;
    int quantXaropeGuarana = 0;
    int quantXaropeLimao = 0;
    int quantGas = 0;
    int limiteGas = 200;
    int limiteXarope = 500;

    public void addQuantGas(int quantidade) {
        this.quantGas += quantidade;
    }

    public void addXarope(int op, int quantidadeMl) {
        if (op == 1) {
            this.quantXaropeCoca += quantidadeMl;
        } else if (op == 2) {
            this.quantXaropeGuarana += quantidadeMl;
        } else if (op == 3) {
            this.quantXaropeLimao += quantidadeMl;
        }
    }

    public void addQuantAgua(int quantidade) {
        this.quantAgua += quantidade;
    }

    public boolean servirRefri(int tamanhoCopo, int sabor) {
        boolean sure = false;
        int tamanho = tamanhoCopo / 100;
        int agua = tamanho * 95;
        int xarope = tamanho * 5;
        if (agua <= quantAgua && tamanho <= quantGas) {
            quantAgua -= agua;
            quantGas -= tamanho;
            if (sabor == 1 && xarope <= quantXaropeCoca) {
                this.quantXaropeCoca -= xarope;
                sure = true;
            } else if (sabor == 2 && xarope <= quantXaropeGuarana) {
                this.quantXaropeGuarana -= xarope;
                sure = true;
            } else if (sabor == 3 && xarope <= quantXaropeLimao) {
                this.quantXaropeLimao -= xarope;
                sure = true;
            }
        }
        return sure;
    }
}