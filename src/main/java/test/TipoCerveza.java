package test;

public abstract class TipoCerveza extends Cerveza {

    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    protected TipoCerveza(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten,
            Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descripcion);
        this.gluten = gluten;
        this.porcentajeComplejidad = porcentajeComplejidad;
        this.receta = receta;
    }

    protected boolean isGluten() {
        return this.gluten;
    }

    protected Receta getReceta() {
        return this.receta;
    }

    protected float getPorcentajeComplejidad() {
        return this.porcentajeComplejidad;
    }

    @Override
    public String toString() {
        return "{" + " gluten='" + isGluten() + "'" + ", receta='" + getReceta() + "'" + ", porcentajeComplejidad='"
                + getPorcentajeComplejidad() + "'" + "}";
    }

    public void fabricarConSinGluten(Receta re, boolean gluten) {
        this.receta = re;
        this.gluten = gluten;
    }

    @Override
    public float calcularCostoFabricacion() {
        float total = 0;
        for (Ingrediente ingrediente : getReceta().ingredientes) {
            total += (ingrediente.getPrecioUnidad() * ingrediente.getCantidad());
        }

        total += (total * getPorcentajeComplejidad() / 100);

        return isGluten() ? total : total + (total * 2 / 100);

    }

}