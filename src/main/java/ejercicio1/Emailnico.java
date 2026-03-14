package ejercicio1;

// clase para enviar notificaciones por correo
public class Emailnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        // simula el envio de un email
        System.out.println("enviando email a " + destinatario + ": " + mensaje);
    }
}
