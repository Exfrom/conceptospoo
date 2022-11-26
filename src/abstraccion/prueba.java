package abstraccion;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        System.out.println("Elige la figura geometrica  a la cual desea calcular el area: 1.Triangulo 2.Rectangulo 3.Circulo");
        op=leer.nextInt();

        Cuadrado c1=new Cuadrado();
        switch (op) {
            case 1:
                
                break;
        
            default:
                break;
        }
        System.out.println();
        c1.setLado(12);
        c1.calcularArea();

        Triangulo t1=new Triangulo();
        t1.setAltura(5);
        t1.setBase(6);
        t1.calcularArea();

        Rectangulo r1=new Rectangulo();
        r1.setAltura(6);
        r1.setBase(4);
        r1.calcularArea();

        Circulo cir1=new Circulo();
        cir1.setRadio(9);
        cir1.calcularArea();


    

    

    
    }
    



}
