public class Larga extends Arma{

    private String justifiUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(){

    }


    @Override
    public boolean enCondicion() {
        return false;
    }
    @Override
    public String toString() {
        return "Larga{" +
                "justifiUso='" + justifiUso + '\'' +
                ", nivelArma=" + nivelArma +
                ", tieneSello=" + tieneSello +
                '}';
    }
}
