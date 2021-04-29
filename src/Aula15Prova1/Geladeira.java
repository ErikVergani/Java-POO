package Aula15Prova1;

/*Faça um sistema que simula o funcionamento dessa geladeira comunitária.
Os usuários da geladeira poderão: a) doar alimentos ou b) consumir alimentos.
O administrador da ONG poderá: a) consultar quantos quilos de alimentos existem
na geladeira ou b) limpar a geladeira. Ao doar ou consumir alimentos o usuário
informa quantos quilogramas está doando ou consumindo. Há dois tipos de alimentos
 que precisam ser controlados de modo independente, os perecíveis e os não perecíveis.

 1-Criar a classe Geladeira com as funcionalidades (métodos) necessárias para as funções que serão acessadas pelos
 usuários e pelo administrador (3 pontos)

2- Criar uma interface (uma classe para exibir um menu) para o usuário e o administrador acessarem as funcionalidades
da Geladeira (2 pontos)

 */
public class Geladeira {

    private int kgAlimentoPereciveis;
    private int kgAlimentoNaoPereciveis;
    private int capacidadeAlimentos;

    public Geladeira() {
        this.kgAlimentoPereciveis = 0;
        this.kgAlimentoNaoPereciveis = 0;
        this.capacidadeAlimentos = 500;
    }

    public boolean doarAlimentoPerecivel(int kgAlimento) {
        boolean validation = false;
        if ((consultarTotalAlimentos() + kgAlimento) <= getCapacidadeAlimentos() && kgAlimento > 0) {
            this.kgAlimentoPereciveis += kgAlimento;
            validation = true;
        }
        return validation;
    }

    public boolean doarAlimentoNaoPerecivel(int kgAlimento) {
        boolean validation = false;
        if ((consultarTotalAlimentos() + kgAlimento) <= getCapacidadeAlimentos() && kgAlimento > 0) {
            this.kgAlimentoNaoPereciveis += kgAlimento;
            validation = true;
        }
        return validation;
    }

    public boolean receberAlimentosPereciveis(int kgAlimento) {
        boolean validation = false;
            if ((getKgAlimentoPereciveis() - kgAlimento) >= 0 && kgAlimento > 0) {
                this.kgAlimentoPereciveis -= kgAlimento;
                validation = true;
            }
        return validation;
    }

    public boolean receberAlimentosNaoPereciveis(int kgAlimento) {
        boolean validation = false;
            if ((getKgAlimentoNaoPereciveis() - kgAlimento) >= 0 && kgAlimento > 0) {
                this.kgAlimentoNaoPereciveis -= kgAlimento;
                validation = true;
            }
        return validation;
    }


    public int consultarTotalAlimentos() {
        return (getKgAlimentoPereciveis() + getKgAlimentoNaoPereciveis());
    }

    public void limparGeladeira() {
        this.kgAlimentoPereciveis = 0;
        this.kgAlimentoNaoPereciveis = 0;
    }

    public int getKgAlimentoPereciveis() {
        return kgAlimentoPereciveis;
    }

    public int getKgAlimentoNaoPereciveis() {
        return kgAlimentoNaoPereciveis;
    }

    public int getCapacidadeAlimentos() {
        return capacidadeAlimentos;
    }
}
