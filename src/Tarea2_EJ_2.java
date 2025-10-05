//Ejercicio 2: Números pares
//•	Pregunta cuántos números se van a ingresar.
//•	Usa un for para leer cada número.
//•	Muestra cuántos números pares se ingresaron.



import java.util.Scanner;

public class Tarea2_EJ_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Creación del objeto

        //Variables
        int cantidad, numero, pares = 0;

        //Entrada
        System.out.println("Cuantos numeros vas a ingresar: ");
        cantidad=input.nextInt();

        //Bucle
        for (int i=1;i<=cantidad;i++)
        {
            System.out.println("Ingresa el número: ");
            numero=input.nextInt();

            //Condición
            if (numero % 2==0)
            {
                pares++;
            }
        }

        //Salidad
        System.out.println("Se ingresaron  " +pares+ " números pares");

    }
}
