package ejercicio2;

// Adaptee - API externa de PayPal
public class PayPalAPI {
    public void enviarPago(String email, double cantidad) {
        System.out.println("Pago de $" + cantidad + " enviado via PayPal a " + email);
    }
}
