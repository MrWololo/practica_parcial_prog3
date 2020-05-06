package test;

public class Negra extends TipoCerveza {

    public Negra(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, 20);
    }

    @Override
    public String toString() {
        return "Negra: " + super.toString();
    }
}