import java.util.Scanner;

public class Main {
    public static void saludar(String nombre) {
        // Reto: muestra un saludo que incluya nombre.
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombreUsuario = entrada.nextLine();

        // Reto: llama a saludar con nombreUsuario.

        entrada.close();
    }
}
