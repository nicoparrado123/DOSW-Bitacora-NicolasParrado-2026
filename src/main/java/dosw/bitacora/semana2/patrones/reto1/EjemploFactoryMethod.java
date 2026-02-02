package dosw.bitacora.semana2.patrones.reto1;

public class EjemploFactoryMethod {
    
    public static void main(String[] args) {
        Notificacion notif1 = NotificacionFactory.crearNotificacion("email");
        notif1.enviar("Bienvenido al sistema");
        
        Notificacion notif2 = NotificacionFactory.crearNotificacion("sms");
        notif2.enviar("Tu codigo de verificacion es 1234");
        
        Notificacion notif3 = NotificacionFactory.crearNotificacion("push");
        notif3.enviar("Tienes un nuevo mensaje");
    }
}
