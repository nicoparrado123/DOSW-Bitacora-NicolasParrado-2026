package dosw.bitacora.semana3.reto5;

public class Main {
    public static void main(String[] args) {
        Forma circuloRojo = new Circulo(new ColorRojo());
        circuloRojo.dibujar();
        
        Forma circuloAzul = new Circulo(new ColorAzul());
        circuloAzul.dibujar();
        
        Forma cuadradoVerde = new Cuadrado(new ColorVerde());
        cuadradoVerde.dibujar();
        
        Forma cuadradoRojo = new Cuadrado(new ColorRojo());
        cuadradoRojo.dibujar();
    }
}
