package ejercicio1;

// servicio de notificaciones usando singleton para que solo haya una instancia
public class Servicionico {
    private static Servicionico instancia;
    private Notificonico estrategiaNotificacion;

    // constructor privado para que no se pueda crear desde afuera
    private Servicionico() {
    }

    // metodo para obtener la unica instancia del servicio
    public static Servicionico obtenerInstancia() {
        if (instancia == null) {
            instancia = new Servicionico();
        }
        return instancia;
    }

    // aqui se define que tipo de notificacion se va a usar
    public void setEstrategiaNotificacion(Notificonico estrategia) {
        this.estrategiaNotificacion = estrategia;
    }

    // envia la notificacion usando la estrategia que se haya configurado
    public void notificar(String mensaje, String destinatario) {
        if (estrategiaNotificacion == null) {
            throw new IllegalStateException("no se ha configurado una estrategia de notificacion");
        }
        estrategiaNotificacion.enviar(mensaje, destinatario);
    }
}
