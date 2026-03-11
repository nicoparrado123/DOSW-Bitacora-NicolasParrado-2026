package ejercicio2;

public class Limitnico extends Validonico {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("Validando límite de transacción");
        if (monto > 5000) {
            System.out.println("Monto excede el límite permitido");
            return false;
        }
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
