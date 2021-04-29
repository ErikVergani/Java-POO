package Aula8;

/*Que tal agora fazermos uma classe para simular o funcionamento
 de um vetor de números (double), mas que não seja apenas um
 vetor "burro". Que tal se pudéssemos solicitar ao vetor a média
  dos números, a soma dos números, um subvetor só com os números
  acima de ou abaixo de. Então a especificação da classe é a seguinte.
 */
public class DoubleCollection {

    private double vet[];

    public DoubleCollection(int tam) {
        vet = new double[tam];
    }

    public void setNumberAt(int pos, double num) {
        this.vet[pos] = num;
    }

    public double getLength() {
        return vet.length;
    }

    public double getSum() {
        int sum = 0;
        for (int i = 0; i < getLength(); i++) {
            sum += vet[i];
        }
        return sum;
    }

    public double getAverage() {
        return getSum() / getLength();
    }

    public int getMax() {
        int max = 0;
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] > max) {
                max = (int) vet[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = 99999999;
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] < min) {
                min = (int) vet[i];
            }
        }
        return min;
    }

    public double[] getPair() {
        int contnum = 0;
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] % 2 == 0) {
                contnum++;
            }
        }
        double vetpar[] = new double[contnum];
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] % 2 == 0) {
                vetpar[i] = vet[i];
            }
        }
        return vetpar;
    }

    public double[] getOdd() {
        int contnum = 0;
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] % 2 != 0) {
                contnum++;
            }
        }
        double vetImpar[] = new double[contnum];
        for (int i = 0; i < getLength(); i++) {
            if (vet[i] % 2 != 0) {
                vetImpar[i] = vet[i];
            }
        }
        return vetImpar;
    }

    public double[] getGreatherThan(int x) {
        int contnum = 0;
        for (int i = 0; i < getLength(); i++) {
            if (x > vet[i]) {
                contnum++;
            }
        }
        double vetG[] = new double[contnum];
        for (int i = 0; i < getLength(); i++) {
            if (x > vet[i]) {
                vetG[i] = vet[i];
            }
        }
        return vetG;
    }

    public double[] getSmallerThen(int x) {
        int contnum = 0;
        for (int i = 0; i < getLength(); i++) {
            if (x > vet[i]) {
                contnum++;
            }
        }
        double vetS[] = new double[contnum];
        for (int i = 0; i < getLength(); i++) {
            if (x > vet[i]) {
                vetS[i] = vet[i];
            }
        }
        return vetS;
    }
}
