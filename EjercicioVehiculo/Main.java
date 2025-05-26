package EjercicioVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Automovil();
        Vehiculo vehiculo2 = new Barco();
        Vehiculo vehiculo3 = new Avion();

        vehiculo1.mover();
        vehiculo2.mover();
        vehiculo3.mover();
    }
}
