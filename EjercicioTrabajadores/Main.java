package EjercicioTrabajadores;

public class Main {
 public static void main(String[] args) {
        Futbolista jugador = new Futbolista();
        jugador.nombre = "Caleb";
        jugador.viajar();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "Kevin";
        tecnico.viajar();
        tecnico.dirigirPartido();

        Masajista masajista = new Masajista();
        masajista.nombre = "Cindy";
        masajista.viajar();
        masajista.darMasaje();
    }
}
