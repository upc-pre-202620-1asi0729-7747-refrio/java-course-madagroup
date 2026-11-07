class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0 && nuevaEdad <= 120) {
            edad = nuevaEdad;
        }
    }

    public String resumen() {
        return nombre + " - " + edad + " años";
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] grupo = {
            new Estudiante("Ana", 14),
            new Estudiante("Luis", 15)
        };

        System.out.println("REGISTRO DE ESTUDIANTES");
        for (int i = 0; i < grupo.length; i++) {
            System.out.println((i + 1) + ". " + grupo[i].resumen());
        }

        grupo[0].setEdad(15);
        grupo[1].setEdad(-4); // Se ignora por ser inválida.
        System.out.println("Después de actualizar:");
        for (int i = 0; i < grupo.length; i++) {
            System.out.println(grupo[i].getNombre() + ": " + grupo[i].getEdad());
        }
    }
}
