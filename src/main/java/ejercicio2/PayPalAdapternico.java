package ejercicio2;

public class PayPalAdapternico implements Procesadornico {
    private PayPalnico payPalAPI;

    public PayPalAdapternico() {
        this.payPalAPI = new PayPalnico();
    }

    @Override
    public boolean procesarPago(double monto, String cuenta) {
        payPalAPI.enviarPago(cuenta, monto);
        return true;
    }
}
