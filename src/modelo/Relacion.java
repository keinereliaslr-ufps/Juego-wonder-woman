package modelo;

public class Relacion {

    private TipoRelacion tipo;
    private Personaje personaje1;
    private Personaje personaje2;

    public Relacion(TipoRelacion tipo, Personaje personaje1, Personaje personaje2) {
        this.tipo = tipo;
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public TipoRelacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoRelacion tipo) {
        this.tipo = tipo;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }
}
