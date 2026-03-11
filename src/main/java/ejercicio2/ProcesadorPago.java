package ejercicio2;

// Target - Interfaz común para todos los procesadores de pago
public interface ProcesadorPago {
    boolean procesarPago(double monto, String cuenta);
}
