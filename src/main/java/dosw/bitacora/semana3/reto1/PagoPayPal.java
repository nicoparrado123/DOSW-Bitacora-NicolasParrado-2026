package dosw.bitacora.semana3.reto1;

public class PagoPayPal implements Pago {
    @Override
    public void procesar(double monto) {
        System.out.println("Pago con PayPal por $ " + monto);
    }
}
