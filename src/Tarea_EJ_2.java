//Ejercicio 2: Registro de clientes
//Objetivo: Capturar datos de un cliente y mostrar ficha.
//Entradas: cedula, nombres, telefono, email.
//Salida: Ficha en consola.
//Reglas: validar que los campos no estén vacíos.


import java.util.Scanner;
public class Tarea_EJ_2 {
    public static void main(String[] args){
        //Creación del objeto
        Scanner sc=new Scanner(System.in);

        //Variables
        String nombre,telefono,cedula,email;

        //Registro

        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        if (nombre.isEmpty()){
            System.out.println("El campo no puede ser vació");
        }

        System.out.println("Ingrese su cedula: ");
        cedula=sc.nextLine();
        if(cedula.isEmpty()){
            System.out.println("El campo no puede ser vació");
        }

        System.out.println("Ingrese su telefono: ");
        telefono=sc.nextLine();
        if(telefono.isEmpty()){
            System.out.println("El campo no puede ser vació");
        }

        System.out.println("Ingrese su emai: ");
        email=sc.nextLine();
        if(email.isEmpty()){
            System.out.println("El campo no puede ser vació");
        }

        //Salida

        System.out.println("Ficha\n");
        System.out.println("Nombre: "+nombre);
        System.out.println("Telefono: "+telefono);
        System.out.println("Cedula: "+cedula);
        System.out.println("Email: "+email);

    }
}
