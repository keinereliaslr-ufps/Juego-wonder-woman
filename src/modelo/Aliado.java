package modelo;

public class Aliado extends Personaje {

    public Aliado(String nombre, String origen, int vida, int energia) {
        super(nombre, origen, vida, energia);
    }

    public void apoyar() {
        System.out.println(getNombre() + " está apoyando a Wonder Woman.");
    }

    public void asistirEnCombate() {
        System.out.println(getNombre() + " asiste durante el combate.");
    }
}
