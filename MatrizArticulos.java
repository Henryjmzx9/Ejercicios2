import java.util.Scanner;

public class MatrizArticulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos la matriz de 3 filas y 3 columnas (3x3 = 9 artículos)
        String[][] articulos = new String[3][3];

        // Ingreso de los nombres de los artículos
        System.out.println("Ingrese los nombres de 9 artículos:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Artículo [" + i + "][" + j + "]: ");
                articulos[i][j] = scanner.nextLine();
            }
        }

        // Mostrar el contenido de la matriz con las filas en orden invertido
        System.out.println("\nContenido de la matriz con filas invertidas:");
        for (int i = 2; i >= 0; i--) { // Empieza en 2 y baja hasta 0
            for (int j = 0; j < 3; j++) {
                System.out.print(articulos[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
