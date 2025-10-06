import java.util.Scanner;

public class Jugadores {
    // Atributos
    String nombre;
    int edad;
    String posicion;
    int numero_de_camiseta;

    // Método constructor
    public Jugadores(String nombre, int edad, String posicion, int numero_de_camiseta) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numero_de_camiseta = numero_de_camiseta; // ❗ Corregido: antes se asignaba 0 siempre
    }

    // Método
    void registro() {
        System.out.println("\nRegistro de jugadores");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Número de camiseta: " + numero_de_camiseta);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Jugador 1
        System.out.println("Ingrese el nombre del jugador 1:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese la edad del jugador 1:");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar buffer

        System.out.println("Ingrese la posición del jugador 1:");
        String posicion = entrada.nextLine();

        System.out.println("Ingrese el número de camiseta del jugador 1:");
        int numero_de_camiseta = entrada.nextInt();
        entrada.nextLine();

        // Crear objeto jugador1
        Jugadores jugador1 = new Jugadores(nombre, edad, posicion, numero_de_camiseta);
        jugador1.registro();

        // Jugador 2
        System.out.println("\nIngrese el nombre del jugador 2:");
        String nombre2 = entrada.nextLine();

        System.out.println("Ingrese la edad del jugador 2:");
        int edad2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese la posición del jugador 2:");
        String posicion2 = entrada.nextLine();

        System.out.println("Ingrese el número de camiseta del jugador 2:");
        int numero_de_camiseta2 = entrada.nextInt();

        // Crear objeto jugador2
        Jugadores jugador2 = new Jugadores(nombre2, edad2, posicion2, numero_de_camiseta2);
        jugador2.registro();

        // Jugadores creados directamente
        Jugadores objeto1 = new Jugadores("Ariel", 23, "Extremo Izquierdo", 21);
        Jugadores objeto2 = new Jugadores("Alex", 24, "Extremo Derecho", 10);

        objeto1.registro();
        objeto2.registro();
    }
}
