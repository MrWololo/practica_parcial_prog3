package training;

import java.util.UUID;

public abstract class Cerveza {

    private UUID id;
    private String nombre;
    private float precio;
    private float ABV;
    private String descripcion;

    public Cerveza(String nombre, float precio, float ABV, String descripcion) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.precio = precio;
        this.ABV = ABV;
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public float getABV() {
        return this.ABV;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public String toString() {
        return "\nCerveza: {" + "'" + "nombre='" + getNombre() + "'" + ", precio='" + getPrecio() + "'" + ", ABV='" + getABV()
                + "'" + ", descripcion='" + getDescripcion() + "'" + "}";
    }

    public abstract float calcularCostoFabricacion();

}