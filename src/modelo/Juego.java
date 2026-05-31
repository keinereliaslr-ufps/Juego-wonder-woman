package modelo;

import java.util.ArrayList;

public class Juego {

    private String titulo;
    private ArrayList<String> plataformas;
    private ArrayList<Lugar> lugares;
    private ArrayList<Evento> eventos;

    public Juego() {
        this.titulo = "Juego Wonder Woman";
        this.plataformas = new ArrayList<String>();
        this.lugares = new ArrayList<Lugar>();
        this.eventos = new ArrayList<Evento>();
    }

    public static void main(String[] args) {
        main.Main.main(args);
    }

    public void iniciar() {
        System.out.println("Iniciando juego: " + titulo);
    }

    public void guardar() {
        System.out.println("Guardado simple (sin archivos). Datos en memoria.");
    }

    public void cargar() {
        System.out.println("Cargando datos simples en memoria.");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<String> plataformas) {
        this.plataformas = plataformas;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
}
