package ejercicio2;

// valida que la transaccion no sea fraudulenta
public class Fraudenico extends Validonico {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("validando fraude para cuenta: " + cuenta);
        // si la cuenta tiene la palabra fraud se considera sospechosa
        if (cuenta.contains("fraud")) {
            System.out.println("transaccion sospechosa detectada");
            return false;
        }
        // si pasa esta validacion, continua con la siguiente
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
