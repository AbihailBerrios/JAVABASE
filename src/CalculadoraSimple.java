import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = scanner.nextInt();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1://operacion suma
                int suma = a + b;
                System.out.println("Suma: " + suma);
                break;
        

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta);

        scanner.close();

        
    }
}
