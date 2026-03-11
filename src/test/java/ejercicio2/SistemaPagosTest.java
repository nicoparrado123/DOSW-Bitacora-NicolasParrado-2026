package ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class SistemaPagosTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPagoExitosoConPayPal() {
        SistemaPagos sistema = new SistemaPagos(new PayPalAdapter());
        boolean resultado = sistema.procesarPago(100, "user@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("PayPal"));
    }

    @Test
    void testPagoExitosoConStripe() {
        SistemaPagos sistema = new SistemaPagos(new StripeAdapter());
        boolean resultado = sistema.procesarPago(200, "tok_visa");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("Stripe"));
    }

    @Test
    void testValidacionSaldoInsuficiente() {
        SistemaPagos sistema = new SistemaPagos(new PayPalAdapter());
        boolean resultado = sistema.procesarPago(15000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("Saldo insuficiente"));
    }

    @Test
    void testValidacionFraude() {
        SistemaPagos sistema = new SistemaPagos(new StripeAdapter());
        boolean resultado = sistema.procesarPago(100, "fraud@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("sospechosa"));
    }

    @Test
    void testValidacionLimiteExcedido() {
        SistemaPagos sistema = new SistemaPagos(new PayPalAdapter());
        boolean resultado = sistema.procesarPago(6000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("límite"));
    }

    @Test
    void testCadenaValidacionCompleta() {
        SistemaPagos sistema = new SistemaPagos(new StripeAdapter());
        boolean resultado = sistema.procesarPago(500, "valid@test.com");
        assertTrue(resultado);
        String output = outputStream.toString();
        assertTrue(output.contains("Validando saldo"));
        assertTrue(output.contains("Validando fraude"));
        assertTrue(output.contains("Validando límite"));
    }

    @Test
    void testAdapterPayPal() {
        PayPalAdapter adapter = new PayPalAdapter();
        boolean resultado = adapter.procesarPago(100, "test@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("PayPal"));
    }

    @Test
    void testAdapterStripe() {
        StripeAdapter adapter = new StripeAdapter();
        boolean resultado = adapter.procesarPago(200, "tok_test");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("Stripe"));
    }
}
