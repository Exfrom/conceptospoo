package salud;
import java.util.Scanner;
public class Personas {
    Scanner leer=new Scanner(System.in);
    //atributos
    String tipoDoc, nombre, apellido, sexo;
    int edad, documento;
    double peso, estatura, pesoactual;
    //Metodo
    public void registrarDatos(){
        System.out.println("Ingrese el nombre del paciente:");
        nombre=leer.nextLine();
        System.out.println("Ingrese el apellido del paciente:");
        apellido=leer.nextLine();
        System.out.println("Ingrese su sexo: \n masculino \n femenino \n otro \n ");
        sexo=leer.nextLine();
        System.out.println("Ingrese su tipo de documento:\n CC \n TI \n RC \n ");
        tipoDoc=leer.nextLine();
        System.out.println("Ingrese su numero de documento: ");
        documento=leer.nextInt();
        System.out.println("Ingrese su edad: ");
        edad=leer.nextInt();
        System.out.println("Ingrese su peso en kilogramos: ");
        peso=leer.nextDouble();
        System.out.println("Ingrese su estatura en Metros: ");
        estatura=leer.nextDouble();
    }

    public void calcularlmc(){
        System.out.println("El peso del paciente es: "+peso);
        System.out.println("La estatura del paciente es: " +estatura);
        double pesoactual=peso/Math.pow(estatura,2d);
        System.out.println("El peso actual del paciente es: " +pesoactual);

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
        
    }
    public void mostrarPersona(){
        System.out.println("El paciente " +nombre+ " " +apellido+ " identificado con " +tipoDoc+
            " numero " +documento+", con "  +edad+  " años de edad, tiene un peso de "+peso+
            " kg, una estatura de " +estatura+ " metros, y de genero " +sexo);
    }
    public void mayorEdad(){
        System.out.println("La edad del paciente es:  " +edad);

        if(edad<18){ 
            System.out.println("El paciente es MENOR DE EDAD");
        }
        else if(edad>18 && edad<120){
            System.out.println("El paciente es MAYOR DE EDAD");
        }
        else{
            System.out.println("FUERA DE RANGO");
        }
        
    }
}
       
