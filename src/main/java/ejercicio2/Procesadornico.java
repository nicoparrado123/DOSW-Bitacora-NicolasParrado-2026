package ejercicio2;

// interfaz para los diferentes procesadores de pago
public interface Procesadornico {
    boolean procesarPago(double monto, String cuenta);
}
