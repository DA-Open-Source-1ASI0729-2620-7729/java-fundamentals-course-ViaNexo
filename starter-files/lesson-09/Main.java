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
        Estudiante[] estudiantes = {
            new Estudiante("Luna", 14),
            new Estudiante("Mateo", 16),
            new Estudiante("Ana", 15)
        };

        // Reto: recorre el array con un for y llama presentarse()
        // en cada posición. Recuerda que el primer índice es 0.
    }
}
