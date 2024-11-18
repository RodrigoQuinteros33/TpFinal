public class Corta extends Arma {
    private final boolean esAutomatica;

    // Constructor
    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia policia, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado, policia);
        this.esAutomatica = esAutomatica;
    }


    public boolean getEsAutomatica() {
        return esAutomatica;
    }

    // Método para verificar si es efectiva a más de 200m
    public boolean efectividadDoscientosMts() {
        return getAlcance() > 200;
    }

    @Override
    public String toString() {
        return "Corta{" +
                "esAutomatica=" + esAutomatica +
                '}';
    }
}
