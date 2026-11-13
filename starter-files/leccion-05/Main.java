class Estudiante {
    private String nombre;
    private int edad;

    Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0 && nuevaEdad <= 120) {
            edad = nuevaEdad;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: crea un array con dos Estudiante.
        // TODO: recórrelo e imprime el nombre y la edad.
        // TODO: intenta asignar una edad negativa y comprueba qué pasa.
    }
}
