package ejercicio1;

// Singleton - Asegura una única instancia del servicio
// Strategy - Permite cambiar el tipo de notificación dinámicamente
public class ServicioNotificaciones {
    private static ServicioNotificaciones instancia;
    private Notificacion estrategiaNotificacion;

    private ServicioNotificaciones() {
        // Constructor privado para Singleton
    }

    public static ServicioNotificaciones obtenerInstancia() {
        if (instancia == null) {
            instancia = new ServicioNotificaciones();
        }
        return instancia;
    }

    public void setEstrategiaNotificacion(Notificacion estrategia) {
        this.estrategiaNotificacion = estrategia;
    }

    public void notificar(String mensaje, String destinatario) {
        if (estrategiaNotificacion == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de notificación");
        }
        estrategiaNotificacion.enviar(mensaje, destinatario);
    }
}
