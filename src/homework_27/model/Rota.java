package homework_27.model;

public class Rota {

    public void ir(iVeiculo a){
        a.acelerar();
        a.virarDireita();
        a.virarEsquerda();
        a.virarEsquerda();
        a.freiar();
        a.virarDireita();

    }
}
