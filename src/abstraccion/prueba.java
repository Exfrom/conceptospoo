package abstraccion;
import java.util.Scanner;

public class prueba {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        float lado, area, base, altura;
        double radio;
        System.out.println("Elige la figura geometrica  a la cual desea calcular el area: 1.cuadrado 2.Triangulo 3.Rectangulo 4.circulo");
        op=leer.nextInt(); 

         
        switch (op) {
            case 1:
            Cuadrado c1=new Cuadrado();
                System.out.println("Ingrese los lados del cuadrado: ");
                lado=leer.nextFloat();
                area=lado*lado;
                System.out.println("El area del cuadrado es: " +area);
                break;
            case 2:
            Triangulo t1=new Triangulo();
                System.out.println("Ingrese la base del triangulo: ");
                base=leer.nextFloat();
                System.out.println("Ingrese la altura  del triangulo: ");
                altura=leer.nextFloat();
                area=base*altura/2;
                System.out.println("El area del Triangulo es:  " +area);
            case 3:
            Rectangulo r1=new Rectangulo();
                System.out.println("Ingrese la base del Rectangulo: ");
                base=leer.nextFloat();
                System.out.println("Ingrese la altura  del Rectangulo: ");
                altura=leer.nextFloat();
                area=base*altura/2;
                System.out.println("El area del Rectangulo es:  " +area);
            case 4:
            Circulo cir1=new Circulo();
                System.out.println("Ingrese el radio del circulo: ");
                radio=leer.nextDouble();
                double pi=3.14;
                final double areacir = pi * Math.pow(radio,2);
                System.out.println("El area del circulo es: "+areacir);
            default:
                break;
            
        }
        /*Cuadrado c1=new Cuadrado();
        System.out.println();
        c1.setLado(4);
        c1.calcularArea();

        /*Triangulo t1=new Triangulo();
        t1.setAltura(5);
        t1.setBase(6);
        t1.calcularArea();

        Rectangulo r1=new Rectangulo();
        r1.setAltura(6);
        r1.setBase(4);
        r1.calcularArea();

        Circulo cir1=new Circulo();
        cir1.setRadio(9);
        cir1.calcularArea();* */


    

    

    
    }
    



}
