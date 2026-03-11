package ejercicio2;

// Adapter - Adapta PayPal a nuestra interfaz
public class PayPalAdapter implements ProcesadorPago {
    private PayPalAPI payPalAPI;

    public PayPalAdapter() {
        this.payPalAPI = new PayPalAPI();
    }

    @Override
    public boolean procesarPago(double monto, String cuenta) {
        payPalAPI.enviarPago(cuenta, monto);
        return true;
    }
}
