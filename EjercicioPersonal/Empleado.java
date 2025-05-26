package EjercicioPersonal;


public class Empleado extends Personal {
    private double bono;

    @Override
    public void registrar(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.bono = 0.15 * sueldoBase; // Ejemplo: bono del 15%
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Bono: $" + bono);
        System.out.println("Sueldo Total: $" + calcularSueldo());
    }
}