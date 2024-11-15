public class Larga extends Arma implements Comparable<Larga> {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello, Policia policia) {
        super(cantMuniciones, alcance, marca, calibre, estado, policia);
        this.justifUso = justifUso;
        this.nivelArma = Math.max(1, Math.min(nivelArma, 5));
        this.tieneSello = tieneSello;
    }

    // Getters y Setters
    public String getJustifUso() {
        return justifUso;
    }

    public void setJustifUso(String justifUso) {
        this.justifUso = justifUso;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = Math.max(1, Math.min(nivelArma, 5));
    }

    public boolean isTieneSello() {
        return tieneSello;
    }

    public void setTieneSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    @Override
    public int compareTo(Larga otraArma) {
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }

    @Override
    public boolean enCondicion() {
        return tieneSello && !estado.equals("EN MANTENIMIENTO");
    }

    @Override
    public String toString() {
        return "Larga{justifUso='" + justifUso + "', nivelArma=" + nivelArma + ", tieneSello=" + tieneSello + ", " + super.toString() + "}";
    }
}
