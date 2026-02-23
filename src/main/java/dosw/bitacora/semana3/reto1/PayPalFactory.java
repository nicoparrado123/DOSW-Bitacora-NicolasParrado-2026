package dosw.bitacora.semana3.reto1;

public class PayPalFactory extends PagoFactory {
    @Override
    public Pago crearPago() {
        return new PagoPayPal();
    }
}
