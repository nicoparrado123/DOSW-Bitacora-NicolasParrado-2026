package ejercicio2;

// Concrete Handler - Valida fraude
public class ValidadorFraude extends ValidadorPago {
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
