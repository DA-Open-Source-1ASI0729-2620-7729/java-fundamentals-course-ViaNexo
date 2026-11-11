class Estudiante {
    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante luna = new Estudiante();
        luna.nombre = "Luna";
        luna.edad = 14;

        Estudiante mateo = new Estudiante();
        mateo.nombre = "Mateo";
        mateo.edad = 16;

        luna.presentarse();
        mateo.presentarse();
    }
}
