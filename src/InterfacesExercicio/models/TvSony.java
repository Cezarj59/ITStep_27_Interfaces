package models;

import interfaces.ControleRemoto;

public class TvSony extends Tvs implements ControleRemoto {

    public TvSony() {
    }

    public TvSony(boolean ligar, int volume, int canal) {
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

    @Override
    public String ligar() {

        if (super.isLigar()) {
            super.setLigar(false);
        } else {
            super.setLigar(true);
        }
        return isLigar() ? "Ligar" : "Desligar";
    }

    @Override
    public String aumentarVolume() {

        if (super.getVolume() == 100) {
            return "Volume máximo";
        } else {
            super.setVolume(++volume);
            return "Volume: " + getVolume();
        }

    }

    @Override
    public String diminuirVolume() {
        if (super.getVolume() == 0) {
            return "Mute";
        } else {
            super.setVolume(--volume);
            return "Volume: " + getVolume();
        }
    }

    @Override
    public String aumentarCanal() {
        if (super.getCanal() == 1000) {
            return "Canal Maximo";
        } else {
            super.setCanal(canal++);
            return "Canal: " + getCanal();
        }

    }

    @Override
    public String diminuirCanal() {
        if (super.getCanal() == 0) {
            return "Canal Minimo";
        } else {
            super.setCanal(canal--);
            return "Canal: " + getCanal();
        }
    }

}
