package ejercicio2;

public class Saldonico extends Validonico {
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
