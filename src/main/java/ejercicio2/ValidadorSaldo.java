package ejercicio2;

// Concrete Handler - Valida saldo
public class ValidadorSaldo extends ValidadorPago {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("Validando saldo para monto: $" + monto);
        if (monto > 10000) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
