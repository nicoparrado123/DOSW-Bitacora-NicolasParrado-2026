package ejercicio2;

// Chain of Responsibility - Handler
public abstract class ValidadorPago {
    protected ValidadorPago siguiente;

    public void setSiguiente(ValidadorPago siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean validar(double monto, String cuenta);
}
