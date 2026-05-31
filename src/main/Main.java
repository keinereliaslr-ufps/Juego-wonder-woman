package main;

import controlador.ControladorJuego;
import modelo.Juego;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Juego juego = new Juego();
            ControladorJuego controlador = new ControladorJuego(juego);
            controlador.mostrarVistaPrincipal();
        });
    }
}
