package ejercicio2;

public class Stripenico {
    public void charge(double amount, String token) {
        System.out.println("Cargo de $" + amount + " procesado via Stripe con token " + token);
    }
}
