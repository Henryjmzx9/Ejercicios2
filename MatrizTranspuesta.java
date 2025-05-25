import java.util.Scanner;

public class MatrizTranspuesta {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3]; // Matriz original 3x3
        int[][] transpuesta = new int[3][3]; // Matriz transpuesta 3x3

        // Ingreso de los valores de la matriz
        System.out.println("Ingrese los 9 valores numéricos para la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular la matriz transpuesta (intercambiando filas por columnas)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
