package modelo;

import java.util.ArrayList;

public class Lugar {

    private String nombre;
    private String descripcion;
    private ArrayList<Personaje> personajes;

    public Lugar(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personajes = new ArrayList<Personaje>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
