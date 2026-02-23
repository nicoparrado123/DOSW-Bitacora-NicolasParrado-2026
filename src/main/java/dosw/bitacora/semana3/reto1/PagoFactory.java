package dosw.bitacora.semana3.reto1;

public abstract class PagoFactory {
    public abstract Pago crearPago();
    
    public void procesarPago(double monto) {
        Pago pago = crearPago();
        pago.procesar(monto);
    }
}
