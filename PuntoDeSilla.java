import java.util.Scanner;

public class PuntoDeSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        // Pedir los valores al usuario
        System.out.println("Ingrese los 12 valores numéricos para la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean hayPuntoDeSilla = false;

        // Buscar puntos de silla
        for (int i = 0; i < filas; i++) {
            // Encontrar el menor de la fila
            int menorDeFila = matriz[i][0];
            int columnaDelMenor = 0;

            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < menorDeFila) {
                    menorDeFila = matriz[i][j];
                    columnaDelMenor = j;
                }
            }

            // Verificar si es el mayor en su columna
            boolean esMayorEnColumna = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][columnaDelMenor] > menorDeFila) {
                    esMayorEnColumna = false;
                    break;
                }
            }

            // Si se cumple, es punto de silla
            if (esMayorEnColumna) {
                System.out.println("Punto de silla encontrado en posición [" + i + "][" + columnaDelMenor + "]: " + menorDeFila);
                hayPuntoDeSilla = true;
            }
        }

        if (!hayPuntoDeSilla) {
            System.out.println("No se encontraron puntos de silla en la matriz.");
        }

        scanner.close();
    }

}
