package Aula14.radio;

/* O rádio vai poder estar ligado ou desligado, terá uma controle de volume que varia de 0 até
 100 e vai conter uma estação sintonizada (com as características descritas no exercício 01), que deverá ser um atributo
  do tipo EstacaoFM. usuário vai poder mudar a estação (para cima ou para baixo ou para uma
  estação específica) e mudar o modo de transmissão diretamente no rádio.
*/
public class Radio {

    private EstacaoFM estacaoSincronizada;
    private boolean isOn;
    private int minVolume, maxVolume, volume;

    public Radio() {
        this.estacaoSincronizada = new EstacaoFM();
        this.isOn = false;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.volume = 20;
    }

    //metodos

    public boolean turnOn() {
        boolean validation = false;
        if (isOn) {
            this.isOn = false;
        } else {
            this.isOn = true;
            validation = true;
        }
        return validation;
    }

    public boolean changeVolume(int volume) {
        boolean validation = false;
        if (volume > getMinVolume() && volume <= getMaxVolume()) {
            this.volume = volume;
            validation = true;
        }
        return validation;
    }

    //getters

    public EstacaoFM getEstacaoSincronizada() {
        return estacaoSincronizada;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getVolume() {
        return volume;
    }
}