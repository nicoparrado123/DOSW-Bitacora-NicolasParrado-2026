package ejercicio2;

// valida que el monto no exceda el limite permitido
public class Limitnico extends Validonico {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("validando limite de transaccion");
        // el limite maximo es 5000
        if (monto > 5000) {
            System.out.println("monto excede el limite permitido");
            return false;
        }
        // si pasa esta validacion, continua con la siguiente
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
