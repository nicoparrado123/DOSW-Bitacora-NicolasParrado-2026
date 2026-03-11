package ejercicio2;

public class Fraudenico extends Validonico {
    @Override
    public boolean validar(double monto, String cuenta) {
        System.out.println("Validando fraude para cuenta: " + cuenta);
        if (cuenta.contains("fraud")) {
            System.out.println("Transacción sospechosa detectada");
            return false;
        }
        if (siguiente != null) {
            return siguiente.validar(monto, cuenta);
        }
        return true;
    }
}
