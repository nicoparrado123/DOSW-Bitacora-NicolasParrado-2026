package ejercicio2;

// adaptador para usar stripe con nuestra interfaz de procesador
public class StripeAdapternico implements Procesadornico {
    private Stripenico stripeAPI;

    public StripeAdapternico() {
        this.stripeAPI = new Stripenico();
    }

    // adapta el metodo de stripe a nuestra interfaz
    @Override
    public boolean procesarPago(double monto, String cuenta) {
        stripeAPI.charge(monto, cuenta);
        return true;
    }
}
