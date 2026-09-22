import java.util.Scanner;

public class Actividad7 {
    // Creamos un Scanner estático para poder usarlo en todos los métodos
    static Scanner sc = new Scanner(System.in);

    /*
     * Ejercicio 1: Diseña un programa que pide al usuario que ingrese la cantidad
     * de números que va a
     * introducir.
     * Deberá leer la cantidad de números indicada y cuenta cuántos son positivos,
     * negativos
     * y ceros, cuantos pares y cuantos impares,
     * mostrando esa información al finalizar la ejecución.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        System.out.print("Ingrese la cantidad de números que va a introducir: ");
        int cantidad = sc.nextInt();
        int positivos = 0, negativos = 0, ceros = 0, pares = 0, impares = 0; // Contadores
        for (int i = 0; i < cantidad; i++) { // Bucle para leer
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println();
    }

    /*
     * Ejercicio 2:
     * Crea un programa que solicite un número
     * y muestra su tabla de multiplicar del 1 al 10.
     */

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        System.out.println("Ingresa un numero para mostrar su tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) { // Bucle para mostrar la tabla de multiplicar
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();
    }
    /*
     * Ejercicio 3: Diseña un programa que permita al usuario convertir temperaturas
     * de Celsius a
     * Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
     * Para pasar de Celsius a Fahrenheit:
     * (°C * 1,8) + 32 y de Fahrenheit a Celsius: (ºF-32)/1.8)
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        System.out.println("Elige la conversión que deseas realizar:");
        System.out.println("1. De Celsius a Fahrenheit");
        System.out.println("2. De Fahrenheit a Celsius");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Ingresa la temperatura en Celsius:");
            double celsius = sc.nextDouble(); // Leemos la temperatura en Celsius
            double fahrenheit = (celsius * 1.8) + 32; // Convertimos a Fahrenheit
            System.out.println(celsius + "°C son " + fahrenheit + "°F");
        } else if (opcion == 2) {
            System.out.print("Ingresa la temperatura en Fahrenheit:");
            double fahrenheit = sc.nextDouble(); // Leemos la temperatura en Fahrenheit
            double celsius = (fahrenheit - 32) / 1.8; // Convertimos a Celsius
            System.out.println(fahrenheit + "°F son " + celsius + "°C");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    /*
     * Ejercicio 4: Implementa un programa que pida un número entero al usuario y
     * determine si es un
     * número perfecto.
     * Un número es perfecto si es igual a la suma de sus divisores propios. (Los
     * divisores propios de un número son aquellos números por los que es divisible
     * un número
     * sin contar el número)
     */

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        System.out.print("Ingresa un número entero para verificar si es perfecto: ");
        int numero = sc.nextInt();
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) { // Bucle para encontrar divisores propios
            if (numero % i == 0) {
                sumaDivisores += i; // Sumamos el divisor propio
            }
        }
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    /*
     * Ejercicio 5: Crea un programa que pida al usuario un número entero positivo y
     * calcule la suma de
     * todos los números primos hasta ese número
     */

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        System.out.print("Ingresa un número entero positivo: ");
        int limite = sc.nextInt();
        int sumaPrimos = 0;
        for (int num = 2; num <= limite; num++) { // Bucle para verificar cada numero
            boolean esPrimo = true; // Suponemos que es primo
            for (int i = 2; i <= Math.sqrt(num); i++) { // Bucle para verificar si es primo
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                sumaPrimos += num; // Sumamos el número primo
            }

        }
        System.out.println("La suma de los números primos hasta " + limite + " es: " + sumaPrimos);
    }

    /*
     * Ejercicio 6: Diseña un programa que simule una casa de apuestas. Se comenzará
     * con un saldo
     * de
     * 100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar
     * entre 1 y el saldo disponible.
     * Se deberá generar un booleano aleatorio (random.nextBoolean()),
     * en caso de que salga true, el usuario gana el importe apostado.
     * Se jugará a este juego mientras
     * quiera el usuario y/o quede saldo.
     */

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        int saldo = 100;
        java.util.Random random = new java.util.Random();// Creamos un objeto Random para generar booleanos aleatorios
        while (saldo > 0) {
            System.out.println("Tu saldo actual es: " + saldo + "€");
            System.out.print("¿Cuánto quieres apostar? (1 - " + saldo + "): ");
            int apuesta = sc.nextInt();
            if (apuesta < 1 || apuesta > saldo) {
                System.out.println("Apuesta no válida. Inténtalo de nuevo.");
                continue;
            }
            boolean gana = random.nextBoolean(); // Generamos un booleano aleatorio
            if (gana) {
                saldo += apuesta;
                System.out.println("¡Has ganado! Tu nuevo saldo es: " + saldo + "€");
            } else {
                saldo -= apuesta;
                System.out.println("Has perdido. Tu nuevo saldo es: " + saldo + "€");
            }
            if (saldo == 0) {
                System.out.println("Te has quedado sin saldo. Fin del juego.");
                break;
            }
            System.out.print("¿Quieres seguir jugando? (s/n): ");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                System.out.println("Gracias por jugar. Tu saldo final es: " + saldo + "€");
                break;
            }
        }
    }

    /*
     * Ejercicio 7: Crea un programa que simule una quiniela, para ello se deberá
     * leer el resultado de 15
     * partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en
     * variables para luego
     * poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
     * Una vez pedidos todos los resultados iremos generando aleatoriamente el
     * resultado de los partidos,
     * si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
     * Debemos mostrar para finaliza el resultado del partido y el que puso el
     * usuario, y finalmente el
     * número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el
     * pleno al 15.
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        char[] resultadosUsuario = new char[15]; // Array para almacenar los resultados del usuario
        char[] resultadosPartidos = new char[15]; // Array para almacenar los resultados generados
        java.util.Random random = new java.util.Random();

        // Pedimos los resultados al usuario
        for (int i = 0; i < 15; i++) {
            char resultado;
            do {
                System.out.print("Introduce el resultado del partido " + (i + 1) + " (1, X, 2): ");
                resultado = sc.next().toUpperCase().charAt(0);
            } while (resultado != '1' && resultado != 'X' && resultado != '2');
            resultadosUsuario[i] = resultado;
        }

        // Generamos los resultados aleatoriamente
        char[] opciones = { '1', 'X', '2' };
        for (int i = 0; i < 15; i++) { // Bucle para generar resultados
            resultadosPartidos[i] = opciones[random.nextInt(3)]; // Elegimos aleatoriamente entre '1', 'X' o '2'
        }

        // Mostramos los resultados y contamos aciertos
        int aciertos = 0;
        System.out.printf("%-10s %-15s %-15s%n", "Partido", "Usuario", "Resultado");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-10d %-15c %-15c%n", (i + 1), resultadosUsuario[i], resultadosPartidos[i]); //
            if (resultadosUsuario[i] == resultadosPartidos[i]) {
                aciertos++;
            }
        }

        System.out.println("Número total de aciertos: " + aciertos);
    }

    /*
     * Ejercicio 8: Crea un programa que lea una frase por teclado y la convierta al
     * formato camelCase. Por
     * ejemplo, si introducimos por teclado “hola como estás”, el programa deberá
     * mostrar
     * “HolaComoEstás”.
     * Pistas:
     * o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando
     * la función
     * cadena.charAt(i), donde cadena es nuestra variable cadena y la i la posición
     * del carácter.
     * o Podemos pasar a minúscula un carácter con la función:
     * Character.toLowerCase(c), donde c
     * es el carácter a convertir.
     * o Podemos pasar a mayúsculas un carácter con la función:
     * Character.toUpperCase(c), donde c
     * es el carácter a convertir.
     */

     public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        System.out.print("Introduce una frase: ");
        sc.nextLine(); // Limpiamos el buffer
        String frase = sc.nextLine();
        StringBuilder camelCase = new StringBuilder();
        boolean convertirSiguienteAMayuscula = true; // Indicador para convertir a may
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isWhitespace(c)) {
                convertirSiguienteAMayuscula = true; // La siguiente letra debe ser mayúscula
            } else {
                if (convertirSiguienteAMayuscula) {
                    camelCase.append(Character.toUpperCase(c)); // Convertimos a mayúscula
                    convertirSiguienteAMayuscula = false;
                } else {
                    camelCase.append(Character.toLowerCase(c)); // Convertimos a minúscula
                }
            }
        }
        System.out.println("Frase en formato camelCase: " + camelCase.toString());
     }

    public static void main(String[] args) {
        // ejercicio1();
        System.out.println("================================");
        // ejercicio2();
        System.out.println("================================");
        ejercicio3();
        System.out.println("================================");
        // ejercicio4();
        System.out.println("================================");
        // ejercicio5();
        System.out.println("================================");
        // ejercicio6();
        System.out.println("================================");
        // ejercicio7();
        System.out.println("================================");
        // ejercicio8();
        sc.close(); // Cerramos el Scanner al final del programa

    }
}