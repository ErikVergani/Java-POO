package Aula14.cafeteira;
/*Desenvolva a classe Cafeteira que deve conter pelo menos um reservatório de água, um reservatório de café e
três módulos de café. Os métodos devem permitir configurar cada uma das
bebidas, servir uma determinada bebida, abastecer água, abastecer café e consultar os níveis e contadores.
 */
public class Cafeteira {

    private ModuloDeCafe moduloDeCafe1;
    private ModuloDeCafe moduloDeCafe2;
    private ModuloDeCafe moduloDeCafe3;
    private int reservatorioAgua;
    private int reservatorioCafe;

    public Cafeteira() {
        this.moduloDeCafe1 = new ModuloDeCafe();
        this.moduloDeCafe2 = new ModuloDeCafe();
        this.moduloDeCafe3 = new ModuloDeCafe();
    }

    public void configurarModulo(int modulo, int qtdeCafe, int qtdeAgua) {
        boolean validation = false;
        if(modulo == 1){
            moduloDeCafe1.setGramasCafe(qtdeCafe);
            moduloDeCafe1.setMlAgua(qtdeAgua);
        }
    }
    public Object abastecerAgua(int agua){
return null;
    }

    public ModuloDeCafe getModuloDeCafe1() {
        return moduloDeCafe1;
    }

    public ModuloDeCafe getModuloDeCafe2() {
        return moduloDeCafe2;
    }

    public ModuloDeCafe getModuloDeCafe3() {
        return moduloDeCafe3;
    }
}
