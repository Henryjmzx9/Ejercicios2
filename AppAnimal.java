import java.util.Scanner;

public class AppAnimal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un animal
        Animal miAnimal = new Animal();

        System.out.print("Ingrese el nombre del animal: ");
        miAnimal.setNombre(scanner.nextLine());

        System.out.print("Ingrese el orden del animal: ");
        miAnimal.setOrden(scanner.nextLine());

        System.out.print("Ingrese la cantidad de extremidades: ");
        miAnimal.setExtremidades(scanner.nextInt());

        // Mostrar la información
        System.out.println("\n--- Información del Animal ---");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        scanner.close();
    }
}

// Clase Animal definida en el mismo documento
class Animal {
    // Propiedades privadas (encapsuladas)
    private String nombre;
    private String orden;
    private int extremidades;

    // Constructor vacío opcional
    public Animal() {
    }

    // Métodos getters y setters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}
