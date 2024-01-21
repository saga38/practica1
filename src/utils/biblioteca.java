package utils;

import java.util.ArrayList;

public class biblioteca {
    private ArrayList <libro> libros ;


    biblioteca(){
        this.libros= new ArrayList<>();
    }

    public int Add(libro lb1){
        int status = 0;
        try {
            this.libros.add(lb1);
            status = 1;
        }catch (Exception e){
            status =0;
        }

        return status;
    }
    public libro remove(String titulo){
        libro lb1 = new libro();
        for (libro elemento : this.libros) {
            if(elemento.getTitulo().equals(titulo)){
                lb1 = elemento;
                this.libros.remove(elemento);
                return lb1;
            }
        }
        return lb1;
    }


    public libro search(String titulo){
        libro lb1 = new libro();
        for (libro elemento : this.libros) {
            if(elemento.getTitulo().equals(titulo)){
                return elemento;
            }
        }
        return lb1;
    }




    public ArrayList<libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libro> libros) {
        this.libros = libros;
    }
}
