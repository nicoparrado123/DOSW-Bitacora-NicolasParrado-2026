package ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

// pruebas para el sistema de procesamiento de pagos
class SistemicopTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    // verifica que un pago exitoso se procese con paypal
    @Test
    void testPagoExitosoConPayPal() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(100, "user@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("paypal"));
    }

    // verifica que un pago exitoso se procese con stripe
    @Test
    void testPagoExitosoConStripe() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(200, "tok_visa");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("stripe"));
    }

    // prueba que se rechace un pago cuando no hay saldo suficiente
    @Test
    void testValidacionSaldoInsuficiente() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(15000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("saldo insuficiente"));
    }

    // prueba que se detecten transacciones fraudulentas
    @Test
    void testValidacionFraude() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(100, "fraud@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("sospechosa"));
    }

    // prueba que se rechacen pagos que excedan el limite
    @Test
    void testValidacionLimiteExcedido() {
        Sistemico sistema = new Sistemico(new PayPalAdapternico());
        boolean resultado = sistema.procesarPago(6000, "user@test.com");
        assertFalse(resultado);
        assertTrue(outputStream.toString().contains("limite"));
    }

    // verifica que todas las validaciones se ejecuten en orden
    @Test
    void testCadenaValidacionCompleta() {
        Sistemico sistema = new Sistemico(new StripeAdapternico());
        boolean resultado = sistema.procesarPago(500, "valid@test.com");
        assertTrue(resultado);
        String output = outputStream.toString();
        assertTrue(output.contains("validando saldo"));
        assertTrue(output.contains("validando fraude"));
        assertTrue(output.contains("validando limite"));
    }

    // prueba el adaptador de paypal directamente
    @Test
    void testAdapterPayPal() {
        PayPalAdapternico adapter = new PayPalAdapternico();
        boolean resultado = adapter.procesarPago(100, "test@paypal.com");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("paypal"));
    }

    // prueba el adaptador de stripe directamente
    @Test
    void testAdapterStripe() {
        StripeAdapternico adapter = new StripeAdapternico();
        boolean resultado = adapter.procesarPago(200, "tok_test");
        assertTrue(resultado);
        assertTrue(outputStream.toString().contains("stripe"));
    }
}
