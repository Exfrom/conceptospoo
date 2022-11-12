package salud;
import java.util.Scanner;
public class Personas {
    Scanner leer=new Scanner(System.in);
    //atributos
    String tipoDoc, nombre, apellido, sexo;
    int edad, documento;
    double peso, estatura, pesoactual;
    //Metodo
    public void registrardatos(){
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
        System.out.println("Ingrese su estatura en cms: ");
        estatura=leer.nextDouble();
    }
    public void mostrarpersona(){
        System.out.println("El nombre del paciente es:" +nombre);
        System.out.println("El apellido del paciente es:" +apellido);
        System.out.println("El genero del paciente es: " +sexo);
        System.out.println("El tipo de documento del paciente es:" +tipoDoc);
        System.out.println("El numero de documento es:" +documento);
        System.out.println("La edad del paciente es" +edad);
        System.out.println("El peso del paciente es"+peso);
        System.out.println("La estatura del paciente es:"+estatura);
    }
}
       
