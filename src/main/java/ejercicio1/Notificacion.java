package ejercicio1;

// Strategy - Define la interfaz para los diferentes tipos de notificación
public interface Notificacion {
    void enviar(String mensaje, String destinatario);
}
