package github;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumar los dos números
        int suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
