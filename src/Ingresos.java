import java.util.Scanner; //PASO 1 IMPORTAR LIBRERIA
public class Ingresos {
    public static void main(String[] args) {
        String nombre;
        Scanner in = new Scanner(System.in); //PASO 2 CREAR OBJETO
        System.out.print("Ingresa el nombre: ");
        nombre = in.nextLine(); //PASO 3 USO DE LA VARIABLE Y OBJETO
        System.out.print("El nombre del ingresado es : " + nombre);


    }
}
