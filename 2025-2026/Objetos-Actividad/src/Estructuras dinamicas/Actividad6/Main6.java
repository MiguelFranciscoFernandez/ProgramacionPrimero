package Actividad6;

import java.util.TreeMap;
import java.util.Scanner;

public class Main6 {
    static TreeMap<String, String> agenda = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== AGENDA TELEFONICA (TreeMap) =====");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar agenda");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
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
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        agenda.put(nombre, telefono);
        System.out.println("Contacto '" + nombre + "' agregado.");
    }

    static void mostrar() {
        if (agenda.isEmpty()) { System.out.println("La agenda esta vacia."); return; }
        System.out.println("\n--- Agenda (orden alfabetico) ---");
        int i = 1;
        for (var entry : agenda.entrySet())
            System.out.println(i++ + ". " + entry.getKey() + " - " + entry.getValue());
        System.out.println("Total: " + agenda.size() + " contactos.");
    }

    static void buscar() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();
        String telefono = agenda.get(nombre);
        System.out.println(telefono != null 
            ? "Telefono: " + telefono : "Contacto no encontrado.");
    }

    static void eliminar() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();
        System.out.println(agenda.remove(nombre) != null
            ? "Contacto '" + nombre + "' eliminado." : "Contacto no encontrado.");
    }
}