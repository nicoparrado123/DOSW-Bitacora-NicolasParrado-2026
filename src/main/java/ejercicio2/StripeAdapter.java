package ejercicio2;

// Adapter - Adapta Stripe a nuestra interfaz
public class StripeAdapter implements ProcesadorPago {
    private StripeAPI stripeAPI;

    public StripeAdapter() {
        this.stripeAPI = new StripeAPI();
    }

    @Override
    public boolean procesarPago(double monto, String cuenta) {
        stripeAPI.charge(monto, cuenta);
        return true;
    }
}
