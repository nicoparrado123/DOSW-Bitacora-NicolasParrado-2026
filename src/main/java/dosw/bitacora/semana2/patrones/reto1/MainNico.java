package dosw.bitacora.semana2.patrones.reto1;

public class MainNico {
    
    public static void main(String[] args) {
        Notificacion notif1 = FactoryNico.crear("email");
        notif1.enviar("Bienvenido al sistema");
        
        Notificacion notif2 = FactoryNico.crear("sms");
        notif2.enviar("Tu codigo de verificacion es 1234");
        
        Notificacion notif3 = FactoryNico.crear("push");
        notif3.enviar("Tienes un nuevo mensaje");
    }
}
