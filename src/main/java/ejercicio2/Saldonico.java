package ejercicio2;

// valida que haya saldo suficiente para el pago
public class Saldonico extends Validonico {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("validando saldo para monto: $" + monto);
        // si el monto es muy alto se rechaza
        if (monto > 10000) {
            System.out.println("saldo insuficiente");
            return false;
        }
        // si pasa esta validacion, continua con la siguiente
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
