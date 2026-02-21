package dosw.bitacora.semana3.reto1;

public class TransferenciaFactory extends PagoFactory {
    @Override
    public Pago crearPago() {
        return new PagoTransferencia();
    }
}
