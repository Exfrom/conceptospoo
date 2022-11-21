package aritmeticas;
import java.util.Scanner;
import aritmeticas.Calculadora;
public class Pruebacalculadora {
    public static void main(String[] args) {
    Scanner entrada =new Scanner(System.in);
    Calculadora operacion=new Calculadora();
    
    operacion.sumeNumeros();
    operacion.numeroMenos();
    //LLAMAR POTENCIACION:
    //operacion.potenciacion();
    //IMPRIMIR POTENCIACION:
    System.out.println("El resultado de la potencia es: "+operacion.potenciacion());

    int resta=operacion.restarNumeros();
    System.out.println("El resultado de la resta entre: \n" +operacion.num1+ " y " +operacion.num2+ "\nes:  " +resta);
    
    System.out.println("El numero mayor  es:" +operacion.numeroMayor(operacion.num1, operacion.num2 ));
    entrada.close();
   } 

   
   

}
 