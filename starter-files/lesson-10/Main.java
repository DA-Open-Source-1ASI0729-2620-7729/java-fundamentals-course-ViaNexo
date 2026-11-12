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

        // Reto: repite dos veces las siguientes acciones:
        // 1. Pide el nombre y lee el texto con nextLine().
        // 2. Pide la edad y lee un número entero con nextInt().
        // 3. Consume el salto de línea pendiente con nextLine().
        // 4. Crea un Estudiante y guárdalo en registro.
        // Luego recorre el registro y presenta a ambos estudiantes.

        entrada.close();
    }
}
