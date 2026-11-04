public class Main {
    public static void main(String[] args) {
        int edad = 14;
        if (edad >= 13) {
            System.out.println("Puedes participar.");
        } else {
            System.out.println("Vuelve a intentarlo más adelante.");
        }

        for (int ronda = 1; ronda <= 3; ronda++) {
            System.out.println("Ronda " + ronda);
        }

        int vidas = 2;
        while (vidas > 0) {
            System.out.println("Vidas: " + vidas);
            vidas--;
        }
        System.out.println("Fin del juego.");
    }
}
