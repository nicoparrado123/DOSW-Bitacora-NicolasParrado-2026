package dosw.bitacora.semana3.reto4;

public class AdapterCargadorLento implements Surtidor {
    private CargadorLento cargadorLento;
    
    public AdapterCargadorLento(CargadorLento cargadorLento) {
        this.cargadorLento = cargadorLento;
    }
    
    @Override
    public void cargarCombustible(double litros) {
        double kwh = litros * 7.0;
        cargadorLento.cargarKwh(kwh);
    }
}
