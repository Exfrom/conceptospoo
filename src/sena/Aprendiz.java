package sena;

public class Aprendiz {
        //Atrubutos
        String id;
        //visible en clases package sena
        String nombre="diana";
        //visible fuera package sena
        String apellido;
        //visible fuera package sena clase ficha
        public int edad=20;
        public String sede="Fontibon";
        public String telefono;
        //metodo /operaciones
        
        public void registrarAnimal(){
                System.out.println("Ingrese la edad: ");
                edad=leer.nextInt();
                //limpiar buffer
                leer.nextInt();
                System.err.println("Ingrese la sede de estudio:");
                sede=leer.nextLine();
        }
        
        
        public void cambiarnombre(){
                System.out.println("El nombre actual es:"+nombre);
                System.out.println("Ingrese un nuevo nombre: ");
                nombre=leer.nextLine();
                System.out.println("El nuevo nombre es: "+nombre);
                
        }   
}
