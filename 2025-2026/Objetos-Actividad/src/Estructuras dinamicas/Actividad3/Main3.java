package Actividad3;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        AnalizadorTexto analizador = new AnalizadorTexto();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ - Palabras Únicas (HashSet) =====");
            System.out.println("1. Agregar texto");
            System.out.println("2. Mostrar palabras");
            System.out.println("3. Buscar palabra");
            System.out.println("4. Eliminar palabra");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1 -> { System.out.print("Texto: "); analizador.agregar(scanner.nextLine()); }
                case 2 -> analizador.mostrar();
                case 3 -> {
                    System.out.print("Palabra a buscar: ");
                    String p = scanner.nextLine().trim();
                    System.out.println(analizador.buscar(p) ? "✔ '" + p + "' está." : "✘ '" + p + "' NO está.");
                }
                case 4 -> { System.out.print("Palabra a eliminar: "); analizador.eliminar(scanner.nextLine().trim()); }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println(" Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}

