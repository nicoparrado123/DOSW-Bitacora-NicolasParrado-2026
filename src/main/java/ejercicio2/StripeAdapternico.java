package ejercicio2;

public class StripeAdapternico implements Procesadornico {
    private Stripenico stripeAPI;

    public StripeAdapternico() {
        this.stripeAPI = new Stripenico();
    }

    @Override
    public boolean procesarPago(double monto, String cuenta) {
        stripeAPI.charge(monto, cuenta);
        return true;
    }
}
