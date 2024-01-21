// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import FactoryExample.FabricaDeHelados;
import FactoryExample.Helado;
import mensajes.Email;
import mensajes.Mensaje;
import mensajes.Whatapp;
import utils.*;

import java.util.ArrayList;
import java.util.List;
import  clasesException.*;


public class Main {
    public static void main(String[] args) {
        Helado heladoChocolate = FabricaDeHelados.crearHelado("chocolate");
        Helado heladoFresa = FabricaDeHelados.crearHelado("fresa");

        // Preparar los helados
        heladoChocolate.preparar();
        heladoFresa.preparar();
    }
}