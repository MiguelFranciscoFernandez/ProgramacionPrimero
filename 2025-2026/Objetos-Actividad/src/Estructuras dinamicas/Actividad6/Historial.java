package Actividad6;

import java.util.LinkedHashMap;

public class Historial {

    private LinkedHashMap<String, Double> compras = new LinkedHashMap<>();

    public void agregar(String p, double precio) {
        compras.put(p, precio);
    }

    public void mostrar() {
        compras.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
