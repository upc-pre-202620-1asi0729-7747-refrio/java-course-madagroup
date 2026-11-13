import java.util.Scanner;

public class Main {
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = entrada.nextLine();

        int[] notas = {15, 18, 17};
        int total = sumar(notas[0], notas[1]) + notas[2];
        double promedio = total / (double) notas.length;

        System.out.println("Hola, " + nombre);
        System.out.println("Tienes " + notas.length + " notas.");
        System.out.println("Promedio: " + promedio);
        System.out.println("Tu nombre tiene " + nombre.length() + " letras.");
        System.out.println("¿Te llamas Ana?: " + nombre.equals("Ana"));
        entrada.close();
    }
}
