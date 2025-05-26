package EjercicioPersonal;

public abstract class Personal {
    protected String nombre;
    protected double sueldoBase;

    public abstract void registrar(String nombre, double sueldoBase);
    public abstract double calcularSueldo();
}
