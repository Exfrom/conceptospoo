package salud;
import java.util.Scanner;
public class Reto2 {
    Scanner entrada=new Scanner(System.in);
    //Atributos
    double peso, estatura, pesoactual;
    

    //Metodo
    public void calcularlmc(){
        System.out.println("Ingrese el peso del paciente en KG: ");
        peso=entrada.nextDouble();
        System.out.println("Ingrese la estatura del paciente en Mts: ");
        estatura=entrada.nextDouble();
    }

}