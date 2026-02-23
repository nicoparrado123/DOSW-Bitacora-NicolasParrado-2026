package dosw.bitacora.semana3.reto7;

public class RadarAvanzado extends MejoradorBarco {
    public RadarAvanzado(Barco barco) {
        super(barco);
    }
    
    @Override
    public int obtenerAtaque() {
        return barco.obtenerAtaque() + 10;
    }
    
    @Override
    public String obtenerDescripcion() {
        return barco.obtenerDescripcion() + " + Radar avanzado";
    }
}
