package dosw.bitacora.semana3.reto4;

public class Main {
    public static void main(String[] args) {
        SistemaCentral sistema = new SistemaCentral();
        
        System.out.println("=== Vehículo a combustión ===");
        Surtidor combustion = new SurtidorCombustion();
        sistema.atenderVehiculo(combustion, 10.0);
        
        System.out.println("\n=== Vehículo eléctrico (cargador rápido) ===");
        CargadorRapido cargadorRapido = new CargadorRapido();
        Surtidor adapterRapido = new AdapterCargadorRapido(cargadorRapido);
        sistema.atenderVehiculo(adapterRapido, 10.0);
        
        System.out.println("\n=== Vehículo híbrido (cargador lento) ===");
        CargadorLento cargadorLento = new CargadorLento();
        Surtidor adapterLento = new AdapterCargadorLento(cargadorLento);
        sistema.atenderVehiculo(adapterLento, 10.0);
    }
}
