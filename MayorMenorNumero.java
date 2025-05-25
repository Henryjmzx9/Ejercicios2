import java.util.Scanner;

public class MayorMenorNumero {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayor, menor;

        // Ingresar los 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
  
        // Inicializar mayor y menor con el primer valor del vector
        mayor = numeros[0];
        menor = numeros[0];

        // Buscar mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
