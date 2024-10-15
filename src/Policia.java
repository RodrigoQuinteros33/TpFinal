public class Policia {
    private String nombre;
    private String apellido;
    private int legajo;

    public Policia (String nombre, String apellido, int legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
//gacha
    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
