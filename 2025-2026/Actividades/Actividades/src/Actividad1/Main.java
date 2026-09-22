import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaEstudiantes lista = new ListaEstudiantes();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("1. Agregar\n2. Mostrar\n3. Buscar\n4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                System.out.print("Nombre: ");
                lista.agregar(new Estudiante(scanner.nextLine()));

            } else if (opcion == 2) {
                lista.mostrarTodos();

            } else if (opcion == 3) {
                System.out.print("Buscar: ");
                String busqueda = scanner.nextLine();
                System.out.println(lista.buscar(busqueda) ? "Sí está en la lista." : "No está en la lista.");

            } else if (opcion == 4) {
                System.out.println("¡Hasta luego!");
            }
        }

        scanner.close();
    }
}
