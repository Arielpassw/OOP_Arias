//1. Declaración y asignación de variables.
//Crea un programa en Java que declare variables
// de distintos tipos (int, double, char, String, boolean)
// y muestre sus valores en pantalla.

import java.util.Scanner;
public class Taller {
    public static void main(String[] args) {
        int val1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la variable entera : ");
        val1 = sc.nextInt();
        System.out.println("la variable entera es : "+val1);

        double val2 ;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingresa la variable tipo double : ");
        val2 = sc.nextDouble();
        System.out.println("la variable tipo double es : "+val2);

        char tipo;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa la variable tipo char : ");
        tipo = sc3.next().charAt(0);
        System.out.println("la variable tipo char es : "+tipo);

        String nombre;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingresa la variable tipo string : ");
        nombre = sc4.nextLine();
        System.out.println("la variable tipo sting es : "+nombre);

        boolean valor = true;
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Ingresa la variable tipo boolean: ");
        valor = sc5.nextBoolean();
        System.out.println("El variable tipo bool es : " + valor);


    }
}
