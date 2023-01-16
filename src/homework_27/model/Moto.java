package homework_27.model;

public class Moto implements iVeiculo {

    @Override
    public void direcao() {
        System.out.println("Guidão");
    }

   @Override
    public void virarEsquerda() {
        System.out.println("Moto virou a direita");
    }

    @Override
    public void virarDireita() {
        System.out.println("Moto virou a Esquerda");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto Acelerou");
    }

    @Override
    public void freiar() {
        System.out.println("Moto Freiou");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Moto Ligou o Motor");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Moto desligou o Motor");
    }

}
