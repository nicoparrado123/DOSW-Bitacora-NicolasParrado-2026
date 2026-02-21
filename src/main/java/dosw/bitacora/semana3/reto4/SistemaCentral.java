package dosw.bitacora.semana3.reto4;

public class SistemaCentral {
    public void atenderVehiculo(Surtidor surtidor, double litros) {
        System.out.println("Sistema central procesando...");
        surtidor.cargarCombustible(litros);
    }
}
