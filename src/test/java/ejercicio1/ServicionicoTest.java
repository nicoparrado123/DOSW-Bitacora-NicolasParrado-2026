package ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ServicionicoTest {
    private Servicionico servicio;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        servicio = Servicionico.obtenerInstancia();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testSingletonInstancia() {
        Servicionico instancia1 = Servicionico.obtenerInstancia();
        Servicionico instancia2 = Servicionico.obtenerInstancia();
        assertSame(instancia1, instancia2, "Debe retornar la misma instancia");
    }

    @Test
    void testEnviarEmail() {
        servicio.setEstrategiaNotificacion(new Emailnico());
        servicio.notificar("Hola", "test@email.com");
        assertTrue(outputStream.toString().contains("Enviando Email"));
    }

    @Test
    void testEnviarSMS() {
        servicio.setEstrategiaNotificacion(new SMSnico());
        servicio.notificar("Hola", "+123456789");
        assertTrue(outputStream.toString().contains("Enviando SMS"));
    }

    @Test
    void testEnviarPush() {
        servicio.setEstrategiaNotificacion(new Pushnico());
        servicio.notificar("Hola", "device123");
        assertTrue(outputStream.toString().contains("Enviando Push Notification"));
    }

    @Test
    void testCambiarEstrategiaDinamicamente() {
        servicio.setEstrategiaNotificacion(new Emailnico());
        servicio.notificar("Test1", "user@test.com");
        
        servicio.setEstrategiaNotificacion(new SMSnico());
        servicio.notificar("Test2", "+123");
        
        String output = outputStream.toString();
        assertTrue(output.contains("Enviando Email"));
        assertTrue(output.contains("Enviando SMS"));
    }

    @Test
    void testSinEstrategiaConfigurada() {
        Servicionico nuevoServicio = Servicionico.obtenerInstancia();
        nuevoServicio.setEstrategiaNotificacion(null);
        
        assertThrows(IllegalStateException.class, () -> {
            nuevoServicio.notificar("Test", "destino");
        });
    }
}
