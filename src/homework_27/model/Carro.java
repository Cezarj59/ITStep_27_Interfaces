
package homework_27.model;



public class Carro implements iVeiculo {

    @Override
    public void direcao() {
        System.out.println("Volante");
    }

   @Override
    public void virarEsquerda() {
        System.out.println("Carro virou a direita");
    }

    @Override
    public void virarDireita() {
        System.out.println("Carro virou a Esquerda");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro Acelerou");
    }

    @Override
    public void freiar() {
        System.out.println("Carro Freiou");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Carro Ligou o Motor");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Carro desligou o Motor");
    }
    
    


}
