package ejercicio1;

public class Servicionico {
    private static Servicionico instancia;
    private Notificonico estrategiaNotificacion;

    private Servicionico() {
    }

    public static Servicionico obtenerInstancia() {
        if (instancia == null) {
            instancia = new Servicionico();
        }
        return instancia;
    }

    public void setEstrategiaNotificacion(Notificonico estrategia) {
        this.estrategiaNotificacion = estrategia;
    }

    public void notificar(String mensaje, String destinatario) {
        if (estrategiaNotificacion == null) {
            throw new IllegalStateException("No se ha configurado una estrategia de notificación");
        }
        estrategiaNotificacion.enviar(mensaje, destinatario);
    }
}
