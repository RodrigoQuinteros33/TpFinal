public class Main {
    public static void main(String[] args) {
        // Crear objetos Policia
        Policia policia1 = new Policia("Juan", "Pérez", 1234);
        Policia policia2 = new Policia("Ana", "Gómez", 5678);

        // Crear un arma corta
        Corta armaCorta = new Corta(10, 150, "Glock", 9, "NUEVA", policia1, true);
        System.out.println(armaCorta);
        System.out.println("¿Puede disparar a larga distancia?: " + armaCorta.efectividadDoscientosMts());
        System.out.println("¿Está en condición?: " + armaCorta.enCondicion());

        // Crear armas largas
        Larga armaLarga1 = new Larga(5, 500, "Remington", 12, "EN USO", "Defensa", 4, true, policia2);
        Larga armaLarga2 = new Larga(3, 600, "Winchester", 14, "NUEVA", "Caza", 5, true, policia1);

        // Imprimir las armas largas
        System.out.println(armaLarga1);
        System.out.println("¿Está en condición?: " + armaLarga1.enCondicion());
        System.out.println(armaLarga2);
        System.out.println("¿Está en condición?: " + armaLarga2.enCondicion());

        // Comparar armas largas
        int comparacion = armaLarga1.compareTo(armaLarga2);
        if (comparacion < 0) {
            System.out.println("El arma " + armaLarga1.getMarca() + " tiene un nivel menor que " + armaLarga2.getMarca());
        } else if (comparacion > 0) {
            System.out.println("El arma " + armaLarga1.getMarca() + " tiene un nivel mayor que " + armaLarga2.getMarca());
        } else {
            System.out.println("Ambas armas tienen el mismo nivel.");
        }
    }
}
