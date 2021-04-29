package Aula7;

public class tv {

    int volume = 10;
    int limiteVolume = 20;
    boolean statusTV = false;
    int canal = 1;

    public int getLimiteVolume() {
        return limiteVolume;
    }

    public void setLimiteVolume(int limiteVolume) {
        this.limiteVolume = limiteVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void addVolume() {
        if (isStatusTV() && volume < limiteVolume) {
            volume++;
        }
    }

    public void removeVolume() {
        if (isStatusTV() && volume > 0) {
            volume--;
        }
    }

    public void tvOff() {
        statusTV = false;
    }

    public void tvOn() {
        statusTV = true;
    }

    public boolean isStatusTV() {
        return statusTV;
    }

    public int getCanal() {
        return canal;
    }

    public void addCanal() {
        if (isStatusTV() && canal < 30) {
            canal++;
        }
    }

    public void removeCanal() {
        if (isStatusTV() && canal > 1) {
            canal--;
        }
    }
}