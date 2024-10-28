public class Larga extends Arma implements Comparable<Larga> {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello) {
        super(cantMuniciones, alcance, marca, calibre, estado);
        this.justifUso = justifUso;
        this.nivelArma = Math.max(1, Math.min(nivelArma, 5)); // Limitar nivel entre 1 y 5
        this.tieneSello = tieneSello;
    }

    @Override
    public int compareTo(Larga otraArma) {
        // Comparar por nivel del arma (mayor nivel es considerado mayor)
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
