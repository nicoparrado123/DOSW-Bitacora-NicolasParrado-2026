package ejercicio2;

public abstract class Validonico {
    protected Validonico siguiente;

    public void setSiguiente(Validonico siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean validar(double monto, String cuenta);
}
