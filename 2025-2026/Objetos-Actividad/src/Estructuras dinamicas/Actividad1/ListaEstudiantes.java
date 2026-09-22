package Actividad1;
import java.util.ArrayList;


public class ListaEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public ListaEstudiantes(){}

    public ListaEstudiantes( String nombre) {
        this.estudiantes = new ArrayList<>();
    }

    public void agregar(String nombre) {
        estudiantes.add(new Estudiante(nombre));
        System.out.println(" Estudiante '" + nombre + "' agregado.");
    }

    public boolean buscar(String nombre) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void eliminar(String nombre) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.remove(i);
                System.out.println(" Estudiante '" + nombre + "' eliminado.");
                return;
            }
        }
        System.out.println(" Estudiante '" + nombre + "' no encontrado.");
    }

    public void mostrar() {
        System.out.println("\n=== Lista de Estudiantes ===");
        if (estudiantes.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i).getNombre());
            }
        }
    }
}
