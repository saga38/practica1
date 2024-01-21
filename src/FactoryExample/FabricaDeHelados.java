package FactoryExample;

public class FabricaDeHelados {
    public static Helado crearHelado(String sabor) {
        switch (sabor.toLowerCase()) {
            case "chocolate":
                return new HeladoDeChocolate();
            case "fresa":
                return new HeladoDeFresa();
            default:
                throw new IllegalArgumentException("Sabor de helado no válido: " + sabor);
        }
    }
}


class HeladoDeChocolate implements Helado {
    @Override
    public void preparar() {
        System.out.println("Preparando helado de chocolate");
    }
}

class HeladoDeFresa implements Helado {
    @Override
    public void preparar() {
        System.out.println("Preparando helado de fresa");
    }
}
