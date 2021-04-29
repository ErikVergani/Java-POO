package Aula8;

/*Jonas é preparador físico e está treinando atletas para as Olimpíadas 2021 no Japão. O grupo é formado por 15 atletas
que estão se preparando para corrida de 100 metros rasos. Jonas anota os tempos de cada um em uma planilha e depois
 calcula a média dos tempos (geral), descobre o maior e menor tempo (melhor e pior atleta) e também lista os nomes
  daqueles que conseguem fazer em menos nos do que 10 segundos o percurso de 100 mts.
 */
import java.util.Arrays;

public class PlanilhaV2 {

    private int passagens;
    private String nomes[];
    private double tempos[][];
    private int piorAtleta;
    private int melhorAtleta;
    private int[] lessThan;

    public PlanilhaV2() {
        this.passagens = 1;
        this.nomes = new String[3];
        this.tempos = new double[passagens][nomes.length];
        this.piorAtleta = 0;
        this.melhorAtleta = 0;
    }

    public void setNomes(int pos, String nome) {
        this.nomes[pos] = nome;
    }

    public void setPassagens(int passagens) {

        this.passagens = passagens;
        this.tempos = new double[passagens][nomes.length];
    }

    public void setTempos(int linha, int coluna, double tempo) {
        this.tempos[linha][coluna] = tempo;
    }

    public int getLength() {
        return this.nomes.length;
    }

    public String[] getNomes() {
        return this.nomes;
    }

    public double getPassagens() {
        return this.passagens;
    }

    public double sumTimes() {
        double soma = 0;
        for (int i = 0; i < tempos.length; i++) {
            for (int j = 0; j < tempos[0].length; j++) {
                soma += tempos[i][j];
            }
        }
        return soma;
    }

    public double getMediaGeral() {
        return sumTimes() / (getPassagens() * getLength());
    }

    public double getMaiorTempo() {
        double maior = 0;
        for (int i = 0; i < tempos.length; i++) {
            for (int j = 0; j < tempos[0].length; j++) {
                if (tempos[i][j] > maior) {
                    maior = tempos[i][j];
                    this.piorAtleta = j;
                }
            }
        }
        return maior;
    }

    public double getMenorTempo() {
        double menor = 500;
        for (int i = 0; i < tempos.length; i++) {
            for (int j = 0; j < tempos[0].length; j++) {
                if (tempos[i][j] < menor) {
                    menor = tempos[i][j];
                    melhorAtleta = j;
                }
            }
        }
        return menor;
    }

    public int getPiorAtleta() {
        return this.piorAtleta;
    }

    public int getMelhorAtleta() {
        return this.melhorAtleta;
    }

    public int[] catchLessThan() {
        lessThan = new int[0];
        for (int i = 0; i < tempos.length; i++) {
            for (int j = 0; j < tempos[0].length; j++) {
                if (tempos[i][j] < 10 && checkOMFG(lessThan, j)) {
                    lessThan = Arrays.copyOf(lessThan, lessThan.length + 1);
                    lessThan[lessThan.length - 1] = j;
                }
            }
        }
        return lessThan;
    }

    public boolean checkOMFG(int[] vet, int x) {
        boolean validation = true;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == x) {
                validation = false;
            }
        }
        return validation;
    }

    public int[] getLessThan() {
        catchLessThan();
        return lessThan;
    }
}

