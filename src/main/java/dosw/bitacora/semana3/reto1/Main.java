package dosw.bitacora.semana3.reto1;

public class Main {
    public static void main(String[] args) {
        PagoFactory factory1 = new TarjetaFactory();
        factory1.procesarPago(150.50);
        
        PagoFactory factory2 = new PayPalFactory();
        factory2.procesarPago(200.75);
        
        PagoFactory factory3 = new TransferenciaFactory();
        factory3.procesarPago(500.00);
    }
}
