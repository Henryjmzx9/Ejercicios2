package EjercicioProfesion;

public class Ingeniero implements IProfesion {
    private String nombre;
    private double sueldoBase;
    private double bono;

    public Ingeniero(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.bono = 200; 
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }

    public void mostrarDatos() {
        System.out.println("Profesión: Ingeniero");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Bono: $" + bono);
        System.out.println("Sueldo Total: $" + calcularSueldo());
    }
}