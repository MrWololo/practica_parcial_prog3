package training;

import java.util.UUID;

public class Ingrediente implements Cloneable {

    private UUID id;
    private String nombre;
    private String descripcion;
    private float cantidad;
    private float PrecioUnidad;

    public Ingrediente(String nombre, String descripcion, float PrecioUnidad) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.PrecioUnidad = PrecioUnidad;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public float getCantidad() {
        return this.cantidad;
    }

    public float getPrecioUnidad() {
        return this.PrecioUnidad;
    }

    @Override
    public String toString() {
        return "\n{" + "'" + "nombre='" + getNombre() + "'" + ", descripcion='" + getDescripcion() + "'" + ", cantidad='"
                + getCantidad() + "'" + ", PrecioUnidad='" + getPrecioUnidad() + "'" + "}";
    }

    @Override
    public Object clone() {
        try {
            return (Ingrediente) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Ingrediente indicarCantidad(float cantidad) {
        this.cantidad = cantidad;
        return (Ingrediente) clone();
    }

}