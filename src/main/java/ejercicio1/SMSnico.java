package ejercicio1;

// clase para enviar notificaciones por mensaje de texto
public class SMSnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        // simula el envio de un sms
        System.out.println("enviando sms a " + destinatario + ": " + mensaje);
    }
}
