package ejercicio2;

// Facade - Simplifica el uso del sistema de pagos
public class SistemaPagos {
    private ValidadorPago cadenaValidacion;
    private ProcesadorPago procesador;

    public SistemaPagos(ProcesadorPago procesador) {
        this.procesador = procesador;
        configurarValidaciones();
    }

    private void configurarValidaciones() {
        ValidadorSaldo validadorSaldo = new ValidadorSaldo();
        ValidadorFraude validadorFraude = new ValidadorFraude();
        ValidadorLimite validadorLimite = new ValidadorLimite();

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
