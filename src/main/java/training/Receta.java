package training;

import java.util.ArrayList;
import java.util.UUID;

public class Receta {

    private UUID id;
    private String nombre;
    private String pais;
    protected ArrayList<Ingrediente> ingredientes;

    public Receta(String nombre, String pais, ArrayList<Ingrediente> ingredientes) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.pais = pais;
        this.ingredientes = ingredientes;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    @Override
    public String toString() {
        return "Receta: {" + "'" + "nombre='" + nombre + "'" + ", pais='" + pais + "'" + ", ingredientes='"
                + ingredientes + "'" + "}";
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        boolean exists = false;

        for (Ingrediente deLista : ingredientes) {
            if (ingrediente.getNombre().compareTo(deLista.getNombre()) == 0) {
                exists = true;
                deLista.indicarCantidad(deLista.getCantidad() + ingrediente.getCantidad());
            }
        }
        if (!exists) {
            this.ingredientes.add(ingrediente);
        }

    }

    public void quitarIngrediente(UUID id) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getId() == id) {
                ingredientes.remove(ingrediente);
            }
        }
    }

}