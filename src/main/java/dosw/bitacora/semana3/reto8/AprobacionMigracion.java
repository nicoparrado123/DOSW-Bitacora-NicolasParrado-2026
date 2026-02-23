package dosw.bitacora.semana3.reto8;

public class AprobacionMigracion extends Control {
    @Override
    public boolean verificar(Persona persona) {
        System.out.println("Aprobacion final de migracion concedida");
        System.out.println("Bienvenido a Estados Unidos, " + persona.getNombre());
        return true;
    }
}
