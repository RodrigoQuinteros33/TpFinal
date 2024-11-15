public class Corta extends Arma{

    private boolean esAutomatica;

    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean efectividadMts(){
        return false;
    }

    @Override
    public boolean enCondicion() {
        return false;
    }
}
