package abstraccion;
//Reto 5
public class Cuadrado extends Figura{
    //Atributos
    private float lado;
    

    public Cuadrado() {
    }
    
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }


    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        float area=lado*lado;
        System.out.println("El area del cuadrado de lado " +lado+ " es "+area);
    }
    
}
