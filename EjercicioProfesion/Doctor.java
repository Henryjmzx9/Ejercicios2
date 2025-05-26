package EjercicioProfesion;

public class Doctor implements IProfesion {
    private String nombre;
    private double sueldoBase;
    private double incentivo;

    public Doctor(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.incentivo = 300; 
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + incentivo;
    }

    public void mostrarDatos() {
        System.out.println("Profesión: Doctor");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Incentivo: $" + incentivo);
        System.out.println("Sueldo Total: $" + calcularSueldo());
    }
}
