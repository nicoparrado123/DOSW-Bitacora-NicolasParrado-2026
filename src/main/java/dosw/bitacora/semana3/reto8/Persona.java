package dosw.bitacora.semana3.reto8;

public class Persona {
    private String nombre;
    private boolean tienePasaporte;
    private boolean tieneVisa;
    private boolean tieneAntecedentes;
    private String motivoViaje;
    
    public Persona(String nombre, boolean tienePasaporte, boolean tieneVisa, boolean tieneAntecedentes, String motivoViaje) {
        this.nombre = nombre;
        this.tienePasaporte = tienePasaporte;
        this.tieneVisa = tieneVisa;
        this.tieneAntecedentes = tieneAntecedentes;
        this.motivoViaje = motivoViaje;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean tienePasaporte() {
        return tienePasaporte;
    }
    
    public boolean tieneVisa() {
        return tieneVisa;
    }
    
    public boolean tieneAntecedentes() {
        return tieneAntecedentes;
    }
    
    public String getMotivoViaje() {
        return motivoViaje;
    }
}
