package aritmeticas;
import java.util.Scanner;

public class Calculadora {
    Scanner entrada =new Scanner(System.in);
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;

    //METODOS:
   

    //metodo sin valor de retorno
    public void sumeNumeros(){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero1: " );
        num2=entrada.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numeros es :" +suma);
    }
    //metodo con valor de retorno que reste los dos numeros:
    public int restar(int num1, int num2){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero1: " );
        num2=entrada.nextInt();
        resta=num1-num2;
        System.out.println("La resta de los numeros es:"+resta);

    }

    

    
}
