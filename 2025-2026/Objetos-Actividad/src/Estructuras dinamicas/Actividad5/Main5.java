package Actividad5;

import java.util.TreeSet;
import java.util.Scanner;

public class Main5 {
    static TreeSet<String> diccionario = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== DICCIONARIO ORDENADO (TreeSet) =====");
            System.out.println("1. Agregar palabra");
            System.out.println("2. Mostrar diccionario");
            System.out.println("3. Buscar palabra");
            System.out.println("4. Eliminar palabra");
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
        System.out.print("Palabra a agregar: ");
        String palabra = sc.nextLine().toLowerCase();
        if (diccionario.add(palabra))
            System.out.println("Palabra '" + palabra + "' agregada.");
        else
            System.out.println("La palabra '" + palabra + "' ya existe.");
    }

    static void mostrar() {
        if (diccionario.isEmpty()) { System.out.println("El diccionario esta vacio."); return; }
        System.out.println("\n--- Diccionario (orden alfabetico) ---");
        int i = 1;
        for (String p : diccionario) System.out.println(i++ + ". " + p);
        System.out.println("Total: " + diccionario.size() + " palabras.");
    }

    static void buscar() {
        System.out.print("Palabra a buscar: ");
        String palabra = sc.nextLine().toLowerCase();
        System.out.println(diccionario.contains(palabra)
            ? "SI esta en el diccionario." : "NO esta en el diccionario.");
    }

    static void eliminar() {
        System.out.print("Palabra a eliminar: ");
        String palabra = sc.nextLine().toLowerCase();
        System.out.println(diccionario.remove(palabra)
            ? "Palabra '" + palabra + "' eliminada." : "Palabra no encontrada.");
    }
}