package ejercicio1;

public class PushNotificacion implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Push Notification a " + destinatario + ": " + mensaje);
    }
}
