public class Larga extends Arma implements Comparable<Larga> {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado,
                 String justifUso, int nivelArma, boolean tieneSello, Policia policia) {
        super(cantMuniciones, alcance, marca, calibre, estado, policia);
        this.justifUso = justifUso;
        this.nivelArma = Math.max(1, Math.min(nivelArma, 5)); // Nivel entre 1 y 5
        this.tieneSello = tieneSello;
    }

    public int getNivelArma(){
        return this.nivelArma;
    }

    public String getJustifUso(){
        return this.justifUso;
    }

    public boolean getTieneSello(){
        return this.tieneSello;
    }

    @Override
    public int compareTo(Larga otraArma) {
        // Comparar por nivelArma
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }

    @Override
    public String toString() {
        return "Larga{justifUso='" + justifUso + "', nivelArma=" + nivelArma +
                ", tieneSello=" + tieneSello + ", " + super.toString() + "}";
    }

    @Override
    public boolean enCondicion() {
        return tieneSello && !getEstado().equals("EN MANTENIMIENTO");
    }
}
