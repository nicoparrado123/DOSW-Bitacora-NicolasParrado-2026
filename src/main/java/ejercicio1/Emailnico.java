package ejercicio1;

public class Emailnico implements Notificonico {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}
