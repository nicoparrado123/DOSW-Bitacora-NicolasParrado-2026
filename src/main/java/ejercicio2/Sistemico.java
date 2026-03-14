package ejercicio2;

// sistema principal que coordina las validaciones y el procesamiento de pagos
public class Sistemico {
    private Validonico cadenaValidacion;
    private Procesadornico procesador;

    public Sistemico(Procesadornico procesador) {
        this.procesador = procesador;
        configurarValidaciones();
    }

    // aqui se arma la cadena de validaciones que debe pasar cada pago
    private void configurarValidaciones() {
        Saldonico validadorSaldo = new Saldonico();
        Fraudenico validadorFraude = new Fraudenico();
        Limitnico validadorLimite = new Limitnico();

        // se encadenan las validaciones en orden
        validadorSaldo.setSiguiente(validadorFraude);
        validadorFraude.setSiguiente(validadorLimite);

        this.cadenaValidacion = validadorSaldo;
    }

    // procesa un pago despues de pasar todas las validaciones
    public boolean procesarPago(double monto, String cuenta) {
        System.out.println("\n=== iniciando proceso de pago ===");
        if (cadenaValidacion.validar(monto, cuenta)) {
            System.out.println("validaciones exitosas. procesando pago...");
            return procesador.procesarPago(monto, cuenta);
        }
        System.out.println("pago rechazado por validaciones");
        return false;
    }
}
