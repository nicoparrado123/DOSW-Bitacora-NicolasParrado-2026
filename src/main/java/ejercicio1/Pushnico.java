package ejercicio1;

public class Pushnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Push Notification a " + destinatario + ": " + mensaje);
    }
}
