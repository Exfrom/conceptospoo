package abstraccion;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        float lado1, lado2, area, base, altura;

        System.out.println("Elige la figura geometrica  a la cual desea calcular el area: 1.cuadrado 2.Triangulo 3.Rectangulo 4.circulo");
        op=leer.nextInt(); 

         
        switch (op) {
            case 1:
            Cuadrado c1=new Cuadrado();
                System.out.println("Ingrese el lado1 del cuadrado: ");
                lado1=leer.nextFloat();
                System.out.println("Ingrese el lado2 del cuadrado: ");
                lado2=leer.nextFloat();
                area=lado1*lado2;
                System.out.println("El area del cuadrado es: " +area);
                break;
            case 2:
            Triangulo t1=new Triangulo();
                System.out.println("Ingrese la base del triangulo: ");

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
