import java.util.Scanner;

public class Ej_Clase2 {
    public static void main(String[] args) {

        String a = new String("Hola");
        String b = new String("Hola");

        //equals() : Compara si el contenido de los objetos son iguales

        System.out.println(a.equals(b));


    //Ejercicio 2
        Scanner input = new Scanner(System.in);
        int numero, numero1;
        System.out.println("Ingrese un numero");
        numero = input.nextInt();
        System.out.println("Ingrese un numero");
        numero1 = input.nextInt();
        System.out.println(numero == (numero1));

        Ejercicio 2

        Scanner input = new Scanner(System.in);
        String user = "Ariel";
        String pass = "Arias";
        String usuario, clave;
        int contador = 0;
        while(contador <=3 ){
            System.out.print("Ingrese el nombre del usuario: ");
            usuario = input.nextLine();
            System.out.print("Ingrese el nombre del clave: ");
            clave = input.nextLine();
            if(usuario.equals(user)&& clave.equals(pass)){
                System.out.println("Login exitosamente");
                return;
            }
            else {
                System.out.println("Usuario o Clave incorrecto");
            }

    }
 }

