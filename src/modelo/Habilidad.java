package modelo;

public class Habilidad {

    private String nombre;
    private String tipo;
    private int danio;
    private int costoEnergia;
    private int enfriamiento;

    public Habilidad(String nombre, String tipo, int danio, int costoEnergia, int enfriamiento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.danio = danio;
        this.costoEnergia = costoEnergia;
        this.enfriamiento = enfriamiento;
    }

    public void ejecutar() {
        System.out.println("Habilidad ejecutada: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public int getEnfriamiento() {
        return enfriamiento;
    }

    public void setEnfriamiento(int enfriamiento) {
        this.enfriamiento = enfriamiento;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
