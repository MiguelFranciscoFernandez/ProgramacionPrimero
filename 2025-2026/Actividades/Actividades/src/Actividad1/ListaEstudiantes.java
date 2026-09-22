import java.util.ArrayList;

public class ListaEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public ListaEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregar(Estudiante e) {
        estudiantes.add(e);
    }

    public boolean buscar(String nombre) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarTodos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i).getNombre());
            }
            System.out.println("Total: " + estudiantes.size() + " estudiante(s).");
        }
    }
}
