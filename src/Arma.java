public abstract class Arma {
    private final int cantMuniciones;
    private final double alcance;
    private final String marca;
    private final int calibre;
    private final String estado; // “NUEVA”, “EN MANTENIMIENTO”, “EN USO”
    private final Policia policia; // Asociación con Policia

    // Constructor
    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia policia) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    // Getters
    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    // Método para verificar si el arma está en condiciones de uso
    public boolean enCondicion() {
        return "EN USO".equals(estado) && calibre >= 9;
    }

    // Método toString básico para Arma
    @Override
    public String toString() {
        return "Arma{" +
                "cantMuniciones=" + cantMuniciones +
                ", alcance=" + alcance +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                ", policia=" + policia +
                '}';
    }
}
