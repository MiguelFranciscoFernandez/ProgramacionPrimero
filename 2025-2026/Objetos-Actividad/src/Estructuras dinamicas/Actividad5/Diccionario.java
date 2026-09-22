package Actividad5;

import java.util.TreeSet;

public class Diccionario {
    private TreeSet<palabras> conjuntoPalabras = new TreeSet<>();

    public void agregar(String texto) {
        conjuntoPalabras.add(new palabras(texto));
    }

    public void eliminar(String texto) {
        conjuntoPalabras.remove(new palabras(texto));
    }

    public boolean buscar(String texto) {
        return conjuntoPalabras.contains(new palabras(texto));
    }

    public void mostrar() {
        if (conjuntoPalabras.isEmpty()) {
            System.out.println("El diccionario está vacío.");
        } else {
            System.out.println("Diccionario ordenado:");
            for (palabras p : conjuntoPalabras) {
                System.out.println("- " + p.getPalabra());
            }
        }
    }
}
