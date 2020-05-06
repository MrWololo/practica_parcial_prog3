package test;

public class Ingrediente {

    private int id;
    private String nombre;
    private String descripcion;
    private float cantidad;
    private float PrecioUnidad;

    public Ingrediente(int id, String nombre, String descripcion, float PrecioUnidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.PrecioUnidad = PrecioUnidad;
    }


    public int getId() {
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
        return "{" + " id='" + id + "'" + ", nombre='" + nombre + "'" + ", descripcion='" + descripcion + "'"
                + ", cantidad='" + cantidad + "'" + ", PrecioUnidad='" + PrecioUnidad + "'" + "}";
    }

    public void indicarCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

}