
package aula_27;



public class Circulo implements Figura {

    private double raio;
    private double constante = 3.14;

    public Circulo() {
    }

    
    public Circulo(double raio) {
        this.raio = raio;
    }   
    
    

    public double getRaio() {
        return  raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

      
    
    @Override
    public String getNomeDaFigura() {
        return "Circulo";
    }
    
    @Override
    public int getArea() {
                return (int) (constante * (raio * 2));
    }

    @Override
    public int getPerimetro() {
           
         return (int) ((constante * 2) * raio);
    }

}
