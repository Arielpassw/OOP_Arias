// Casting y conversión de tipos.
//Crea un programa en Java que convierta
// un número decimal en entero (casting explícito)
// y un número entero en decimal (casting implícito).

import java.util.Scanner;

public class Taller_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = sc.nextDouble();
        int numeroEntero = (int) numeroDecimal;
        System.out.println("Casting explícito: " + numeroEntero);

        System.out.print("Ingresa un número entero: ");
        int otroEntero = sc.nextInt();
        double otroDecimal = otroEntero;
        System.out.println("Conversión implícita: " + otroDecimal);
    }
}

