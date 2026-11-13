public class Main {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 14;
        double promedio = 17.5;
        boolean participa = true;
        int puntos = 8 + 2;

        System.out.println("Hola, " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Participa: " + participa);
        System.out.println("Puntos con bono: " + (puntos + 3));
        System.out.println("¿Tiene 13 o más?: " + (edad >= 13));
    }
}
