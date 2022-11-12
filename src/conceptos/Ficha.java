package conceptos;
import java.util.Scanner;
import sena.Aprendiz;

public class Ficha {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         //Asignar el valor al atributo
        Aprendiz diana=new Aprendiz();
        diana.edad=22;
        System.out.println("La edad de Diana es: "+diana.edad);

        //Asignar el valor al atributo
        diana.registrarAnimal();
        diana.cambiarnombre();
        
        //Asignar el valor al atributo
        Aprendiz roberth=new Aprendiz();
        roberth.edad=22;

        System.out.println("Ingrese la edad");
        diana.edad=leer.nextInt();

        //limpiar
        leer.nextLine();

        System.out.println("Ingrese la sede de estudio");
        diana.sede=leer.nextLine();
        
        
        System.out.println("Diana tiene" +diana.edad+ "años y estudia en la sede: " +diana.sede);

        
        
        
    

        
    }
}
