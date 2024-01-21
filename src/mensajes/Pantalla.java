package mensajes;

public class Pantalla extends Mensaje {



    public Pantalla(String remitente, String destinatario, String texto) {
        super(remitente, destinatario, texto);

    }

    @Override
    public void enviar() {
        // Enviar el mensaje a pantalla
    }
}
