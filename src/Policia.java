import java.util.ArrayList;
import java.util.List;

public class Policia {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Arma> armas;

    public Policia(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.armas = new ArrayList<>();
    }

    public void agregarArma(Arma arma) {
        armas.add(arma);
    }

    public void removerArma(Arma arma) {
        armas.remove(arma);
    }

    public List<Arma> listarArmas() {
        return armas;
    }

    public boolean tieneArma(String marca) {
        for (Arma arma : armas) {
            if (arma.getMarca().equals(marca)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Policia{nombre='" + nombre + "', apellido='" + apellido + "', legajo=" + legajo + ", armas=" + armas + "}";
    }
}
