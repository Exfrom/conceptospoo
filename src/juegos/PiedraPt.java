package juegos;
import java.util.Scanner;
import java.util.Random;
public class PiedraPt implements Juego{
    Scanner entrada=new Scanner(System.in);
    private String nombre;
    private int desicion, maquina;


@Override
public void iniciar(){
    System.out.println("Ingrese el nombre del jugador");
    nombre=entrada.nextLine();

}
@Override
public void jugar() {
    // TODO Auto-generated method stub
    System.out.println("Elije una opcion:  1.Piedra  2.Papel  3.Tijera ");
    desicion=entrada.nextInt();
    System.out.println(".....Maquina eligiendo........");
    Random aleatorio=new Random();
    maquina=aleatorio.nextInt(3)+1; 
}


@Override
public void finalizar() {
    // TODO Auto-generated method stub
     
    if(desicion == maquina){
        System.out.println("EMPATE....!!!");
    }
    else if(desicion==1 && maquina==2){
        System.out.println("Sacaste PIEDRA y la maquina saco PAPEL !LO SIENTO PERDISTE....!!!!");
    }
    else if(desicion==3 && maquina==2){
        System.out.println("Sacaste TIJERA y la maquina PAPEL, !!FELICITACIONES GANASTE...!!");
    }
    else if(desicion==2 && maquina==1){
        System.out.println("Sacaste PAPEL y la maquina PIEDRA, !!FELICITACIONES GANASTE...!!");
    }
    else if(desicion==1 && maquina==3){
        System.out.println("Sacaste PIEDRA y la maquina TIJERA, !!FELICITACIONES GANASTE...!!");
    }
    else if(desicion==3 && maquina==1){
        System.out.println("Sacaste TIJERA y la maquina PIEDRA, !LO SIENTO PERDISTE....!!!!");
    }
    else if(desicion==2 && maquina==3){
        System.out.println("Sacaste PAPEL y la maquina TIJERA, !LO SIENTO PERDISTE....!!!!");
    }
    else{
        System.out.println("DESICION NO VALIDA!!! ADIOS....!!!!");
    }
    

}

}
