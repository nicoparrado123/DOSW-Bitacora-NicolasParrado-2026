package ejercicio2;

// adaptador para usar paypal con nuestra interfaz de procesador
public class PayPalAdapternico implements Procesadornico {
    private PayPalnico payPalAPI;

    public PayPalAdapternico() {
        this.payPalAPI = new PayPalnico();
    }

    // adapta el metodo de paypal a nuestra interfaz
    @Override
    public boolean procesarPago(double monto, String cuenta) {
        payPalAPI.enviarPago(cuenta, monto);
        return true;
    }
}
