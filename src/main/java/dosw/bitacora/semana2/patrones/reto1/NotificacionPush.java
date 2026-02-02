package dosw.bitacora.semana2.patrones.reto1;

public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Push: " + mensaje);
    }
}
