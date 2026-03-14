package ejercicio1;

// clase para enviar notificaciones push al celular
public class Pushnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        // simula el envio de una notificacion push
        System.out.println("enviando notificacion push a " + destinatario + ": " + mensaje);
    }
}
