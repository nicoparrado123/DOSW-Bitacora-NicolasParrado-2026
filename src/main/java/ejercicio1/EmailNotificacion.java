package ejercicio1;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando Email a " + destinatario + ": " + mensaje);
    }
}
