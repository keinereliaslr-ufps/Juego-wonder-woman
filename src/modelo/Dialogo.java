package modelo;

public class Dialogo extends Evento {

    private String texto;

    public Dialogo(String descripcion, String texto) {
        super(descripcion);
        this.texto = texto;
    }

    @Override
    public void ejecutar() {
        System.out.println(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
