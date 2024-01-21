package FactoryExample2;

// Clases concretas que extienden la clase abstracta
class HeladoChocolate extends Helado {
    @Override
    public void preparar() {
        System.out.println("Preparando helado de chocolate");
    }
}

class HeladoFresa extends Helado {
    @Override
    public void preparar() {
        System.out.println("Preparando helado de fresa");
    }
}

// Factory que crea instancias de helados
class FabricaHelados {
    // Método para crear instancias de helados
    public static Helado crearHelado(String sabor) {
        switch (sabor.toLowerCase()) {
            case "chocolate":
                return new HeladoChocolate();
            case "fresa":
                return new HeladoFresa();
            default:
                throw new IllegalArgumentException("Sabor de helado no válido: " + sabor);
        }
    }
}