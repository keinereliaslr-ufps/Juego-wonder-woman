package modelo;

import java.util.ArrayList;

public class Personaje {

    private String nombre;
    private String origen;
    private int vida;
    private int energia;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Relacion> relaciones;

    public Personaje(String nombre, String origen, int vida, int energia) {
        this.nombre = nombre;
        this.origen = origen;
        this.vida = vida;
        this.energia = energia;
        this.habilidades = new ArrayList<Habilidad>();
        this.relaciones = new ArrayList<Relacion>();
    }

    public void hablar() {
        System.out.println(nombre + " dice: ¡Por la justicia!");
    }

    public void mover() {
        System.out.println(nombre + " se mueve al siguiente punto.");
    }

    public void interactuarCon(Personaje p) {
        System.out.println(nombre + " interactúa con " + p.getNombre());
    }

    public void establecerRelacion(Personaje p, TipoRelacion tipo) {
        Relacion relacion = new Relacion(tipo, this, p);
        relaciones.add(relacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
