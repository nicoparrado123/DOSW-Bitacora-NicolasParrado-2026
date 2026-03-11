package ejercicio1;

public class SMSNotificacion implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
