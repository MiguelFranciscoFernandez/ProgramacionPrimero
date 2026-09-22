package Actividad2;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        ColaClientes cola = new ColaClientes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ - Cola de Clientes =====");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Atender siguiente");
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
                    cola.agregar(scanner.nextLine().trim());
                }
                case 2 -> cola.mostrar();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = scanner.nextLine().trim();
                    System.out.println(cola.buscar(nombre)
                        ? "✔ '" + nombre + "' está en la cola."
                        : "✘ '" + nombre + "' NO está en la cola.");
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    cola.eliminar(scanner.nextLine().trim());
                }
                case 5 -> cola.atenderSiguiente();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println(" Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}