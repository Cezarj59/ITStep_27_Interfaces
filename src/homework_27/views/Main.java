package homework_27.views;

import homework_27.model.*;

public class Main {

    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();
        Barco b = new Barco();

        c.direcao();
        c.ligarMotor();
        c.acelerar();
        c.virarDireita();
        c.virarEsquerda();
        c.freiar();
        c.desligarMotor();
        
        System.out.println("\n");
        
        Rota rota = new Rota();
        rota.ir(b);
        
        System.out.println("\n");
        rota.ir(m);
    }
}
