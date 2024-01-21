package mensajes;

public class Whatapp extends Mensaje {
    private String asunto;
    private String destinatarioWhatapp;

    public Whatapp(String remitente, String destinatario, String texto,String asunto) {
        super(remitente, destinatario, texto);
        this.asunto = asunto;
        this.destinatarioWhatapp = destinatario;
    }

    @Override
    public void enviar() {
        System.out.println(this.getTexto());
    }
}
