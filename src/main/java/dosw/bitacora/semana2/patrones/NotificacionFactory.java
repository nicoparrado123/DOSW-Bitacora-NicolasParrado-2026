package dosw.bitacora.semana2.patrones;

public class NotificacionFactory {
    
    public static Notificacion crearNotificacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSMS();
            case "push":
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificacion no valido: " + tipo);
        }
    }
}
