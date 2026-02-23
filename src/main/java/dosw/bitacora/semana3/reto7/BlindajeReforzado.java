package dosw.bitacora.semana3.reto7;

public class BlindajeReforzado extends MejoradorBarco {
    public BlindajeReforzado(Barco barco) {
        super(barco);
    }
    
    @Override
    public int obtenerDefensa() {
        return barco.obtenerDefensa() + 30;
    }
    
    @Override
    public String obtenerDescripcion() {
        return barco.obtenerDescripcion() + " + Blindaje reforzado";
    }
}
