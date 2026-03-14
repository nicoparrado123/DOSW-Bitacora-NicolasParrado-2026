package ejercicio2;

// clase base para las validaciones, usa el patron chain of responsibility
public abstract class Validonico {
    protected Validonico siguiente;

    // establece cual es la siguiente validacion en la cadena
    public void setSiguiente(Validonico siguiente) {
        this.siguiente = siguiente;
    }

    // cada validacion implementa su propia logica
    public abstract boolean validar(double monto, String cuenta);
}
