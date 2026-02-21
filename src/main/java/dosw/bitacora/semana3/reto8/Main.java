package dosw.bitacora.semana3.reto8;

public class Main {
    public static void main(String[] args) {
        Control pasaporteVisa = new ControlPasaporteVisa();
        Control antecedentes = new ControlAntecedentes();
        Control motivoViaje = new ControlMotivoViaje();
        Control aprobacionFinal = new AprobacionMigracion();
        
        pasaporteVisa.setSiguiente(antecedentes);
        antecedentes.setSiguiente(motivoViaje);
        motivoViaje.setSiguiente(aprobacionFinal);
        
        System.out.println("=== Caso 1: Persona con todos los documentos ===");
        Persona persona1 = new Persona("Juan Perez", true, true, false, "Turismo");
        pasaporteVisa.verificar(persona1);
        
        System.out.println("\n=== Caso 2: Persona sin visa ===");
        Persona persona2 = new Persona("Maria Lopez", true, false, false, "Negocios");
        pasaporteVisa.verificar(persona2);
        
        System.out.println("\n=== Caso 3: Persona con antecedentes ===");
        Persona persona3 = new Persona("Carlos Gomez", true, true, true, "Turismo");
        pasaporteVisa.verificar(persona3);
        
        System.out.println("\n=== Caso 4: Persona sin motivo de viaje ===");
        Persona persona4 = new Persona("Ana Martinez", true, true, false, "");
        pasaporteVisa.verificar(persona4);
    }
}
