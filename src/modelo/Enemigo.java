package modelo;

public class Enemigo extends Personaje {

    private int nivel;

    public Enemigo(String nombre, String origen, int vida, int energia, int nivel) {
        super(nombre, origen, vida, energia);
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(getNombre() + " ataca con nivel " + nivel);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
