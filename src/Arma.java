public abstract class Arma {
    protected int cantMuniciones;
    protected double alcance;
    protected String marca;
    protected int calibre;
    protected String estado; // NUEVA, EN MANTENIMIENTO, EN USO
    protected Policia policia; // Relación con Policia

    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado, Policia policia) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = validarEstado(estado);
        this.policia = policia;
    }

    // Getters y Setters
    public int getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(int cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = validarEstado(estado);
    }

    public Policia getPolicia() {
        return policia;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    private String validarEstado(String estado) {
        if (estado.equals("NUEVA") || estado.equals("EN MANTENIMIENTO") || estado.equals("EN USO")) {
            return estado;
        }
        throw new IllegalArgumentException("Estado no válido. Los valores permitidos son: NUEVA, EN MANTENIMIENTO, EN USO.");
    }

    public abstract boolean enCondicion();

    @Override
    public String toString() {
        return "Arma{cantMuniciones=" + cantMuniciones + ", alcance=" + alcance + ", marca='" + marca + "', calibre=" + calibre + ", estado='" + estado + "', policia=" + policia + "}";
    }
}
