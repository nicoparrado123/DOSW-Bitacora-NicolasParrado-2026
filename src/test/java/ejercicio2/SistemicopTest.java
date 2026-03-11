package ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class SistemicopTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPagoExitosoConPayPal() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(100, "user@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("PayPal"));
    }

    @Test
    void testPagoExitosoConStripe() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(200, "tok_visa");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("Stripe"));
    }

    @Test
    void testValidacionSaldoInsuficiente() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(15000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("Saldo insuficiente"));
    }

    @Test
    void testValidacionFraude() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(100, "fraud@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("sospechosa"));
    }

    @Test
    void testValidacionLimiteExcedido() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(6000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("límite"));
    }

    @Test
    void testCadenaValidacionCompleta() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(500, "valid@test.com");
        assertTrue(resultado);
        String output = outputStream.toString();
        assertTrue(output.contains("Validando saldo"));
        assertTrue(output.contains("Validando fraude"));
        assertTrue(output.contains("Validando límite"));
    }

    @Test
    void testAdapterPayPal() {
        PayPalAdapternico adapter = new PayPalAdapternico();
        boolean resultado = adapter.procesarPago(100, "test@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("PayPal"));
    }

    @Test
    void testAdapterStripe() {
        StripeAdapternico adapter = new StripeAdapternico();
        boolean resultado = adapter.procesarPago(200, "tok_test");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("Stripe"));
    }
}
