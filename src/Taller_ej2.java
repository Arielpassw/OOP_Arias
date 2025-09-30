//2. Operaciones matemáticas básicas.
//Crea un programa en Java que realice
// operaciones de suma, resta, multiplicación,
// división y módulo entre dos números enteros.

import java.util.Scanner;
public class Taller_ej2 {
    public static void main(String[] args) {
        int val1;
        int val2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el primer valor : ");
        val1 = input.nextInt();
        System.out.println("Digite el segundo valor: ");
        val2 = input.nextInt();

        int suma = (int)(val1 + val2);
        int resta = (int)(val1 - val2);
        int multiplicacion = (int)(val1 * val2);
        int division = (int)(val1 / val2);
        int modulo = (int)(val1 % val2);
        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + resta);
        System.out.println("El resultado es: " + multiplicacion);
        System.out.println("El resultado es: " + division);
        System.out.println("El resultado es: " + modulo);

    }
}
