//Ejercicio 3: Requisitos para el cuartel
//Objetivo: Determinar si un estudiante cumple (≥18 años y altura ≥ 1.60 m).
//Entradas: edad (int), altura (double).
//Salida: “Cumple” o “No cumple”.
//Reglas: edad y altura deben ser positivas.

import java.util.Scanner;
public class Tarea_EJ_3 {
    public static void main(String[] args) {
        //Creacion del objeto
        Scanner sc = new Scanner(System.in);

        //Variables
        int edad;
        double altura;

        // Bucle para pedir edad hasta que sea positiva

        do {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            if (edad <= 0) {
                System.out.println("La edad debe ser positiva.");
            }
        } while (edad <= 0);

        // Bucle para pedir la altura hasta que sea positiva

        do {
            System.out.print("Ingrese su altura : ");
            altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("La altura debe ser positiva.");
            }
        } while (altura <= 0);

        // Condición para cumplimineto de requisos

        if (edad >= 18 && altura >= 1.60) {
            System.out.println("Cumple con los requisitos.");
        } else {
            System.out.println("No cumple con los requisitos.");
        }


    }
}

