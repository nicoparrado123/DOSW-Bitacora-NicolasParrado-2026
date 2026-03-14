package ejercicio2;

// api de stripe para procesar pagos
public class Stripenico {
    // simula el cargo de un pago por stripe
    public void charge(double amount, String token) {
        System.out.println("cargo de $" + amount + " procesado via stripe con token " + token);
    }
}
