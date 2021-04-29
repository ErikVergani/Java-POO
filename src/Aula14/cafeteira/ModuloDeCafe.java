package Aula14.cafeteira;

/*Desenvolva a classe ModuloDeCafe que é parte de uma cafeteira. O módulo tem como atributos: gramasCafe, mlAgua e
 contador (opcionalmente pode haver nomeBebida, como uma identificação daquela “fórmula”)  o contador é um
 sequencial que conta o nro. de doses servidas daquele tipo.
 */
public class ModuloDeCafe {

    private int gramasCafe;
    private int mlAgua;
    private int cont;

    public ModuloDeCafe() {
        this.gramasCafe = 0;
        this.mlAgua = 0;
        this.cont = 0;
    }
    public boolean setGramasCafe(int gramasCafe) {
        boolean validation = false;
        if (gramasCafe > 0) {
            this.gramasCafe = gramasCafe;
            validation = true;
        }
        return validation;
    }

    public boolean setMlAgua(int mlAgua) {
        boolean validation = false;
        if (mlAgua > 0) {
            this.mlAgua = mlAgua;
            validation = true;
        }
        return validation;
    }

    public int getGramasCafe() {
        return gramasCafe;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public int getCont() {
        return cont;
    }
}
