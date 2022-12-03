 package salud;
//RETO3
import java.util.Scanner;

public class personaRegistro {
    Scanner entrada=new Scanner(System.in);
    //Atruibutos
    public String tipoDoc, nombre, apellido, genero;
    public int documento, edad;
    public Double peso, estatura;

    //Metodos constructores
    public personaRegistro(){

    }
   
    public personaRegistro(String tipoDoc, String nombre, String apellido, String genero, 
    int documento, int edad, double peso,double estatura){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
    }
    public void mostrarPersona(String nombre){
        
        if(nombre.equalsIgnoreCase(nombre)){
            System.out.println("El paciente " +nombre+ " " +apellido+ " identificado con " +tipoDoc+
            " numero " +documento+", con "  +edad+  " años de edad, un peso de "+peso+
            " kg, una estatura de " +estatura+ " metros, y de genero " +genero);
            
            
        }

    }
}
    



