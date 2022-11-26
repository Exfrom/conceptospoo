package abstraccion;

public class Circulo extends Figura{
    private double radio;
    final double pi=3.14;

    

    public Circulo() {
    }

    


    public Circulo(Double radio) {
        this.radio = radio;
    }

    



    public double getRadio() {
        return radio;
    }




    public void setRadio(double radio) {
        this.radio = radio;
    }




    public double getPi() {
        return pi;
    }




    public void calcularArea(){
        double area= pi * Math.pow(radio,2);
        System.out.println("El area del circulo es:  "+area);
    }
    
}
