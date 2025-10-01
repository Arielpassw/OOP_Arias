
//Ejercicio 1: Registro de inventarios de plásticos
//Objetivo: Registrar producto plástico y calcular valor total de stock.

import java.util.Scanner;
public class Tarea_EJ_1 {
    public static void main(String[] args) {

        //Creación del objeto
        Scanner input = new Scanner(System.in);

        //Definición de variables
        String producto1,producto2,producto3;
        double precio1,precio2,precio3;
        int cantidad1,cantidad2,cantidad3;

        //Registro por teclado
        //Producto 1
        System.out.println("Digita el nombre del producto: ");
        producto1=input.nextLine();
        System.out.println("Digita el precio del producto: ");
        precio1=input.nextDouble();
        System.out.println("Digital la cantidad del stock");
        cantidad1=input.nextInt();
        input.nextLine();

        //Producto 2
        System.out.println("Digite el nombre del producto: ");
        producto2=input.nextLine();
        System.out.println("Digite el precio del producto: ");
        precio2=input.nextDouble();
        System.out.println("Digite la cantidad del stock: ");
        cantidad2=input.nextInt();
        input.nextLine();


        //Producto 3
        System.out.println("Digite el nombre del producto: ");
        producto3=input.nextLine();
        System.out.println("Digite el precio del producto: ");
        precio3=input.nextDouble();
        System.out.println("Digite la cantidad del stock: ");
        cantidad3=input.nextInt();


        //Variable para calcular el total
        double total=(precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3);
        System.out.println("El total del stock es: " + total);

    }
}
