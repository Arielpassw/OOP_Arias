// Ejercicio 1: Notas del estudiante
//•	Pide el nombre del estudiante.
//•	Solicita tres notas (double).
//•	Calcula el promedio.
//•	Muestra si aprueba (>=7) o reprueba.

import java.util.Scanner;
public class Tarea2_Ej_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Creación del objeto
        //Variables
        double nota1,nota2,nota3;
        double promedio;
        String nombre;

        //Entrada
        System.out.println("Ingresa el nombre del estudiante: ");
        nombre=entrada.nextLine();

        System.out.println("Ingresa la primera calificacion del estudiante: ");
        nota1=entrada.nextInt();
        System.out.println("Ingresa la segunda calificacion del estudiante: ");
        nota2=entrada.nextInt();
        System.out.println("Ingresa la tercera calificación del estudiante: ");
        nota3=entrada.nextInt();

        //Operación
        promedio=(nota1+nota2+nota3)/3;

        //Condición
        if(promedio>=7){
            System.out.println("El estudiante " +nombre+ " Aprueba con un promedio de: " +promedio);
        }
        else {
            System.out.println("El estudiante " +nombre+ " Reprueba con un promedio de: " +promedio);
        }

    }

}
