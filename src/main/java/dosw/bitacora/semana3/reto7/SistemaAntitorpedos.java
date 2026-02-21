package dosw.bitacora.semana3.reto7;

public class SistemaAntitorpedos extends MejoradorBarco {
    public SistemaAntitorpedos(Barco barco) {
        super(barco);
    }
    
    @Override
    public int obtenerAtaque() {
        return barco.obtenerAtaque() + 20;
    }
    
    @Override
    public String obtenerDescripcion() {
        return barco.obtenerDescripcion() + " + Sistema antitorpedos";
    }
}
