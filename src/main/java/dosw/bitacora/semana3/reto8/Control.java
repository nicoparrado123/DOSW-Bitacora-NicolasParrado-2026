package dosw.bitacora.semana3.reto8;

public abstract class Control {
    protected Control siguiente;
    
    public void setSiguiente(Control siguiente) {
        this.siguiente = siguiente;
    }
    
    public abstract boolean verificar(Persona persona);
}
