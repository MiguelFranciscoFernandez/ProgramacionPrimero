package Actividad3;

import java.util.HashSet;

public class AnalizadorTexto {

    private HashSet<Palabra> palabrasUnicas;

    public AnalizadorTexto() {
    }

    public AnalizadorTexto(String texto) {
        this.palabrasUnicas = new HashSet<>();
        agregar(texto);
    }
    
    public void agregar(String texto) {
        String[] partes = texto.trim().split("\\s+");
        for (String p : partes) {
            if (!p.isEmpty()) {
                Palabra palabra = new Palabra(p.toLowerCase());
                if (palabrasUnicas.add(palabra))
                    System.out.println("  + '" + p + "' agregada.");
                else
                    System.out.println("  ~ '" + p + "' ya existe.");
            }
        }
    }

    public boolean buscar(String valor) {
        return palabrasUnicas.contains(new Palabra(valor.toLowerCase()));
    }

    public void eliminar(String valor) {
        if (palabrasUnicas.remove(new Palabra(valor.toLowerCase())))
            System.out.println(" Palabra '" + valor + "' eliminada.");
        else
            System.out.println(" Palabra '" + valor + "' no encontrada.");
    }

    public void mostrar() {
        System.out.println("\n=== Palabras Únicas (" + palabrasUnicas.size() + ") ===");
        if (palabrasUnicas.isEmpty()) {
            System.out.println("No hay palabras.");
        } else {
            int i = 1;
            for (Palabra p : palabrasUnicas)
                System.out.println(i++ + ". " + p);
        }
    }
}