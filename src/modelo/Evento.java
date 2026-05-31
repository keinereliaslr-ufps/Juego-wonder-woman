package modelo;

public abstract class Evento {

    private String descripcion;

    public Evento(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void ejecutar();

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
