package models;

public abstract class Tvs {

    boolean ligar = false;
    int volume = 50;
    int canal = 3;

    public Tvs() {
    }

    public Tvs(boolean ligar, int volume, int canal) {
        this.ligar = ligar;
        this.volume = volume;
        this.canal = canal;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

}
