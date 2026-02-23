package dosw.bitacora.semana3.reto1;

public class TarjetaFactory extends PagoFactory {
    @Override
    public Pago crearPago() {
        return new PagoTarjeta();
    }
}
