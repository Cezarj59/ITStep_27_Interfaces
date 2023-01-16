
package aula_27;



public class Triangulo implements Figura{
    private int ladoA,ladoB, base, altura;
 
    public Triangulo(int ladoA, int ladoB, int base, int altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
        this.altura = altura;
    }
 
    public int getLadoA() {
        return ladoA;
    }
 
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
 
    public int getLadoB() {
        return ladoB;
    }
 
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
 
    public int getBase() {
        return base;
    }
 
    public void setBase(int base) {
        this.base = base;
    }
 
    public int getAltura() {
        return altura;
    }
 
    public void setAltura(int altura) {
        this.altura = altura;
    }
 
    @Override
    public String getNomeDaFigura() {
        return "triângulo";
    }
 
    @Override
    public int getArea() {
        return (base * altura) /2;
    }
 
    @Override
    public int getPerimetro() {
        return ladoA + ladoB + base;
    }
    
}
