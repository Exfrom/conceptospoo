package Repaso;
import java.util.Scanner;
public class Libro {
    Scanner leer=new Scanner(System.in);
    //Atrubutos
    private int idLibro;
    public String nombreLibro;
    private String autorLibro;
    private String categoriaLibro;
    private String editorialLibro;

    //metodo
    
    public void registrarLibro(){
        System.out.println("Ingrese el ID del libro:  ");
        idLibro=leer.nextInt();
        
    //Limpieza Buffer
        leer.nextInt();
        System.out.println("Ingrese el nombre del libro: ");
        nombreLibro=leer.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        autorLibro=leer.nextLine();

        System.out.println("Ingrese la categoria del libro: ");
        categoriaLibro=leer.nextLine();

        System.out.println("Ingrese la editorial del libro: ");
        editorialLibro=leer.nextLine();
    }
    public void consultarLibro(String nameBook){
        if(nombreLibro.equalsIgnoreCase(nameBook)){

            System.out.println("El libro " +nombreLibro+ "fue escrito por "+autorLibro+ "es de la editorial "
            +editorialLibro);
        }
        else{
            System.out.println("El libro no existe");
        }
        
    }

}
