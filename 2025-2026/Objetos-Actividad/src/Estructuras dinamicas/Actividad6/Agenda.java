package Actividad6;

import java.util.HashMap;

public class Agenda {
    private HashMap<String, String> contactos = new HashMap<>();

    public boolean agregar(String nombre, String telefono) {
        if (telefono.length() <= 12 && telefono.matches("\\d+")) {
            contactos.put(nombre, telefono);
            return true;
        }
        return false;
    }

    public String buscar(String nombre) {
        return contactos.getOrDefault(nombre, "Contacto no encontrado");
    }
}