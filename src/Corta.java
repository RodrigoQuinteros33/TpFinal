public class Corta extends Arma{

    private boolean esAutomatica;

    public boolean efectividadMts(){
        return false;
    }

    @Override
    public boolean enCondicion() {
        return false;
    }
}
