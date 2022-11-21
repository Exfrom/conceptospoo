package aritmeticas;
import java.util.Scanner;

public class Calculadora {
    Scanner entrada =new Scanner(System.in);
    //Atributos
    int num1;
    int num2;
    int suma;


    //METODOS:
   

    //1.metodo sin valor de retorno
    public void sumeNumeros(){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero2: " );
        num2=entrada.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los numeros es :" +suma);
    }    
    //2.metodo con valor de retorno que reste los dos numeros:
    public int restarNumeros(){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero2: " );
        num2=entrada.nextInt();
        int restar=num1-num2;
        return restar;
    //3.Metodo con valor de retorno que devuelva ¿Cual es el numero mayor?
        
    }
    public int numeroMayor(int num1, int num2){
        int numayor;
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero2: " );
        num2=entrada.nextInt();

        if(num1>num2){
            System.out.println("El numero" +num1+ "es mayor que " +num2);
            numayor=num1;
        }
        else{
            System.out.println("El numero " +num2+ "es mayor que: " +num1);
            numayor=num2;
        }
        return numayor;
    }
    //4.Metodo sin valor de retorno que devuelva ¿Cual es el numero menor?
    public void numeroMenos(){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero2: " );
        num2=entrada.nextInt();
        if(num1<num2){
            System.out.println("El numero " +num1+ "es menor que " +num2);
        }
        else{
            System.out.println("El numero " +num2+ "es menor que " +num1);
        }
    }
    //5.Metodo con valor de retorno que eleve cada numero al exponente indicado por el usuario
    public String potenciacion(){
        System.out.println("Ingrese numero1: " );
        num1=entrada.nextInt();
        System.out.println("Ingrese numero2: " );
        num2=entrada.nextInt();
        System.out.println("Ingrese el exponente al que desea elevar los numeros");
        double exponente=entrada.nextDouble();

        double potencia1=Math.pow(num1, exponente);
        double potencia2=Math.pow(num2, exponente);

        String resultado=("El resultado de su operacion es: " +potencia1+ " y " +potencia2);
        return resultado;
    }
}