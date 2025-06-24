import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

multiplicacion-feature
       System.out.println("Seleccione la operación:");
System.out.println("1. Suma");
System.out.println("2. Resta");
System.out.println("3. Multiplicación (Feature: Eli)");
System.out.println("4. División (Feature: Abi)");
System.out.print("Opción: ");
int opcion = scanner.nextInt();

switch (opcion) {
    case 1:
        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);
        break;

    case 2:
        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);
        break;

    case 3:
        // Multiplicación (Funcionalidad de Eliezer)
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);
        break;

    case 4:
        // División (Funcionalidad de Abihail con validación)
        if (b != 0) {
            int division = a / b;
            System.out.println("División: " + division);
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
        break;

    default:
        System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3 o 4.");
}

division-feature
    }
}

