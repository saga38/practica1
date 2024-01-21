package mensajes;

public class Sms extends Mensaje {
    private String asunto;
    private String destinatarioSMS;

    public Sms(String remitente, String destinatario, String texto) {
        super(remitente, destinatario, texto);
        this.asunto = asunto;
        this.destinatarioSMS = destinatarioSMS;
    }

    @Override
    public void enviar() {
        // Enviar el mensaje a SMS
    }

}
