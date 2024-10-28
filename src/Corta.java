public class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean esAutomatica() {
        return esAutomatica;
    }

    // Nueva funcionalidad: Verificar si el arma corta puede disparar a más de 200 metros
    public boolean puedeDispararALargaDistancia() {
        return alcance > 200;
    }

    @Override
    public boolean enCondicion() {
        return !estado.equals("EN MANTENIMIENTO"); // Ejemplo de condición
    }

    @Override
    public String toString() {
        return "Corta{esAutomatica=" + esAutomatica + ", " + super.toString() + "}";
    }
}
