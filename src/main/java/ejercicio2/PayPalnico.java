package ejercicio2;

// api de paypal para procesar pagos
public class PayPalnico {
    // simula el envio de un pago por paypal
    public void enviarPago(String email, double cantidad) {
        System.out.println("pago de $" + cantidad + " enviado via paypal a " + email);
    }
}
