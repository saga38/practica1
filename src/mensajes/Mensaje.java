package mensajes;

public abstract class Mensaje {
    private String remitente;
    private String destinatario;
    private String texto;
    public Mensaje(String remitente, String destinatario, String texto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    abstract void enviar();

}
