package dosw.bitacora.semana3.reto7;

public abstract class MejoradorBarco implements Barco {
    protected Barco barco;
    
    public MejoradorBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public int obtenerAtaque() {
        return barco.obtenerAtaque();
    }
    
    @Override
    public int obtenerDefensa() {
        return barco.obtenerDefensa();
    }
    
    @Override
    public String obtenerDescripcion() {
        return barco.obtenerDescripcion();
    }
}
