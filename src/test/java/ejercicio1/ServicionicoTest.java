package ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

// pruebas para el servicio de notificaciones
class ServicionicoTest {
    private Servicionico servicio;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        servicio = Servicionico.obtenerInstancia();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    // verifica que siempre se obtenga la misma instancia del servicio
    @Test
    void testSingletonInstancia() {
        Servicionico instancia1 = Servicionico.obtenerInstancia();
        Servicionico instancia2 = Servicionico.obtenerInstancia();
        assertSame(instancia1, instancia2, "debe retornar la misma instancia");
    }

    // prueba el envio de notificaciones por email
    @Test
    void testEnviarEmail() {
        servicio.setEstrategiaNotificacion(new Emailnico());
        servicio.notificar("hola", "test@email.com");
        assertTrue(outputStream.toString().contains("email"));
    }

    // prueba el envio de notificaciones por sms
    @Test
    void testEnviarSMS() {
        servicio.setEstrategiaNotificacion(new SMSnico());
        servicio.notificar("hola", "+123456789");
        assertTrue(outputStream.toString().contains("sms"));
    }

    // prueba el envio de notificaciones push
    @Test
    void testEnviarPush() {
        servicio.setEstrategiaNotificacion(new Pushnico());
        servicio.notificar("hola", "device123");
        assertTrue(outputStream.toString().contains("push"));
    }

    // verifica que se pueda cambiar el tipo de notificacion en tiempo de ejecucion
    @Test
    void testCambiarEstrategiaDinamicamente() {
        servicio.setEstrategiaNotificacion(new Emailnico());
        servicio.notificar("test1", "user@test.com");
        
        servicio.setEstrategiaNotificacion(new SMSnico());
        servicio.notificar("test2", "+123");
        
        String output = outputStream.toString();
        assertTrue(output.contains("email"));
        assertTrue(output.contains("sms"));
    }

    // verifica que lance error si no se configura una estrategia
    @Test
    void testSinEstrategiaConfigurada() {
        Servicionico nuevoServicio = Servicionico.obtenerInstancia();
        nuevoServicio.setEstrategiaNotificacion(null);
        
        assertThrows(IllegalStateException.class, () -> {
            nuevoServicio.notificar("test", "destino");
        });
    }
}
