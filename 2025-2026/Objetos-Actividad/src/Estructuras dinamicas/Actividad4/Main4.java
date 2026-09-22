package Actividad4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        RegistroVisitantes registro = new RegistroVisitantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ - Registro Visitantes (LinkedHashSet) =====");
            System.out.println("1. Agregar visitante");
            System.out.println("2. Mostrar visitantes");
            System.out.println("3. Buscar visitante");
            System.out.println("4. Eliminar visitante");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    registro.agregar(scanner.nextLine().trim());
                }
                case 2 -> registro.mostrar();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String n = scanner.nextLine().trim();
                    System.out.println(registro.buscar(n) ? "Visitante '" + n + "' encontrado."
                            : "Visitante '" + n + "' no encontrado.");
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    registro.eliminar(scanner.nextLine().trim());
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}