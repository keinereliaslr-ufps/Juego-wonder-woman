package modelo;

public class Combate extends Evento {

    private Enemigo enemigo;
    private Aliado aliado;

    public Combate(String descripcion, Enemigo enemigo, Aliado aliado) {
        super(descripcion);
        this.enemigo = enemigo;
        this.aliado = aliado;
    }

    public void iniciar() {
        enemigo.atacar();
        aliado.asistirEnCombate();
    }

    public void finalizar() {
        System.out.println("Combate finalizado.");
    }

    @Override
    public void ejecutar() {
        iniciar();
        finalizar();
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public Aliado getAliado() {
        return aliado;
    }
}
