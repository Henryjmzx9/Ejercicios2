package EjercioJuego;

import java.util.Scanner;

public class Nivel2 {
public int puntaje;
    private String respuesta;
    private final String[] respuestas;
    private final String[] preguntas;
    private final Scanner ent;

    public Nivel2() {
        this.puntaje = 0;
        this.ent = new Scanner(System.in);

        this.preguntas = new String[]{
                  "La capital de Francia es París.",
                "La capital de Brasil es Río de Janeiro.",
                "La capital de Japón es Tokio.",
                "La capital de Australia es Sydney."
        };

        this.respuestas = new String[]{
                "Verdadero", // París sí es capital de Francia
                "Falso",     // La capital de Brasil es Brasilia
                "Verdadero", // Tokio sí es capital de Japón
                "Falso"      // La capital de Australia es Canberra
        };
    }

    private void puntajeVerdadero() {
        if (respuesta.equalsIgnoreCase("Verdadero")) {
            System.out.println("Correcto!!");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto");
            System.out.println("HAZ PERDIDO 10 PUNTOS");
            puntaje -= 10;
        }
        System.out.println();
    }

    private void puntajeFalso() {
        if (respuesta.equalsIgnoreCase("Falso")) {
            System.out.println("Correcto!!");
            System.out.println("Ganaste 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto");
            System.out.println("HAZ PERDIDO 10 PUNTOS");
            puntaje -= 10;
        }
        System.out.println();
    }

    public void imprimePreguntas() {
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Responde (Verdadero/Falso): ");
            respuesta = ent.nextLine();

            if (respuestas[i].equalsIgnoreCase("Verdadero")) {
                puntajeVerdadero();
            } else {
                puntajeFalso();
            }
        }
    }

    public void menuNivel2() {
        int opcion;
        do {
            System.out.println("********** MENÚ NIVEL 2 **********");
            System.out.println("1. Responder Preguntas");
            System.out.println("2. Ver Puntaje Actual");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = ent.nextInt();
            ent.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    imprimePreguntas();
                    break;
                case 2:
                    System.out.println("Tu puntaje actual es: " + puntaje);
                    break;
                case 3:
                    System.out.println("Saliendo de Nivel 2...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);
    }
}
