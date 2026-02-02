package dosw.bitacora.semana2.patrones.reto1;

public class FactoryNico {
    
    public static Notificacion crear(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSMS();
            case "push":
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo no valido: " + tipo);
        }
    }
}
