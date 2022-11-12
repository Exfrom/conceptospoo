package salud;
import java.util.Scanner;
import salud.Personas;
public class Usuarios {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Personas usuario1=new Personas();

        usuario1.registrardatos();

        System.out.println("Ingrese el nombre del usuario: ");
        usuario1.nombre=leer.nextLine();
      
        System.out.println("Ingrese el apellido del usuario:");
        usuario1.apellido=leer.nextLine();
        System.out.println("Ingrese su tipo de documento:\n CC \n TI \n RC \n ");
        usuario1.tipoDoc=leer.nextLine();
        System.out.println("Ingrese su sexo: \n masculino \n femenino \n otro \n ");
        usuario1.sexo=leer.nextLine();
        System.out.println("Ingrese su edad: ");
        usuario1.edad=leer.nextInt();
        System.out.println("Ingrese su numero de documento: ");
        usuario1.documento=leer.nextInt();
        System.out.println("Ingrese su peso en kilogramos: ");
        usuario1.peso=leer.nextDouble();
        System.out.println("Ingrese su estatura en cms: ");
        usuario1.estatura=leer.nextDouble();

        System.out.println("El nombre del usuario1 es: \n" +usuario1.nombre+ "\nEl apellido del usuario1 es:\n" +usuario1.apellido);
        System.out.println("El tipo de documento del usuario1 es: \n" +usuario1.tipoDoc+ "\nEl numero de documento del usuario1 es: \n" +usuario1.documento);
        System.out.println("El sexo del usuario1 es: \n" +usuario1.sexo + "\nLa edad del usuario1 es: \n" +usuario1.edad);
        System.out.println("El peso actual del usuario1 es: \n" +usuario1.peso+ "\nLa estatura del usuario1 es: \n" +usuario1.estatura);
        //usuario1.pesoactual = (usuario1.peso)/(usuario1.estatura)^2;


        
    }
}