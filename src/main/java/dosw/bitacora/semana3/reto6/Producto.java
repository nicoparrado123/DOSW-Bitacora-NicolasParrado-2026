package dosw.bitacora.semana3.reto6;

public class Producto implements ItemBodega {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public double calcularPrecio() {
        return precio;
    }
    
    public String getNombre() {
        return nombre;
    }
}
