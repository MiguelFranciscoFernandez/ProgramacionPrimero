package Actividad4;

import java.util.LinkedHashSet;

public class RegistroVisitantes {

    private LinkedHashSet<Visitante> visitantes;

    public RegistroVisitantes() {
    }

    public RegistroVisitantes(LinkedHashSet<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public void agregar(String nombre) {
        Visitante v = new Visitante(nombre);
        if (visitantes.add(v))
            System.out.println("Visitante '" + nombre + "' registrado.");
        else
            System.out.println("Visitante '" + nombre + "' ya fue registrado.");
    }

    public boolean buscar(String nombre) {
        return visitantes.contains(new Visitante(nombre));
    }

    public void eliminar(String nombre) {
        if (visitantes.remove(new Visitante(nombre)))
            System.out.println("Visitante '" + nombre + "' eliminado.");
        else
            System.out.println("Visitante '" + nombre + "' no encontrado.");
    }

    public void mostrar() {
        System.out.println("\n=== Visitantes en orden de llegada ===");
        if (visitantes.isEmpty()) {
            System.out.println("No hay visitantes.");
        } else {
            int i = 1;
            for (Visitante v : visitantes)
                System.out.println(i++ + ". " + v);
        }
    }
}