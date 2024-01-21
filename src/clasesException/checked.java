package clasesException;

public class checked {

    public void Array(){
        String[] arreglo = new String[2];
        try {
         System.out.println(arreglo[3]);

        }catch ( Exception e){
           e.printStackTrace();
           System.err.println("Error de arreglos");
        }

    }

    public void Numero(){
        try {

            String numero = "hola";
            int numeroEntero = Integer.parseInt(numero);
        } catch (NumberFormatException e) {

            System.out.println("El valor no es un número válido");
        }
    }


}
