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

        for (int indice = 0; indice < estudiantes.length; indice++) {
            System.out.print("Posición " + indice + ": ");
            estudiantes[indice].presentarse();
        }
    }
}
