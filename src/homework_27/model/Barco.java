package homework_27.model;

public class Barco implements iVeiculo {

    @Override
    public void direcao() {
        System.out.println("Timão");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Barco virou a direita");
    }

    @Override
    public void virarDireita() {
        System.out.println("Barco virou a Esquerda");
    }

    @Override
    public void acelerar() {
        System.out.println("Barco Acelerou");
    }

    @Override
    public void freiar() {
        System.out.println("Barco Freiou");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Barco Ligou o Motor");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Barco desligou o Motor");
    }

}
