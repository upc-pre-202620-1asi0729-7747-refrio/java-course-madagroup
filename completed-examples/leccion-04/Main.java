class Estudiante {
    String nombre;
    int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }

    void cumplirAnios() {
        edad++;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 14);
        Estudiante luis = new Estudiante("Luis", 15);
        ana.presentarse();
        luis.presentarse();
        ana.cumplirAnios();
        ana.presentarse();
    }
}
