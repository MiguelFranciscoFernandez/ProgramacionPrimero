package Actividad1;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ - Lista de Estudiantes =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
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
                    lista.agregar(scanner.nextLine().trim());
                }
                case 2 -> lista.mostrar();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = scanner.nextLine().trim();
                    System.out.println(lista.buscar(nombre)
                        ? " '" + nombre + "' SÍ está en la lista."
                        : " '" + nombre + "' NO está en la lista.");
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    lista.eliminar(scanner.nextLine().trim());
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println(" Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
