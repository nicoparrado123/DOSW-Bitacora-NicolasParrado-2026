package dosw.bitacora.semana3.reto4;

public class AdapterCargadorRapido implements Surtidor {
    private CargadorRapido cargadorRapido;
    
    public AdapterCargadorRapido(CargadorRapido cargadorRapido) {
        this.cargadorRapido = cargadorRapido;
    }
    
    @Override
    public void cargarCombustible(double litros) {
        double kwh = litros * 8.0;
        cargadorRapido.cargarKwh(kwh);
    }
}
