package modelo;

import java.util.ArrayList;

public class WonderWoman extends Personaje {

    private ArrayList<Habilidad> habilidades;
    private ArrayList<ObjetoEspecial> equipo;

    public WonderWoman() {
        super("Wonder Woman", "Themyscira", 120, 120);
        this.habilidades = new ArrayList<Habilidad>();
        this.equipo = new ArrayList<ObjetoEspecial>();
    }

    public void atacar() {
        System.out.println("Wonder Woman ataca.");
    }

    public void defender() {
        System.out.println("Wonder Woman se defiende.");
    }

    public void usarHabilidad(Habilidad h) {
        if (h != null) {
            h.ejecutar();
        }
    }

    public void usarObjeto(ObjetoEspecial o) {
        if (o != null) {
            o.activar();
        }
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList<ObjetoEspecial> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<ObjetoEspecial> equipo) {
        this.equipo = equipo;
    }
}
