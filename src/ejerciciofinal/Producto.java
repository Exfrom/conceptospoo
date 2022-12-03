package ejerciciofinal;



public class Producto {
    private int idProducto;
    private String nombre;
    private int precio;
    private boolean estado;
    //Metodo constructor
    public Producto() {
    }
    public Producto(int idProducto, String nombre, int precio, Boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }
    
   public void mostrarProducto(){
        if(nombre.equalsIgnoreCase(nombre)){
            System.out.println("El producto " +nombre+ "identificado con id " 
            +idProducto+ "tiene un precio de " +precio+ "se encuentra en estado: " +estado);
        }
   }
    
    

}
