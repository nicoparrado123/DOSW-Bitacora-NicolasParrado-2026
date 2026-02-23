package dosw.bitacora.semana3.reto11;

public class Navegador {
    private EstrategiaRuta estrategia;
    
    public void setEstrategia(EstrategiaRuta estrategia) {
        this.estrategia = estrategia;
    }
    
    public void calcularRuta(String origen, String destino) {
        if (estrategia != null) {
            estrategia.calcularRuta(origen, destino);
        }
    }
}
