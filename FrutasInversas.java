import java.util.Scanner;

public class FrutasInversas {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];

        // Guardar las 10 frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese el nombre de la fruta #" + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostrar las frutas en orden inverso
        System.out.println("\n--- Frutas en orden inverso ---");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}
