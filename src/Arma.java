public abstract class Arma {
    protected int cantMuniciones;
    protected double alcance;
    protected String marca;
    protected int calibre;
    protected String estado; // NUEVA, EN MANTENIMIENTO, EN USO

    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = validarEstado(estado);
    }

    private String validarEstado(String estado) {
        if (estado.equals("NUEVA") || estado.equals("EN MANTENIMIENTO") || estado.equals("EN USO")) {
            return estado;
        }
        throw new IllegalArgumentException("Estado no válido. Los valores permitidos son: NUEVA, EN MANTENIMIENTO, EN USO.");
    }

    // Nueva funcionalidad: Verificar si el arma está en condiciones para un enfrentamiento
    public boolean enCondicionParaEnfrentamiento() {
        return estado.equals("EN USO") && calibre >= 9;
    }

    public abstract boolean enCondicion();

    @Override
    public String toString() {
        return "Arma{cantMuniciones=" + cantMuniciones + ", alcance=" + alcance + ", marca='" + marca + "', calibre=" + calibre + ", estado='" + estado + "'}";
    }
}
