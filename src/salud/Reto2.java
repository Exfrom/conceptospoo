package salud;
import java.util.Scanner;

public class reto2{
    Scanner entrada=new Scanner(System.in);
    //Atributos
    public double peso, estatura;
    

    //Metodo
   
    public double calcularlmc(){
        System.out.println("Ingrese el peso del paciente en KG: ");
        peso=entrada.nextDouble();
        System.out.println("Ingrese la estatura del paciente en Mts: ");
        estatura=entrada.nextDouble();
        double pesoactual=peso/Math.pow(estatura,2d);
        
        if(pesoactual<20){
            System.out.println("El peso actual del paciente esta por debajo de lo ideal");
        }
        else if(pesoactual>20 && pesoactual<25){
            System.out.println("El peso del paciente es  PESO_IDEAL");
        }
        else if(pesoactual>25){
            System.out.println("EL paciente esta en SOBREPESO");
        }
        else{
            System.out.println("FUERA DE RANGO");
        }
        return pesoactual;
    }
}