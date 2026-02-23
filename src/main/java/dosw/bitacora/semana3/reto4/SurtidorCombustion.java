package dosw.bitacora.semana3.reto4;

public class SurtidorCombustion implements Surtidor {
    @Override
    public void cargarCombustible(double litros) {
        System.out.println("Cargando " + litros + " litros de combustible");
    }
}
