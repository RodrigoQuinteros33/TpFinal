public class Main {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Juan", "Pérez", 12345);

        // Creación de un arma corta
        Corta armaCorta = new Corta(10, 250, "Glock", 9, "EN USO", true);

        // Creación de un arma larga
        Larga armaLarga = new Larga(20, 300, "Remington", 12, "EN USO", "seguridad", 5, true);
        Larga otraArmaLarga = new Larga(15, 120, "Mossberg", 10, "EN USO", "defensa", 3, true);

        System.out.println("Policía: " + policia1);

        // Verificar si las armas están en condiciones para enfrentamiento
        System.out.println("Arma corta en condición para enfrentamiento: " + armaCorta.enCondicionParaEnfrentamiento());
        System.out.println("Arma larga en condición para enfrentamiento: " + armaLarga.enCondicionParaEnfrentamiento());

        // Comparar armas largas
        System.out.println("Comparación entre armas largas: " + armaLarga.compareTo(otraArmaLarga));

        // Verificar si el arma corta puede disparar a más de 200 metros
        System.out.println("El arma corta puede disparar a más de 200m: " + armaCorta.puedeDispararALargaDistancia());
    }
}
