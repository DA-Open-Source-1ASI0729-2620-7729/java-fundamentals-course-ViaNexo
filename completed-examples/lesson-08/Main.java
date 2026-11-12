class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    String getNombre() {
        return nombre;
    }

    int getEdad() {
        return edad;
    }

    void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            edad = nuevaEdad;
        }
    }

    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante luna = new Estudiante("Luna", 14);

        luna.presentarse();
        System.out.println("Nombre: " + luna.getNombre());
        System.out.println("Edad: " + luna.getEdad());

        luna.setEdad(15);
        luna.presentarse();

        luna.setEdad(-3); // El setter ignora una edad negativa.
        luna.presentarse();
    }
}
