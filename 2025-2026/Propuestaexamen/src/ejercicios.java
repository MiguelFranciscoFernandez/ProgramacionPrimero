import java.util.Scanner;
import java.util.Random;

public class ejercicios {
    static Scanner scanner = new Scanner(System.in);

    /*
     * 1. Ejercicios con Arrays (Vectores)
     * Ejercicio A: Estadísticas de notas
     * 
     * Escribe un programa que pida al usuario las notas de 10 alumnos y las guarde
     * en un array. Luego, crea funciones para:
     * 
     * Calcular la nota media.
     * 
     * Mostrar la nota más alta y la más baja.
     * 
     * Contar cuántos alumnos están aprobados (nota >= 5).
     */

    public static void ejercicio1() {
        final int Alumnos = 10;
        double[] notas = new double[Alumnos];
        for (int i = 0; i < Alumnos; i++) { // Bucle para pedir las notas
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double media = calcularMedia(notas);
        double[] extremos = encontrarExtremos(notas);
        int aprobados = contarAprobados(notas);
        System.out.printf("La nota media es: %.2f%n", media);
        System.out.printf("La nota más alta es: %.2f%n", extremos[0]);
        System.out.printf("La nota más baja es: %.2f%n", extremos[1]);
        System.out.println("Número de alumnos aprobados: " + aprobados);
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double[] encontrarExtremos(double[] notas) {
        double max = notas[0];
        double min = notas[0];
        for (double nota : notas) { // Bucle para encontrar max y min
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
        }
        return new double[] { max, min };
    }

    public static int contarAprobados(double[] notas) {
        int contador = 0;
        for (double nota : notas) { // Bucle para contar aprobados
            if (nota >= 5) {
                contador++;
            }
        }
        return contador;
    }

    /*
     * Ejercicio B: Búsqueda y desplazamiento
     * 
     * Crea un array de 10 números enteros aleatorios entre 1 y 20.
     * 
     * Pide al usuario un número y busca si está en el array (indica su posición).
     * 
     * Reto: "Rota" el array una posición a la derecha (el último elemento pasa a
     * ser el primero).
     */

    public static void ejercicio2() {
        final int Tamaño = 10;
        int[] numeros = new int[Tamaño]; // Array de 10 números enteros
        Random random = new Random();
        for (int i = 0; i < Tamaño; i++) {
            numeros[i] = random.nextInt(20) + 1; // Números aleatorios entre 1 y 20
        }

        System.out.print("Introduce un número para buscar en el array: ");
        int numeroBuscado = scanner.nextInt();
        int posicion = buscarNumero(numeros, numeroBuscado);
        if (posicion != -1) { // Número encontrado
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
        }
        rotarArrayDerecha(numeros);
        System.out.print("Array después de rotar a la derecha: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) { // Bucle para buscar el número
            if (array[i] == numero) { // Compara cada elemento con el número buscado
                return i; // Devuelve la posición si se encuentra
            }
        }
        return -1; // Devuelve -1 si no se encuentra
    }

    public static void rotarArrayDerecha(int[] array) {
        int ultimo = array[array.length - 1]; // Guarda el último elemento
        for (int i = array.length - 1; i > 0; i--) { // Desplaza los elementos a la derecha
            array[i] = array[i - 1]; // Mueve cada elemento una posición a la derecha
        }
        array[0] = ultimo;
    }

    /*
     * 2. Ejercicios con Matrices (Tablas)
     * Ejercicio C: El cuadrado mágico
     * 
     * Crea una matriz de 3×3. Pide al usuario que rellene todos los huecos con
     * números.
     * 
     * Diseña una función que compruebe si la matriz es un cuadrado mágico.
     * 
     * Condición: La suma de cada fila, cada columna y las dos diagonales debe ser
     * la misma.
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3: El cuadrado mágico");
        final int Tamaño = 3;// Matriz de 3x3
        int[][] matriz = new int[Tamaño][Tamaño];// Declaración de la matriz
        // Rellenar la matriz con números introducidos por el usuario
        for (int i = 0; i < Tamaño; i++) { // Bucle para filas
            for (int j = 0; j < Tamaño; j++) { // Bucle para columnas
                System.out.print("Introduce el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        if (esCuadradoMagico(matriz)) {
            System.out.println("La matriz es un cuadrado mágico.");
        } else {
            System.out.println("La matriz no es un cuadrado mágico.");
        }
    }

    public static boolean esCuadradoMagico(int[][] matriz) {
        int sumaFilaReferencia = 0;
        for (int j = 0; j < matriz.length; j++) {
            sumaFilaReferencia += matriz[0][j];
        }
        // Comprobar filas
        for (int i = 1; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaFilaReferencia) {
                return false;
            }
        }
        // Comprobar columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaFilaReferencia) {
                return false;
            }
        }
        // Comprobar diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaFilaReferencia) {
                return false;
        }
        // Comprobar diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        if (sumaDiagonalSecundaria != sumaFilaReferencia) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Selecciona el ejercicio a ejecutar:");
        System.out.println("1. Estadísticas de notas");
        System.out.println("2. Búsqueda y desplazamiento");
        System.out.println("3. El cuadrado mágico");
        System.out.print("Introduce el número del ejercicio (1-3): ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            default:
                System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}
