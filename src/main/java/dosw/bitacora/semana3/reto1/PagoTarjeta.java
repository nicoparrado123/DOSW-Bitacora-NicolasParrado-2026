package dosw.bitacora.semana3.reto1;

public class PagoTarjeta implements Pago {
    @Override
    public void procesar(double monto) {
        System.out.println("Pago con Tarjeta de crédito por $ " + monto);
    }
}
