class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println("Soy " + nombre);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: crea dos estudiantes usando new.
        // TODO: pide que ambos se presenten.
        System.out.println("Práctica de objetos");
    }
}
