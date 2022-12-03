package juegos;

import java.util.Random;
import java.util.Scanner;

public class Carizellazo implements Juego{
    Scanner leer=new Scanner(System.in);
    //atributos
    private String nombre; 
    private int eleccion;
    private int moneda;
    
    
    
    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        System.out.println("Ingrese el nombre del jugador");
        nombre=leer.nextLine();
    }

    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        System.out.println("Escoge 1.cara o 2.sello");
        eleccion=leer.nextInt();
        System.out.println("....moneda girando...");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        
    }

    /* (non-Javadoc)
     * @see abstraccion.Juego#finalizar()
     */
    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        if(moneda==1 && eleccion==1){
            System.out.println("Cayo cara, seleccionaste cara....Ganaste!!!" +nombre);
            System.err.println("Deseas segur jugando? 1.si 2.no");
        }
        else if(moneda==1 && eleccion==2){
            System.out.println("Cayo cara, seleccionaste sello....Perdiste!!!" +nombre);
            System.err.println("Deseas segur jugando? 1.si 2.no");
        }
        else if(moneda==2 && eleccion==2){
            System.out.println("Cayo sello, seleccionaste sello....Ganaste!!!" +nombre);
            System.err.println("Deseas segur jugando? 1.si 2.no");
        }
        else if(moneda==2 && eleccion==1){
            System.out.println("Cayo sello, seleccionaste cara....Perdiste!!!"  +nombre);
            System.err.println("Deseas segur jugando? 1.si 2.no");
        }
        else{
            System.out.println("FIN DEL JUEGO......");
        }
    }
    
}
