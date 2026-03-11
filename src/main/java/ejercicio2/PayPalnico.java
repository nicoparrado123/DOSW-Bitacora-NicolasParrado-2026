package ejercicio2;

public class PayPalnico {
    public void enviarPago(String email, double cantidad) {
        System.out.println("Pago de $" + cantidad + " enviado via PayPal a " + email);
    }
}
