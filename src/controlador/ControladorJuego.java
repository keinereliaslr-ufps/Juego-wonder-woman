package controlador;

import java.util.ArrayList;
import modelo.*;
import vista.VistaJuego;
import vista.VistaPrincipal;

public class ControladorJuego {

    private Juego juego;
    private WonderWoman wonderWoman;
    private VistaPrincipal vistaPrincipal;
    private VistaJuego vistaJuego;

    public ControladorJuego(Juego juego) {
        this.juego = juego;
        inicializarDatos();
    }

    private void inicializarDatos() {
        wonderWoman = new WonderWoman();
        wonderWoman.getHabilidades().add(new Habilidad("Golpe Amazona", "Fisico", 20, 10, 1));
        wonderWoman.getHabilidades().add(new Habilidad("Rayo del Lazo", "Magico", 30, 15, 2));
        wonderWoman.getEquipo().add(new LazoVerdad());
        wonderWoman.getEquipo().add(new EscudoAtenea());

        Lugar themyscira = new Themyscira();
        Lugar londres = new Londres();
        Lugar campoBatalla = new CampoBatalla();

        themyscira.agregarPersonaje(wonderWoman);
        londres.agregarPersonaje(new SteveTrevor());
        londres.agregarPersonaje(new Soldado("Soldado de Londres"));
        campoBatalla.agregarPersonaje(new Ares());

        juego.getLugares().add(themyscira);
        juego.getLugares().add(londres);
        juego.getLugares().add(campoBatalla);

        Enemigo enemigo = new Ares();
        juego.getEventos().add(new Dialogo("Encuentro", "Steve: Necesitamos tu ayuda, Diana."));
        juego.getEventos().add(new Combate("Batalla final", enemigo, new SteveTrevor()));
        juego.getPlataformas().add("PC");
    }

    public void mostrarVistaPrincipal() {
        vistaPrincipal = new VistaPrincipal(this);
        vistaPrincipal.setVisible(true);
    }

    public void abrirVistaJuego() {
        vistaJuego = new VistaJuego(this);
        vistaJuego.cargarLugares(obtenerLugares());
        vistaJuego.cargarHabilidades(wonderWoman.getHabilidades());
        vistaJuego.cargarEquipo(wonderWoman.getEquipo());
        vistaJuego.setVisible(true);
        if (vistaPrincipal != null) {
            vistaPrincipal.dispose();
        }
    }

    public ArrayList<Lugar> obtenerLugares() {
        return juego.getLugares();
    }

    public String obtenerPersonajesDeLugar(int indice) {
        if (indice < 0 || indice >= juego.getLugares().size()) {
            return "Sin lugar seleccionado.";
        }
        Lugar lugar = juego.getLugares().get(indice);
        StringBuilder sb = new StringBuilder();
        sb.append("Lugar: ").append(lugar.getNombre()).append("\n");
        sb.append("Descripción: ").append(lugar.getDescripcion()).append("\n\n");
        sb.append("Personajes:\n");
        for (Personaje personaje : lugar.getPersonajes()) {
            sb.append("- ").append(personaje.getNombre()).append("\n");
        }
        return sb.toString();
    }

    public String ejecutarDialogoSimple() {
        Dialogo dialogo = new Dialogo("Dialogo", "Wonder Woman: La verdad siempre vence.");
        return dialogo.getTexto();
    }

    public String ejecutarCombateSimple() {
        return "Combate iniciado: Wonder Woman enfrenta a Ares.";
    }

    public String usarSeleccionWonderWoman(boolean usarHabilidad, int indiceHabilidad, int indiceObjeto) {
        StringBuilder resultado = new StringBuilder();

        if (usarHabilidad && indiceHabilidad >= 0 && indiceHabilidad < wonderWoman.getHabilidades().size()) {
            Habilidad habilidad = wonderWoman.getHabilidades().get(indiceHabilidad);
            wonderWoman.usarHabilidad(habilidad);
            resultado.append("Habilidad usada: ").append(habilidad.getNombre()).append("\n");
        }

        if (indiceObjeto >= 0 && indiceObjeto < wonderWoman.getEquipo().size()) {
            ObjetoEspecial objeto = wonderWoman.getEquipo().get(indiceObjeto);
            wonderWoman.usarObjeto(objeto);
            resultado.append("Objeto usado: ").append(objeto.getNombre()).append("\n");
        }

        if (resultado.length() == 0) {
            return "No se seleccionó habilidad u objeto válido.";
        }
        return resultado.toString();
    }
}
