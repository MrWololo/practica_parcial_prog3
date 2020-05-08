package training;

public class Rubia extends TipoCerveza {

    public Rubia(String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta) {
        super(nombre, precio, ABV, descripcion, gluten, receta, 10);
    }

    @Override
    public String toString() {
        return "\n\nRubia: " + super.toString();
    }

}