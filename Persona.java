import java.util.Scanner;

public class Persona {

        //Atributos
        String nombre;
        String correo;
        int edad;
        int cedula;

        //Metodo constructor
        public Persona (String nombre, String correo, int edad, int cedula){

            //Cuando son diferentes los atributos no ponemos el "this"

            this.nombre = nombre;
            this.correo = correo;
            this.edad = edad;
            this.cedula = cedula;  //this es para inicializar el atributo (ocupamos cuando son iguales)
        }

        //Metodo
    void Imprime(){
        System.out.println("Bienvenido "+nombre+" con cedula "+cedula+" con la edad de "+edad+" años"+ " y correo "+correo+
                " al sistema de KFC.");

    }

        //Objeto
    public static void main (String[] args) {
            //Objeto 1
            Persona objeto1= new Persona("Ariel", "ariel.arias01@epn.edu.ec", 23, 1727736314);
            objeto1.Imprime();

            //Objeto 2
            Persona objeto2 = new Persona("Sofia", "sofia@gmail.com",15, 1727736315);
            objeto2.Imprime();
    }



}
