import java.util.Scanner;
import java.util.Random;

public class Array2 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char opcion;

        do {
            System.out.println("\n=== EJERCICIO 11 ===");

            // -------- Ejercicio 1 --------
            int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
            };

            System.out.println("Matriz original:");
            imprimirMatriz(matriz);

            System.out.println("Matriz rotada 90°:");
            imprimirMatriz(rotar90(matriz));

            System.out.println("Matriz transpuesta:");
            imprimirMatriz(transponer(matriz));

            // -------- Ejercicio 2 --------
            int H = 6, W = 6;  // Tamaño matriz grande
            int[][] big = crearMatrizRandom(H, W);

            // Elegimos tamaño del pattern
            int h = 2 + random.nextInt(2); // 2 o 3
            int w = 2 + random.nextInt(2); // 2 o 3

            // Elegimos posición aleatoria dentro de la matriz grande
            int startI = random.nextInt(H - h + 1);
            int startJ = random.nextInt(W - w + 1);

            // Extraemos el pattern directamente de la matriz grande
            int[][] pattern = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    pattern[i][j] = big[startI + i][startJ + j];
                }
            }

            System.out.println("Matriz grande:");
            imprimirMatriz(big);

            System.out.println("Pattern (submatriz extraída de la matriz grande):");
            imprimirMatriz(pattern);

            System.out.println("Buscando submatriz...");
            buscarSubmatriz(big, pattern);

            // Preguntar si desea repetir
            System.out.print("¿Desea repetir? (s/n): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        System.out.println("Programa finalizado.");
    }

    // ----------------------------------------------------
    // Crear matriz aleatoria
    // ----------------------------------------------------
    public static int[][] crearMatrizRandom(int filas, int columnas) {
        int[][] mat = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mat[i][j] = random.nextInt(10); // números 0..9
            }
        }
        return mat;
    }

    // ----------------------------------------------------
    // Ejercicio 1: rotar y transponer
    // ----------------------------------------------------
    public static int[][] rotar90(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }
        return matrizRotada;
    }

    public static int[][] transponer(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }

    // ----------------------------------------------------
    // Ejercicio 2: buscar submatriz
    // ----------------------------------------------------
    public static void buscarSubmatriz(int[][] big, int[][] pattern) {

        int bigRows = big.length;
        int bigCols = big[0].length;

        int patternRows = pattern.length; 
        int patternCols = pattern[0].length; 

        boolean rastreo = false;

        for (int i = 0; i <= bigRows - patternRows; i++) {
            for (int j = 0; j <= bigCols - patternCols; j++) {

                boolean match = true;

                for (int k = 0; k < patternRows; k++) {
                    for (int l = 0; l < patternCols; l++) {

                        if (big[i + k][j + l] != pattern[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) break;
                }

                if (match) {
                    rastreo = true;
                    System.out.println("Pattern encontrado en: (" + i + ", " + j + ")");
                }
            }
        }

        if (!rastreo) {
            System.out.println("No se encontró la submatriz. (Esto no debería pasar)");
        }
    }

    // ----------------------------------------------------
    // Imprimir matriz
    // ----------------------------------------------------
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}