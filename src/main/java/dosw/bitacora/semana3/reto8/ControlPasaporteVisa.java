package dosw.bitacora.semana3.reto8;

public class ControlPasaporteVisa extends Control {
    @Override
    public boolean verificar(Persona persona) {
        if (!persona.tienePasaporte() || !persona.tieneVisa()) {
            System.out.println("Acceso denegado: Pasaporte o visa invalidos");
            return false;
        }
        System.out.println("Pasaporte y visa verificados correctamente");
        if (siguiente != null) {
            return siguiente.verificar(persona);
        }
        return true;
    }
}
