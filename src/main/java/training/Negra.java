package training;

public class Negra extends TipoCerveza {

    public Negra(String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(nombre, precio, ABV, descripcion, gluten, receta, 20);
    }

    @Override
    public String toString() {
        return "\n\nNegra: " + super.toString();
    }
}