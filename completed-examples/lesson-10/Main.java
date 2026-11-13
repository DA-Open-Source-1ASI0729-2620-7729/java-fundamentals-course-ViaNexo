import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudiante[] registro = new Estudiante[2];

        for (int indice = 0; indice < registro.length; indice++) {
            System.out.println("Estudiante " + (indice + 1));
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consume el salto de línea tras el número.

            registro[indice] = new Estudiante(nombre, edad);
        }

        System.out.println("Registro completo:");
        for (int indice = 0; indice < registro.length; indice++) {
            registro[indice].presentarse();
        }

        entrada.close();
    }
}
