package test;

import java.util.ArrayList;

public class Fabrica {

    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Cerveza> cervezas = new ArrayList<Cerveza>();

    public Fabrica(int id, String nombre, String direccion, ArrayList<Cerveza> cervezas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cervezas = cervezas;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public ArrayList<Cerveza> getCervezas() {
        return cervezas;
    }

    public void listarCervezas() {
        System.out.println(getCervezas().toString());
    }

    public void agregarCerveza(Cerveza cerveza) {
        boolean exists = false;
        try {
            for (Cerveza deLista : cervezas) {
                if (cerveza.getNombre().compareTo(deLista.getNombre()) == 0) {
                    exists = true;
                }
            }
            if (!exists) {
                cervezas.add(cerveza);
            } else {
                throw new Exception("Item ya existe");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void quitarCerveza(int id) {
        for (Cerveza cerveza : cervezas) {
            if (cerveza.getId() == id) {
                cervezas.remove(cerveza);
            }
        }
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", direccion='" + getDireccion() + "'"
                + ", cervezas='" + getCervezas().toString() + "'" + "}";
    }

}