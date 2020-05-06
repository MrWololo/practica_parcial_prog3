package test;

public class Rubia extends TipoCerveza {

    public Rubia(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, 10);
    }

    @Override
    public String toString() {
        return "Rubia: " + super.toString();
    }

}