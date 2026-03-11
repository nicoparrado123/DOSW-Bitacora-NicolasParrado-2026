package ejercicio2;

public class Sistemico {
    private Validonico cadenaValidacion;
    private Procesadornico procesador;

    public Sistemico(Procesadornico procesador) {
        this.procesador = procesador;
        configurarValidaciones();
    }

    private void configurarValidaciones() {
        Saldonico validadorSaldo = new Saldonico();
        Fraudenico validadorFraude = new Fraudenico();
        Limitnico validadorLimite = new Limitnico();

        validadorSaldo.setSiguiente(validadorFraude);
        validadorFraude.setSiguiente(validadorLimite);

        this.cadenaValidacion = validadorSaldo;
    }

    public boolean procesarPago(double monto, String cuenta) {
        System.out.println("\n=== Iniciando proceso de pago ===");
        if (cadenaValidacion.validar(monto, cuenta)) {
            System.out.println("Validaciones exitosas. Procesando pago...");
            return procesador.procesarPago(monto, cuenta);
        }
        System.out.println("Pago rechazado por validaciones");
        return false;
    }
}
