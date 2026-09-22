import java.util.Scanner;

public class Actividad8 {
    static Scanner sc = new Scanner(System.in);

    /*
     * 1. Realiza una función llamada suma que sume dos números enteros
     * y te devuelva el resultado, posteriormente llámala desde el main y
     * muestra su resultado.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        // Pedimos dos números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Llamamos a la función suma y guardamos el resultado
        int resultado = suma(num1, num2);

        // Mostramos el resultado por consola
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
        System.out.println();
    }

    // Función que devuelve la suma de dos enteros
    public static int suma(int a, int b) {
        return a + b;
    }

    /*
     * 2. Realiza un método llamado holaMundo que al ser llamada
     * muestre por consola el mensaje “Hola Mundo!”.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        // Llamamos al método holaMundo()
        holaMundo();
        System.out.println();
    }

    // Método que imprime un mensaje en pantalla
    public static void holaMundo() {
        System.out.println("Hola Mundo!");
    }

    /*
     * 3. Realiza un método llamado eco con un parámetro de entrada n,
     * que al ser llamada muestre por consola el mensaje “ECO” un
     * número n de veces.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        System.out.print("Introduce el número de veces que quieres que se muestre 'ECO': ");
        int n = sc.nextInt();
        eco(n);
        System.out.println();
    }

    // Bucle que imprime “ECO” n veces
    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
        }
    }

    /*
     * 4. Escribe un método llamado mostrarIntermedios que tenga dos
     * parámetros de entrada a y b (números enteros) y muestre todos
     * los números pares entre ambos números (a y b inclusive).
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        System.out.print("Introduce el primer número (a): ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número (b): ");
        int b = sc.nextInt();

        mostrarIntermedios(a, b);
        System.out.println();
    }

    public static void mostrarIntermedios(int a, int b) {
        // Si el primer número es mayor, intercambiamos
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Si a es impar, incrementamos para empezar por un par
        if (a % 2 != 0) {
            a++;
        }

        System.out.println("Números pares entre " + a + " y " + b + ":");
        for (int i = a; i <= b; i += 2) { // Incrementamos de 2 en 2 para obtener solo pares
            System.out.println(i);
        }
    }

    /*
     * 5. Realiza una función areaCirculo que reciba un parámetro r y te
     * devuelva el área de un círculo de radio r.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        System.out.print("Introduce el radio del círculo: ");
        double r = sc.nextDouble();
        double area = areaCirculo(r);
        System.out.printf("El área del círculo con radio %.2f es: %.2f%n", r, area);
        System.out.println();
    }

    // Fórmula del área del círculo: π * r^2
    public static double areaCirculo(double r) {
        return Math.PI * r * r;
    }

    /*
     * 6. Realiza una función que reciba dos números enteros y devuelva el
     * mayor de los dos, si son iguales devuelve cualquiera de los dos.
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();
        int mayor = mayorDeDos(num1, num2);
        System.out.println("El mayor de " + num1 + " y " + num2 + " es: " + mayor);
        System.out.println();
    }

    // Devuelve el mayor de dos enteros
    public static int mayorDeDos(int a, int b) {
        if (a >= b) { // Incluye el caso de igualdad
            return a;
        } else {
            return b;
        }
    }

    /*
     * 7. Realiza un método llamado mostrar que te muestre un array
     * bidimensional por consola.
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        // Crea una matriz bidimensional con el tamaño especificado
        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los valores de la matriz:");
        // Bucle para rellenar la matriz con los valores introducidos por el usuario
        for (int i = 0; i < filas; i++) { // Recorre las filas
            for (int j = 0; j < columnas; j++) { // Recorre las columnas
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // Guarda el valor introducido en la posición correspondiente
            }
        }

        System.out.println("\nMatriz introducida:");
        mostrar(matriz);
        System.out.println();
    }

    // Método para mostrar una matriz por pantalla en formato tabular
    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de cada fila
                System.out.print(matriz[i][j] + "\t"); // Imprime el valor y añade una tabulación para alinear columnas
            }
            System.out.println();
        }
    }

    /*
     * 8. Realiza una función llamada busqueda que dado un array de
     * enteros y un elemento a buscar te devuelva el valor de la posición
     * donde se encuentra el elementos a buscar en el array (una
     * cualquiera de sus apariciones).
     */
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Introduce el elemento a buscar: ");
        int elemento = sc.nextInt();
        int posicion = busqueda(array, elemento);
        if (posicion != -1) {
            System.out.println("El elemento " + elemento + " se encuentra en la posición: " + (posicion + 1)); // +1
                                                                                                               // para
                                                                                                               // mostrar
                                                                                                               // posición
                                                                                                               // humana
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el array.");
        }
        System.out.println();
    }

    // Método que busca un elemento dentro de un array y devuelve su posición
    public static int busqueda(int[] array, int elemento) {
        // Recorre el array desde el primer hasta el último elemento
        for (int i = 0; i < array.length; i++) {
            // Si el elemento en la posición i es igual al buscado
            if (array[i] == elemento) {
                return i; // Devuelve el índice donde se encontró el elemento
            }
        }
        // Si el elemento no se encuentra en todo el array, devuelve -1
        return -1;
    }

    /*
     * 9. Realiza un método llamado sumaPorElementoM que reciba un
     * array de enteros y un entero y le sume a cada posición del array
     * recibido el entero recibido. (Ojo, es un método)
     */
    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Introduce el valor a sumar a cada elemento del array: ");
        int valor = sc.nextInt();
        sumaPorElementoM(array, valor);
        System.out.println("Array después de sumar " + valor + " a cada elemento:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que suma un valor dado a cada elemento de un array
    public static void sumaPorElementoM(int[] array, int valor) {
        // Recorre todos los elementos del array
        for (int i = 0; i < array.length; i++) {
            // Suma el valor indicado al elemento actual del array
            array[i] += valor;
        }
    }

    /*
     * 10. Realiza una función llamada sumaPorElementoF que reciba un
     * array de enteros y un entero y devuelva un array con el tamaño
     * del array recibido y que contiene en cada posición la suma del
     * elemento del array recibido con el entero recibido (comportamiento parecido
     * al ejercicio anterior). (Ojo, es una
     * función)
     */
    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Introduce el valor a sumar a cada elemento del array: ");
        int valor = sc.nextInt();
        int[] nuevo = sumaPorElementoF(array, valor);
        System.out.println("Array después de sumar " + valor + " a cada elemento:");
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que devuelve un nuevo array donde a cada elemento se le suma un valor
    // dado
    public static int[] sumaPorElementoF(int[] array, int valor) {
        // Crea un nuevo array del mismo tamaño que el original
        int[] nuevo = new int[array.length];

        // Recorre todos los elementos del array original
        for (int i = 0; i < array.length; i++) {
            // Suma el valor indicado al elemento actual y lo guarda en el nuevo array
            nuevo[i] = array[i] + valor;
        }

        // Devuelve el nuevo array resultante
        return nuevo;
    }

    /*
     * 11. Trata de explicar las diferencias entre el comportamiento del
     * método del ejercicio 9 y de la función del ejercicio 10. Fíjate cómo
     * se utilizan en el main.
     */
    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
        System.out.println(
                "El método del ejercicio 9 cambia el array original, mientras que la función del ejercicio 10 crea un nuevo array sin modificar el original, usando el paso por referencia.");
        System.out.println();
    }

    /*
     * 12. Realiza una función llamada negacionBooleana que reciba un
     * array de booleanos y devuelva un array de las mismas
     * dimensiones pero donde antes había un true pasará a haber un
     * false y donde antes había un false pasará a haber un true
     */
    public static void ejercicio12() {
        System.out.println("Ejercicio 12");
        System.out.print("Introduce el tamaño del array de booleanos: ");
        int tamaño = sc.nextInt();
        boolean[] array = new boolean[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + " (true/false): ");
            array[i] = sc.nextBoolean();
        }
        // uso del método
        negacionBooleana(array); // Llamada al método que modifica el array

        // mostrar el array modificado
        System.out.println("Array después de la negación booleana:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que invierte (niega) todos los valores booleanos de un array
    public static void negacionBooleana(boolean[] array) {
        // Recorre todos los elementos del array booleano
        for (int i = 0; i < array.length; i++) {
            // Cambia el valor actual por su negación lógica
            // Si es true → pasa a false; si es false → pasa a true
            array[i] = !array[i];
        }
    }

    /*
     * 13. Haz una función llamada factorial que reciba un entero y te
     * devuelva el resultado del factorial de ese número. Usa esa función
     * factorial para llamarla desde un método llamado factorialArray que
     * reciba un array de enteros (se presupone que mayores de 0) y
     * cambie el valor de cada posición por la del factorial del número
     * que contiene. (Ojo, es un método).
     */
    public static void ejercicio13() {
        System.out.println("Ejercicio 13");
        System.out.print("Introduce el tamaño del array de enteros: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño]; // Crear el array de enteros
        for (int i = 0; i < tamaño; i++) { // Rellenar el array con valores introducidos por el usuario
            System.out.print("Introduce el elemento " + (i + 1) + ": "); // Solicita el valor del elemento
            array[i] = sc.nextInt();
        }
        factorialArray(array);
        System.out.println("Array después de calcular el factorial de cada elemento:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que reemplaza cada elemento del array con su factorial
    public static void factorialArray(int[] array) {
        // Recorre todos los elementos del array
        for (int i = 0; i < array.length; i++) {
            // Calcula el factorial del elemento actual y lo guarda en el array
            array[i] = factorial(array[i]);
        }
    }

    // Método que calcula el factorial de un número entero n
    public static int factorial(int n) {
        int resultado = 1; // Inicializa el resultado en 1 (factorial de 0 es 1)

        // Multiplica resultado por cada número desde 1 hasta n
        for (int i = 1; i <= n; i++) { // Bucle desde 1 hasta n
            resultado *= i; // Multiplica resultado por i en cada iteración
        }

        return resultado; // Devuelve el factorial calculado
    }

    /*
     * 14. Realiza una función que cree un array bidimensional de char
     * 10x10 y lo inicialice poniendo en todas sus posiciones el valor ‘-’
     */
    public static char[][] ejercicio14() {
        System.out.println("Ejercicio 14");
        char[][] matriz = crearTablero();
        System.out.println("Matriz 10x10 inicializada con '-':");
        mostrar(matriz);
        System.out.println();
        return matriz;
    }

    // Método que crea un tablero de 10x10 inicializado con el carácter '-'
    public static char[][] crearTablero() {
        // Crea una matriz de caracteres de 10 filas y 10 columnas
        char[][] matriz = new char[10][10];

        // Recorre cada fila
        for (int i = 0; i < matriz.length; i++) {
            // Recorre cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '-'; // Inicializa cada celda con el carácter '-'
            }
        }

        return matriz; // Devuelve el tablero creado
    }

    // Método que muestra en pantalla cualquier matriz de caracteres
    public static void mostrar(char[][] matriz) {
        // Recorre cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorre cada columna de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime el carácter seguido de un espacio
            }
            System.out.println(); // Salta a la siguiente línea después de imprimir una fila completa
        }
    }

    /*
     * 15. Haz un método llamado mostrarTableroRaya que genere un
     * tablero de 10x10 donde en todas las casillas está el caracter ‘-’ y
     * muestre el tablero de la siguiente forma: (NOTA: utiliza la función
     * anterior)
     */
    public static void ejercicio15() {
        System.out.println("Ejercicio 15");
        char[][] tablero = crearTablero();
        // Imprime las columnas numeradas en la parte superior
        System.out.print("   "); // Espacio inicial para alinear con las etiquetas de las filas
        for (int col = 0; col < tablero[0].length; col++) {
            System.out.printf("%2d ", col); // Imprime el número de la columna con un ancho de 2 caracteres
        }
        System.out.println(); // Salto de línea después de imprimir los números de columna

        // Recorre cada fila del tablero
        for (int i = 0; i < tablero.length; i++) {
            char etiquetaFila = (char) ('A' + i); // Convierte el índice de fila en letra (0 → 'A', 1 → 'B', etc.)
            System.out.print(etiquetaFila + "  "); // Imprime la letra de la fila con espacio para alinear

            // Recorre cada columna de la fila actual
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j] + " "); // Imprime el contenido de la celda con espacios
            }

            System.out.println(); // Salto de línea al final de la fila
        }

        System.out.println("\n"); // Línea extra para separar el tablero de cualquier salida posterior
    }

    /*
     * 16. Realiza una función copyArrayMasUno que reciba un array y
     * devuelva un array con los elementos copiados y una posición más
     * con el valor 0.
     */
    public static void ejercicio16() {
        System.out.println("Ejercicio 16");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        array = copyArrayMasUno(array);

        System.out.println("Array después de copiar y añadir 0 al final:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que crea una copia de un array de enteros y le añade un elemento extra
    // al final
    public static int[] copyArrayMasUno(int[] array) {
        // Crea un nuevo array con un tamaño mayor en 1 que el original
        int[] nuevoArray = new int[array.length + 1];

        // Copia todos los elementos del array original al nuevo array
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }

        // Inicializa el último elemento del nuevo array en 0
        nuevoArray[array.length] = 0;

        // Devuelve el nuevo array ampliado
        return nuevoArray;
    }

    /*
     * 17. Realiza una función llamada noRepetidos que reciba un array
     * de enteros que pueden estar repetidos y devuelva un nuevo array
     * sin ningún entero repetido. (NOTA: usa la función anterior)
     * Ejemplos:
     * entrada: [1, 3, 0, 1, 3, 6, 2, 1] → salida: [1, 3, 0, 6, 2]
     * entrada: [1, 1, 0, 1, 2, 1, 2, 1] → salida: [1, 0, 2]
     */

    public static void ejercicio17() {
        System.out.println("Ejercicio 17");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int[] sinRepetidos = noRepetidos(array);
        System.out.println("Array sin elementos repetidos:");
        for (int i = 0; i < sinRepetidos.length; i++) {
            System.out.print(sinRepetidos[i] + " ");
        }
        System.out.println("\n");
    }

    // Método que devuelve un nuevo array con los elementos únicos de otro array
    public static int[] noRepetidos(int[] array) {
        int[] resultado = new int[0]; // Inicializa un array vacío para almacenar los elementos únicos

        // Recorre todos los elementos del array original
        for (int i = 0; i < array.length; i++) {
            boolean encontrado = false; // Variable para comprobar si el elemento ya está en resultado

            // Recorre el array resultado para ver si el elemento ya existe
            for (int j = 0; j < resultado.length; j++) {
                if (array[i] == resultado[j]) {
                    encontrado = true; // Marca que el elemento ya está presente
                    break; // Sale del bucle interno, no hace falta seguir buscando
                }
            }

            // Si el elemento no estaba en el array resultado, se añade
            if (!encontrado) {
                resultado = copyArrayMasUno(resultado); // Amplía el array resultado en 1 posición
                resultado[resultado.length - 1] = array[i]; // Añade el nuevo elemento al final
            }
        }

        return resultado; // Devuelve el array con elementos únicos
    }

    /*
     * 18. Realiza una función llamada invertirArray que reciba un array
     * de enteros y devuelva otro array con las posiciones invertidas:
     * Ejemplos:
     * entrada: [1, 3, 6, 2, 4, 1] → salida: [1, 4, 2, 6, 3, 1]
     */

    public static void ejercicio18() {
        System.out.println("Ejercicio 18");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    // Método que devuelve un nuevo array con los elementos del array original en
    // orden inverso
    public static int[] invertirArray(int[] array) {
        // Crea un nuevo array del mismo tamaño que el original
        int[] invertido = new int[array.length];

        // Recorre todos los elementos del array original
        for (int i = 0; i < array.length; i++) {
            // Copia el elemento del final del array original al principio del nuevo array
            invertido[i] = array[array.length - 1 - i];
        }

        // Devuelve el array invertido
        return invertido;
    }

    /*
     * 19. Realiza un método llamado ordenacionM que reciba un array
     * de enteros y un char, si el char tiene el valor ‘c’ realiza la
     * ordenación creciente, si el char tiene el valor ‘d’ realiza la
     * ordenación decreciente.
     * Ejemplo:
     * entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘c’ → salida: [1, 1, 2, 3, 3, 4, 9]
     * entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘d’ → salida: [9, 4, 3, 3, 2, 1, 1]
     */

    public static void ejercicio19() {
        System.out.println("Ejercicio 19");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Introduce 'c' para ordenación creciente o 'd' para decreciente: ");
        char orden = sc.next().charAt(0);
        ordenacionM(array, orden);
        System.out.println("Array ordenado:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void ordenacionM(int[] array, char orden) {
        // Bucle para recorrer todos los elementos del array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Compara elementos según el orden especificado
                if ((orden == 'c' && array[j] > array[j + 1]) || (orden == 'd' && array[j] < array[j + 1])) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /*
     * 20. Realiza una método que dado un array de números enteros
     * positivos mayor o igual que 1 (naturales) lo ordene según el
     * número de divisores que tiene cada número.
     * Ejemplo:el número 6 (tiene cuatro divisores: 1, 2, 3, 6), el número
     * 12 (tiene seis divisores: 1, 2, 3, 4, 6, 12), el número 17 (tiene dos
     * divisores: 1, 17), el número 5 (tiene dos divisores: 1 y 5). Por lo
     * tanto su orden sería:
     * entrada: [1, 5, 6, 17, 12] → salida: [12, 6, 17, 5, 1] (También podría
     * ir el 5 antes que el 17 puesto que tienen el mismo número de
     * divisores)
     * NOTA1: Haz primero una función compararPorNumDivisores que
     * reciba dos números enteros mayores o iguales que uno y los
     * compare de tal forma que:
     * si el primero tiene más divisores que el segundo la salida sea 1
     * si el segundo tiene más divisores que el primero la salida sea -1
     * si tienen ambos el mismo número de divisores la salida sea 0
     * NOTA2: Realiza una función numDivisores que reciba un número
     * entero mayor o igual que 1 y devuelva el número de divisores que
     * tiene ese número.
     * Ejemplo:
     * entrada: 1 → salida: 1
     * entrada 12 → salida: 6
     * entrada 5 → salida: 2
     * NOTA3: Realiza una función isDivisor que reciba dos números
     * enteros mayores o iguales que uno y devuelva si el segundo es
     * divisor del primero (true) o si no es divisor (false).
     * Ejemplo:
     * entrada: 12, 5 → salida: false
     * entrada 12, 6 → salida: true
     * entrada 5, 5 → salida: true
     */

    public static void ejercicio20() {
        System.out.println("Ejercicio 20");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        // ordenamos el array usando el método de comparación por número de divisores
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (compararPorNumDivisores(array[j], array[j + 1]) == -1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println("Array ordenado por número de divisores:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static int compararPorNumDivisores(int a, int b) {
        int divisoresA = numDivisores(a);
        int divisoresB = numDivisores(b);
        if (divisoresA > divisoresB) {
            return 1;
        } else if (divisoresA < divisoresB) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int numDivisores(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (isDivisor(n, i)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean isDivisor(int a, int b) {
        return a % b == 0;
    }

    /*
     * 21. Haz una función llamada desplazamiento que reciba un array
     * de char y un número entero mayor o igual que cero, y devuelva un
     * nuevo array que sea el resultado de desplazar los elementos el
     * número de posiciones introducido. Se consideran las posiciones
     * ciclicas, por ejemplo, si el array tiene tamaño 4 y el elemento de la
     * posición 3 debe desplazarse 2 posiciones, la nueva posición será
     * 1.
     * ejemplo:
     * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 3 → salida: [‘t’, ‘s’, ‘k’, ‘a’, ‘v’]
     * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 0 → salida: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’]
     * entrada: [‘a’, ‘v’, ‘t’, ‘s’, ‘k’], 1 → salida: [ ‘k’, ‘a’, ‘v’, ‘t’, ‘s’]
     */

    public static void ejercicio21() {
        System.out.println("Ejercicio 21");
        System.out.println("Introduce el tamaño del array de caracteres: ");
        int tamaño = sc.nextInt();
        char[] array = new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el carácter " + (i + 1) + ": ");
            array[i] = sc.next().charAt(0);
        }
        System.out.print("Introduce el número de posiciones a desplazar: ");
        int posiciones = sc.nextInt();
        char[] desplazado = desplazamiento(array, posiciones);
        System.out.println("Array después del desplazamiento:");
        for (int i = 0; i < desplazado.length; i++) {
            System.out.print(desplazado[i] + " ");
        }
        System.out.println("\n");
    }

    public static char[] desplazamiento(char[] array, int posiciones) {
        int tamaño = array.length;
        char[] nuevoArray = new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            int nuevaPosicion = (i + posiciones) % tamaño;
            nuevoArray[nuevaPosicion] = array[i];
        }
        return nuevoArray;
    }

    /*
     * 22. Realiza una función llamada sumatorioDivisoresArray que
     * realice el sumatorio de los divisores de todos los números de un
     * array.
     * Ejemplo:
     * entrada: [6, 5, 4] → salida: 25
     * seis tiene de divisores a 1, 2, 3 y 6
     * cinco tiene de divisores a 1 y 5
     * cuatro tiene de divisores a 1, 2 y 4
     * la suma total de todos los divisores de los números del array es:
     * (1+2+3+6)+(1+5)+(1+2+4) = 12+6+7 = 25
     */

    public static void ejercicio22() {
        System.out.println("Ejercicio 22");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int sumaTotal = sumatorioDivisoresArray(array);
        System.out.println("La suma total de los divisores de todos los números del array es: " + sumaTotal);
        System.out.println("\n");
    }

    public static int sumatorioDivisoresArray(int[] array) {
        int sumaTotal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i]; j++) {
                if (isDivisor(array[i], j)) {
                    sumaTotal += j;
                }
            }
        }
        return sumaTotal;
    }

    /*
     * 23. Realiza una función llamada subsecuenciaCrecienteMasLarga
     * que dado un array de enteros te devuelva un entero que indique la
     * posición de inicio de la subsecuencia creciente más larga. En caso
     * de empate devuelve cualquiera de las posiciones de inicio de
     * ellas.
     * Ejemplo:
     * entrada: [2, 4, 1, 3, 5, 8, 12, 2, 3, 2, 1, 3, 5, 7, 8]
     * salida: 2
     * (La subsecuencia de enteros más larga en este caso es la que
     * comienza en la posición 2, y está formada por 1, 3, 5, 8, 12)
     */

    public static void ejercicio23() {
        System.out.println("Ejercicio 23");
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int posicionInicio = subsecuenciaCrecienteMasLarga(array);
        System.out.println("La posición de inicio de la subsecuencia creciente más larga es: " + posicionInicio);
        System.out.println("\n");
    }

    public static int subsecuenciaCrecienteMasLarga(int[] array) {
        int maxLongitud = 1;
        int posicionInicioMax = 0;

        for (int i = 0; i < array.length; i++) {
            int longitudActual = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    longitudActual++;
                } else {
                    break;
                }
            }
            if (longitudActual > maxLongitud) {
                maxLongitud = longitudActual;
                posicionInicioMax = i;
            }
        }

        return posicionInicioMax;
    }

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        // ejercicio11();
        // ejercicio12();
        // ejercicio13();
        // ejercicio14();
        // ejercicio15();
        // ejercicio16();
        // ejercicio17();
        // ejercicio18();
        // ejercicio19();
        // ejercicio20();
        // ejercicio21();
        // ejercicio22();
        // ejercicio23();
        sc.close();
    }
}
