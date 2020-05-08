package training;

public class Roja extends TipoCerveza {

    public Roja(String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(nombre, precio, ABV, descripcion, gluten, receta, 15);
    }


    @Override
    public String toString() {
        return "\n\nRoja: " + super.toString();
    }

}