package dosw.bitacora.semana3.reto5;

public class Cuadrado extends Forma {
    public Cuadrado(Color color) {
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + color.obtenerColor());
    }
}
