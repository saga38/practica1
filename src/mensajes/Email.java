package mensajes;

public class Email  extends Mensaje {
    private String asunto;
    private String destinatarioEmail;

    public Email(String remitente, String destinatario, String texto) {
        super(remitente, destinatario, texto);
        this.asunto = asunto;
        this.destinatarioEmail = destinatarioEmail;
    }

    @Override
    public void enviar() {
        // Enviar el mensaje de correo electrónico
    }
}
