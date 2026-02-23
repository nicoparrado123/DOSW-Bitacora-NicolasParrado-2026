package dosw.bitacora.semana3.reto8;

public class ControlMotivoViaje extends Control {
    @Override
    public boolean verificar(Persona persona) {
        if (persona.getMotivoViaje() == null || persona.getMotivoViaje().isEmpty()) {
            System.out.println("Acceso denegado: Motivo de viaje no especificado");
            return false;
        }
        System.out.println("Motivo de viaje aceptado: " + persona.getMotivoViaje());
        if (siguiente != null) {
            return siguiente.verificar(persona);
        }
        return true;
    }
}
