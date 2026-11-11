import java.util.Scanner;

public class Main {
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombreUsuario = entrada.nextLine();

        saludar(nombreUsuario);

        entrada.close();
    }
}
