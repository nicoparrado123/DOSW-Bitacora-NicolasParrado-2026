package dosw.bitacora.semana3.reto7;

public class Misiles extends MejoradorBarco {
    public Misiles(Barco barco) {
        super(barco);
    }
    
    @Override
    public int obtenerAtaque() {
        return barco.obtenerAtaque() + 40;
    }
    
    @Override
    public String obtenerDescripcion() {
        return barco.obtenerDescripcion() + " + Misiles";
    }
}
