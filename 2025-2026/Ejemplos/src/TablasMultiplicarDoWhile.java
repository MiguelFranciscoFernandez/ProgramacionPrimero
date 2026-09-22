import java.util.Scanner;

public class TablasMultiplicarDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- EJERCICIO 1: Tabla usando for ---
        System.out.print("EJERCICIO 1 - Ingrese un número para la tabla (for): ");
        int numFor = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numFor + " usando for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numFor + " x " + i + " = " + (numFor * i));
        }

        System.out.println("\n---------------------------------\n");

        // --- EJERCICIO 2: Tabla usando while ---
        System.out.print("EJERCICIO 2 - Ingrese un número para la tabla (while): ");
        int numWhile = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numWhile + " usando while:");
        int i = 1;
        while (i <= 10) {
            System.out.println(numWhile + " x " + i + " = " + (numWhile * i));
            i++;
        }

        System.out.println("\n---------------------------------\n");

        // --- EJERCICIO 3: Tabla usando do-while ---
        System.out.print("EJERCICIO 3 - Ingrese un número para la tabla (do-while): ");
        int numDoWhile = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numDoWhile + " usando do-while:");
        int j = 1;
        do {
            System.out.println(numDoWhile + " x " + j + " = " + (numDoWhile * j));
            j++;
        } while (j <= 10);

        sc.close();
    }
}
