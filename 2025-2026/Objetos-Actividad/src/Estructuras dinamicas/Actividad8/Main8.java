
import java.util.TreeMap;
import java.util.Scanner;

public class Main8 {
    static TreeMap<String, String> agenda = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=====  Lista de ranking (TreeMap) =====");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Mostrar ranking");
            System.out.println("3. Buscar jugador");
            System.out.println("4. Eliminar jugador");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregar();
                case 2 -> mostrar();
                case 3 -> buscar();
                case 4 -> eliminar();
                case 5 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }

    static void agregar() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Jugador '" + nombre + "' agregado.");
    }

    static void mostrar() {
        if (agenda.isEmpty()) {
            System.out.println("El ranking esta vacio.");
            return;
        }
        System.out.println("\n--- Ranking de Jugadores (orden descendente) ---");
        int i = 1;
        for (var entry : agenda.entrySet())
            System.out.println(i++ + ". " + entry.getKey() + " - " + entry.getValue());
        System.out.println("Total: " + agenda.size() + " jugadores.");
    }

    static void buscar() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();
        String puntos = agenda.get(nombre);
        System.out.println(puntos != null ? "Puntos: " + puntos : "Jugador no encontrado.");
    }

    static void eliminar() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();
        System.out.println(agenda.remove(nombre) != null ? "Jugador '" + nombre + "' eliminado." : "Jugador no encontrado.");
    }
}