package dosw.bitacora.semana3.reto1;

public class PagoTransferencia implements Pago {
    @Override
    public void procesar(double monto) {
        System.out.println("Pago con Transferencia bancaria por $ " + monto);
    }
}
