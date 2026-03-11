package ejercicio2;

// Adaptee - API externa de Stripe
public class StripeAPI {
    public void charge(double amount, String token) {
        System.out.println("Cargo de $" + amount + " procesado via Stripe con token " + token);
    }
}
