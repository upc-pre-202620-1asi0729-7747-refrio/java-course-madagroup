import java.util.Scanner;

public class Main {
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = entrada.nextLine();
        // TODO: crea un array de tres notas y calcula su promedio.
        System.out.println("Hola, " + nombre);
        entrada.close();
    }
}
