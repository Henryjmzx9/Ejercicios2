import java.util.Scanner;

public class ContarParesImpares {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        // Ingresar los 12 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar pares e impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }

}
