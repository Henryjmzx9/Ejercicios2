import java.util.Scanner;

public class PromedioNumeros {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;
        double promedio;

        // Ingresar los 12 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Acumular la suma
        }

        // Calcular el promedio
        promedio = (double) suma / numeros.length;

        // Mostrar el promedio
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}
