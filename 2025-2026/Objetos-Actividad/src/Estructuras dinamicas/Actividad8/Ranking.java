import java.util.Collections;
import java.util.TreeMap;

public class Ranking {
    private TreeMap<Integer, String> ranking = new TreeMap<>(Collections.reverseOrder());

    public void registrarJugador(int puntos, String nombre) {
        ranking.put(puntos, nombre);
    }

    public void mostrarRanking() {
        System.out.println("Ranking de Jugadores:");
        ranking.forEach((puntos, nombre) -> 
            System.out.println(nombre + " - " + puntos + " pts"));
    }
}