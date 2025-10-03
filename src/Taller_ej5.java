import java.util.Scanner;
public class Taller_ej5 {
    public static void main(String[] args) {
        //Creación de objeto

        Scanner sc = new Scanner(System.in);

        //Variables
        double altura, base;

        //Pedida de datos

        System.out.println("Ingrese la base del triangulo:  ");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura del triangulo:  ");
        altura = sc.nextDouble();

        //Variable area
        double area;

        //Operación

        area = (base*altura)/2;

        //Salida

        System.out.println("El area del triangulo es :  " + area);

    }
}
