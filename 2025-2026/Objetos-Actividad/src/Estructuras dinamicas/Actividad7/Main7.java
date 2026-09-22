
import java.util.TreeMap;
import java.util.Scanner;

public class Main7 {
    static TreeMap<String, String> agenda = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=====  Lista de la compra (LinkedHashMap ) =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
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
        System.out.print("Precio: ");
        String precio = sc.nextLine();
        agenda.put(nombre, precio);
        System.out.println("Producto '" + nombre + "' agregado.");
    }

    static void mostrar() {
        if (agenda.isEmpty()) {
            System.out.println("La lista de la compra esta vacia.");
            return;
        }
        System.out.println("\n--- Lista de la compra (orden alfabetico) ---");
        int i = 1;
        for (var entry : agenda.entrySet())
            System.out.println(i++ + ". " + entry.getKey() + " - " + entry.getValue());
        System.out.println("Total: " + agenda.size() + " productos.");
    }

    static void buscar() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();
        String precio = agenda.get(nombre);
        System.out.println(precio != null
                ? "Precio: " + precio
                : "Producto no encontrado.");
    }

    static void eliminar() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();
        System.out.println(agenda.remove(nombre) != null
        ? "Producto '" + nombre + "' eliminado.": "Producto no encontrado.");
    }
}