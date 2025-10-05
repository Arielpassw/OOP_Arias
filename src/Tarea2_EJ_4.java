//Ejercicio 4 (opcional reto):
//•	Pide nombre, edad y altura.
//•	Si tiene más de 18 años y mide más de 1.60m, mostrar "Aceptado para el equipo".
//•	Si no, mostrar "No cumple los requisitos".

import java.util.Scanner;

public class Tarea2_EJ_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creacción del objeto

        //VARIABLES
        String nombre;
        int edad;
        double altura;

        //Entrada
        System.out.print("Para ingresar al equipo deber tener mas de 18 años y medir mas de 1.60(m) \n");
        System.out.println("Ingresa tu nombre:  ");
        nombre = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = input.nextInt();
        System.out.print("Ingresa tu altura: ");
        altura = input.nextDouble();

        if (edad>18 && altura>1.60){
            System.out.println("El jugador "+nombre+" es aceptado en el equipo. ");
        }
        else {
            System.out.println("El jugador "+nombre+ " no cumple los requisitos. ");
        }
    }
}
