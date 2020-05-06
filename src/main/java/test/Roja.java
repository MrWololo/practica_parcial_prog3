package test;

public class Roja extends TipoCerveza {

    public Roja(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, 15);
    }


    @Override
    public String toString() {
        return "Roja: " + super.toString();
    }

}