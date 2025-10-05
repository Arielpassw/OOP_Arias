// Ejercicio 3: Tabla de multiplicar
//•	Lee un número del 1 al 10.
//•	Imprime su tabla de multiplicar usando for.


import java.util.Scanner;

public class Tarea2_EJ_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Creación del objeto

        //Variables
        int numero;

        //Entrada
        do {
            System.out.print("Ingrese un número del 1 al 10: ");
            numero = input.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido. Intente nuevamente.");
            }
        } while (numero < 1 || numero > 10);

        //Bucle
        for (int i = 1; i <= 10; i++) {
            System.out.print(numero + "x" +  i + " = " + (numero * i)+"\n");
        }

    }
}
