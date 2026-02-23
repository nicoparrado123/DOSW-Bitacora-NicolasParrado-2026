package dosw.bitacora.semana3.reto5;

public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + color.obtenerColor());
    }
}
