package EjercicioProfesion;

public class Main {
    public static void main(String[] args) {
        Ingeniero ing = new Ingeniero("Kevin Mendoza", 850);
        Doctor doc = new Doctor("Marcos Gutierrez", 900);

        ing.mostrarDatos();
        System.out.println();
        doc.mostrarDatos();
    }
}