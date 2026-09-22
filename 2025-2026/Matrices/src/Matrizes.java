import java.util.Scanner;

public class Matrizes {
    static Scanner scanner = new Scanner(System.in);

    /*
     * # Ejercicio: Matriz de Precios en una Hoja de Inventario
     * Una tienda tiene un inventario organizado en forma de matriz, similar a una
     * hoja de cálculo.
     * Las **columnas** están etiquetadas como en Excel: **A, B, C, D…**
     * Las **filas** representan diferentes **productos**.
     * 
     * La tienda maneja 3 atributos por producto:
     * - **A** → Precio base
     * - **B** → IVA (%)
     * - **C** → Descuento (%)
     * - **D** → Precio final calculado
     * 
     * ## Matriz inicial
     *       A    B    C    D (a calcular)
     * | 1 | 100  21   10   ?
     * | 2 | 59   10   0    ?
     * | 3 | 230  21   5    ?
     * | 4 | 15   4    0    ?
     * 
     * ## Objetivos
     * 1. Representar esta tabla como una **matriz en tu lenguaje de programación.
     * 
     * 2. Crear una función que, dada una “coordenada Excel” (como "B3" o "A1"),
     * devuelva el valor correcto.
     * 
     * 3. Calcular la columna **D** con la fórmula:
     * D = A × (1 + B/100) × (1 - C/100)
     * 4. Rellenar la matriz con los precios finales.
     * 
     * 5. Mostrar la matriz con formato tipo Excel.
     * 
     * 
     * ## Retos adicionales
     * - Permitir introducir rangos ("A1:C3").
     * 
     * - Validar coordenadas incorrectas.
     * 
     * - Añadir filas dinámicamente.
     * 
     * ## Conversión de coordenadas
     * - "A1" → fila 0, columna 0
     * - "C3" → fila 2, columna 2
     * - "D4" → fila 3, columna 3
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Matriz de Precios en una Hoja de Inventario");
        double[][] matriz = {
                { 100, 21, 10, 0 },
                { 59, 10, 0, 0 },
                { 230, 21, 5, 0 },
                { 15, 4, 0, 0 }
        };

        // Calcular precios finales
        for (int i = 0 ; i < matriz.length; i++) {
            double precioBase = matriz[i][0];
            double iva = matriz[i][1];
            double descuento = matriz[i][2];
            double precioFinal = precioBase * (1 + iva / 100) * (1 - descuento / 100);
            matriz[i][3] = precioFinal;
        }
        // Mostrar matriz con formato tipo Excel
        
    }

}
