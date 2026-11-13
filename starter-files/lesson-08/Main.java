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
        // Reto: actualiza la edad solamente si nuevaEdad es mayor o igual que cero.
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante luna = new Estudiante("Luna", 14);
        // Reto: muestra los datos usando los getters.
        // Reto: cambia la edad a 15 usando el setter y muestra el resultado.
    }
}
