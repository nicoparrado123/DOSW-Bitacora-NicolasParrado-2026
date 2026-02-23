package dosw.bitacora.semana3.reto8;

public class ControlAntecedentes extends Control {
    @Override
    public boolean verificar(Persona persona) {
        if (persona.tieneAntecedentes()) {
            System.out.println("Acceso denegado: Antecedentes penales encontrados");
            return false;
        }
        System.out.println("Control de antecedentes aprobado");
        if (siguiente != null) {
            return siguiente.verificar(persona);
        }
        return true;
    }
}
