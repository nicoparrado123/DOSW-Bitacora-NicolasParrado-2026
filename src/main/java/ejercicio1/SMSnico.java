package ejercicio1;

public class SMSnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
