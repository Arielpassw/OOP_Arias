import java.util.Scanner;

public class Ej3_Clase2_swi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("Opción 1: Login\nOpción 2: Tabla de multiplicar");
        System.out.print("Ingresa una opcion: ");
        opcion = input.nextInt();
        input.nextLine(); // limpiar el buffer

        switch (opcion) {
            case 1:
                String user = "Ariel";
                String pass = "Arias";
                String usuario, clave;
                int contador = 0;

                while (contador < 3) {
                    System.out.print("Ingrese el nombre del usuario: ");
                    usuario = input.nextLine();
                    System.out.print("Ingrese la clave: ");
                    clave = input.nextLine();

                    if (usuario.equals(user) && clave.equals(pass)) {
                        System.out.println("Login exitoso");
                        break;
                    } else {
                        System.out.println("Usuario o clave incorrecto");
                        contador++;
                    }
                }

                if (contador == 3) {
                    System.out.println("Has excedido el número de intentos.");
                }
                break;

            case 2:
                System.out.print("Digite un número para la tabla de multiplicar: ");
                int numero = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;

        }

    }
}

