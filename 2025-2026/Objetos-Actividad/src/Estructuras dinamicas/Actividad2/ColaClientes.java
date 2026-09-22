package Actividad2;

import java.util.LinkedList;

public class ColaClientes {

    private LinkedList<Cliente> cola;

    public ColaClientes() {
    }

    public ColaClientes( String nombre) {
        this.cola = new LinkedList<>();
    }

    public void agregar(String nombre) {
        cola.add(new Cliente(nombre));
        System.out.println(" Cliente '" + nombre + "' agregado a la cola.");
    }

    public boolean buscar(String nombre) {
        for (Cliente c : cola) {
            if (c.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }

    public void eliminar(String nombre) {
        for (Cliente c : cola) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                cola.remove(c);
                System.out.println(" Cliente '" + nombre + "' eliminado.");
                return;
            }
        }
        System.out.println(" Cliente '" + nombre + "' no encontrado.");
    }

    public void atenderSiguiente() {
        if (cola.isEmpty()) {
            System.out.println(" No hay clientes en la cola.");
        } else {
            System.out.println(" Atendiendo a: " + cola.poll().getNombre());
        }
    }

    public void mostrar() {
        System.out.println("\n=== Cola de Clientes ===");
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            int i = 1;
            for (Cliente c : cola)
                System.out.println(i++ + ". " + c.getNombre());
        }
    }
}