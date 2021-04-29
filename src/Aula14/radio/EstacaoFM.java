package Aula14.radio;

/*Implementar a classe EstacaoFM que representa uma estação de rádio FM. Uma estação é definida pela frequência que pode
 variar de 88.0 até 108.9 e pelo modo de transmissão que pode ser “mono”, “stereo” ou “dolby”. Uma estação pode ter sua
 frequência aumentada ou reduzida de 0.1 em 0.1 ou definida diretamente para um determinado valor. O modo de transmissão
  pode ser mudado com apenas uma operação que irá mudar de “mono” para “stereo”; de “stereo” para “dolby”; de “dolby”
   para “mono”, ou seja, é como se fosse uma mudança em uma direção apenas…

*/
public class EstacaoFM {

    private double frequency, minFrequency, maxFrequency;
    private String mode;

    public EstacaoFM() {
        frequency = 90.00;
        minFrequency = 88.00;
        maxFrequency = 108.90;
        mode = "mono";
    }

    // METODOS

    public boolean increaseFrequency() {
        boolean validation = false;
        if ((getFrequency() + 0.1) <= getMaxFrequency()) {
            this.frequency += 0.1;
            validation = true;
            if ((getFrequency() + 0.1) > getMaxFrequency()) {
                this.frequency = 88.00;
                validation = true;
            }
        }
        return validation;
    }

    public boolean reduceFrequency() {
        boolean validation = false;
        if ((getFrequency() - 0.1) >= getMinFrequency()) {
            this.frequency -= 0.1;
            validation = true;
            if ((getFrequency() - 0.1) < getMinFrequency()) {
                this.frequency = 108.09;
                validation = true;
            }
        }
        return validation;
    }

    public void changeMode(){
        if(mode.equals("mono")){
            mode = "stereo";
        }else if(mode.equals("stereo")){
            mode = "dolby";
        }else if(mode.equals("dolby")){
            mode = "mono";
        }
    }

    // GETTERS

    public double getFrequency() {
        return frequency;
    }

    public String getMode() {
        return mode;
    }


    public double getMinFrequency() {
        return minFrequency;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    //SETTERS

    public boolean setFrequency(double frequency) {
        boolean validation = false;
        if (frequency >= getMinFrequency() && frequency <= getMaxFrequency()) {
            this.frequency = frequency;
            validation = true;
        }
        return validation;
    }
}