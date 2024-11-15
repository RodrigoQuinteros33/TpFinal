public class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica, Policia policia) {
        super(cantMuniciones, alcance, marca, calibre, estado, policia);
        this.esAutomatica = esAutomatica;
    }

    // Getters y Setters
    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    public boolean puedeDispararALargaDistancia() {
        return alcance > 200;
    }

    @Override
    public boolean enCondicion() {
        return !estado.equals("EN MANTENIMIENTO");
    }

    @Override
    public String toString() {
        return "Corta{esAutomatica=" + esAutomatica + ", " + super.toString() + "}";
    }
}
