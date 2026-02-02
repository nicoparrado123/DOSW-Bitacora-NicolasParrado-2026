package dosw.bitacora.semana2.patrones;

public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Push: " + mensaje);
    }
}
