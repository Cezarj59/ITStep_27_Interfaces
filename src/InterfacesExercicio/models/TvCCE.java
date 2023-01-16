package models;


public class TvCCE extends Tvs{

    public TvCCE() {
    }

    public TvCCE(boolean ligar, int volume, int canal) {
        super(ligar, volume, canal);
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
