import java.util.Scanner;

public class Actividad6 {
    static Scanner sc = new Scanner(System.in);

    /*
     * Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba
     * tantas líneas como diga
     * el número y en cada línea escriba desde el número 1 hasta el número
     * introducido.
     * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
     * 12345
     * 12345
     * 12345
     * 12345
     * 12345
     * Bucle
     */

    public static void ejercicio1() {
        System.out.println("Ejercicio 1");
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) { // i empieza en 0 y va hasta numero-1
            for (int j = 1; j <= numero; j++) { // j empieza en 1 y va hasta numero
                System.out.print(j); // Imprime j en cada iteración del bucle interno
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, pero en
     * este caso deberá
     * escribir los números en orden decreciente, es decir, si introducimos el
     * número 5 deberá mostrar en
     * pantalla:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) { // Controla las líneas
            for (int j = numero; j >= 1; j--) { // Controla los números por línea
                System.out.print(j); // Imprime los números desde numero hasta 1
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar
     * de escribir en lugar de
     * imprimir en todas las líneas todos los números desde el 1 hasta el
     * introducido por teclado, en la
     * primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así
     * hasta escribir el número
     * de líneas indicadas por el usuario.
     * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) { // Controla las líneas
            for (int j = 1; j <= i; j++) { // Controla los números por línea
                System.out.print(j); // Imprime los números desde 1 hasta i
            }
            System.out.println();
        }
    }

    /*
     * Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de
     * 7 en 7, es decir,
     * mostrará 100, 93, 86…0.
     */

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        for (int i = 100; i >= 0; i -= 7) { // i empieza en 100 y va restando 7 hasta llegar a 0
            System.out.println(i); // Imprime el valor actual de i
        }
    }

    /*
     * Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres
     * leer. Nosotros
     * deberemos leer la cantidad de números indicada y calcula el promedio de los
     * valores indicados
     */

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        System.out.print("¿Cuántos números quieres leer? ");
        int cantidad = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < cantidad; i++) { // Bucle para leer la cantidad de números indicada
            System.out.print("Introduce el número " + (i + 1) + ": "); // Solicita el número al usuario
            int numero = sc.nextInt();
            suma += numero; // Suma el número introducido a la suma total
        }

        double promedio = (double) suma / cantidad; // Calcula el promedio
        System.out.println("El promedio de los números introducidos es: " + promedio);
    }

    /*
     * Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si
     * el número es o no
     * primo. (Los números primos son aquellos que sólo son divisibles por ellos
     * mismos y por la unidad).
     */

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos
        } else {
            for (int i = 1; numero >= i; i++) { // Verifica divisibilidad hasta la raíz cuadrada del número
                if (numero % i == 0) {
                    esPrimo = false; // Si es divisible por algún número, no es primo
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    /*
     * Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0,
     * y nos muestre el
     * máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como
     * número introducido, solo
     * como valor de salida.
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero == 0) {
                if (numero > maximo) {
                    maximo = numero; // Actualiza el máximo si el número es mayor
                }
                if (numero < minimo) {
                    minimo = numero; // Actualiza el mínimo si el número es menor
                }
                suma += numero; // Suma el número introducido
                contador++; // Incrementa el contador de números introducidos
            }
        } while (numero == 0);

        if (contador > 0) {
            double media = (double) suma / contador; // Calcula la media
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se han introducido números.");
        }
    }

    /*
     * Ejercicio 8: Escribe un programa en Java que implemente una calculadora
     * simple. La calculadora
     * debe permitir a los usuarios realizar operaciones matemáticas básicas, como
     * suma, resta,
     * multiplicación y división. El programa deberá mostrar un menú con las
     * siguientes opciones:
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Es primo (indica si el número introducido es primo o no lo es)
     * 6. Salir
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        int opcion;
        do {
            System.out.println("Menú de la calculadora:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Es primo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción (1-6): ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 4) { // Para operaciones que requieren dos números
                System.out.println("Introduce el primer número: ");
                int num1 = sc.nextInt();
                System.out.println("Introduce el segundo número: ");
                int num2 = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                        }
                        break;
                }
            } else if (opcion == 5) { // Solo pide un número para comprobar si es primo
                System.out.println("Introduce un número: ");
                int num = sc.nextInt();
                boolean esPrimo = true;
                if (num <= 1) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo) {
                    System.out.println(num + " es un número primo.");
                } else {
                    System.out.println(num + " no es un número primo.");
                }
            } else if (opcion != 6) {
                System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 6);
    }

    /*
     * Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
     * 1º Pediremos el DNI por teclado al usuario.
     * 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
     * quedándonos con el
     * resto de la división, que debe estar entre 0 y 22.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        System.out.print("Introduce el número del DNI (sin letra): ");
        int dni = sc.nextInt();
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; // Letras correspondientes a los restos de 0 a 22
        int resto = dni % 23; // Calcula el resto de la división entre 23
        char letra = letras.charAt(resto); // Obtiene la letra correspondiente al resto
        System.out.println("La letra del DNI es: " + letra);
    }

    /*
     * Ejercicio 10: Solicita al usuario una cadena y comprueba el número de vocales
     * que tiene. Deberás usar el método charAT(i) de la clase String para extraer
     * un carácter de la cadena, donde i es la posición del carácter de la cadena
     * que queremos obtener. Por ejemplo, si quisiéramos obtener el carácter número
     * de 5 de una cadena lo haríamos así: cadena.charAT(i)
     */

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine().toLowerCase(); // Convierte la cadena a minúsculas para facilitar la comparación
        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) { // Recorre cada carácter de la cadena
            char caracter = cadena.charAt(i); // Obtiene el carácter en la posición i
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') { // Comprueba si es una vocal
                contadorVocales++; // Incrementa el contador si el carácter es una vocal
            }
        }
        System.out.println("Número de vocales en la cadena: " + contadorVocales);
    }

    /*
     * Ejercicio 11: Realiza el control de acceso a una caja fuerte. La combinación
     * será un número de cuatro cifras. El usuario tendrá 4 oportunidades para
     * averiguar el número. El programa nos pedirá la combinación para abrirla. Si
     * no acertamos, se nos mostrará el mensaje “Clave incorrecta le quedan X
     * intentos”, si agota los 4 intentos mostrará el mensaje “Lo siento has agotado
     * las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja fuerte”.
     */

    public static void ejercicio11() {
        System.out.println("Ejercicio 11");
        final int combinacion = 1234; // Combinación fija para la caja fuerte
        int intentos = 4; // Número de intentos permitidos
        boolean cajaAbierta = false; // Estado de la caja fuerte
        while (intentos > 0 && !cajaAbierta) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int intento = sc.nextInt();
            if (intento == combinacion) {
                cajaAbierta = true; // La caja se abre si la combinación es correcta
                System.out.println("Has abierto la caja fuerte.");
            } else {
                intentos--; // Decrementa el número de intentos restantes
                if (intentos > 0) {
                    System.out.println("Clave incorrecta, te quedan " + intentos + " intentos. "); // Mensaje de error
                                                                                                   // con intentos
                                                                                                   // restantes
                } else {
                    System.out.println("Lo siento, has agotado las 4 oportunidades."); // Mensaje de agotamiento de
                                                                                       // intentos
                }
            }
        }
    }

    /*
     * Ejercicio 12: Realiza un programa que compruebe si dos números son amigos.
     * Para ello hay que comprobar que la suma de todos los divisores del primer
     * número (sin contar con él) es el segundo número, y que la suma de todos los
     * divisores propios del segundo número (sin contar con él) es el primer número.
     * Por ejemplo: - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22,
     * 44, 55 y 110. Su suma es 284. - Los divisores propios de 284 son 1, 2, 4, 71
     * y 142. Su suma es 220. - Por tanto, 220 y 284 son amigos.
     */

    public static void ejercicio12() {
        System.out.println("Ejercicio 12");

        // Solicita al usuario el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt(); // Lee el primer número desde la entrada del usuario

        // Solicita al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt(); // Lee el segundo número desde la entrada del usuario

        // Variables para almacenar la suma de los divisores propios de cada número
        int sumaDivisoresNum1 = 0;
        int sumaDivisoresNum2 = 0;

        // Mostrar los divisores propios del primer número
        System.out.print("Divisores propios de " + num1 + ": ");
        for (int i = 1; i <= num1 / 2; i++) {
            // Si 'i' es divisor de num1 (es decir, la división es exacta)
            if (num1 % i == 0) {
                sumaDivisoresNum1 += i; // Se suma a la suma total de divisores
                System.out.print(i + " "); // Se muestra el divisor encontrado
            }
        }
        // Muestra la suma total de los divisores propios del primer número
        System.out.println("Suma de divisores propios de " + num1 + ": " + sumaDivisoresNum1);

        // Mostrar los divisores propios del segundo número
        System.out.print("Divisores propios de " + num2 + ": ");
        for (int i = 1; i <= num2 / 2; i++) {
            // Si 'i' es divisor de num2
            if (num2 % i == 0) {
                sumaDivisoresNum2 += i; // Se suma a la suma total de divisores
                System.out.print(i + " "); // Se muestra el divisor encontrado
            }
        }
        // Muestra la suma total de los divisores propios del segundo número
        System.out.println("Suma de divisores propios de " + num2 + ": " + sumaDivisoresNum2);

        // Comprueba si los números son amigos
        // Dos números son amigos si la suma de los divisores propios del primero es
        // igual al segundo y viceversa
        if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) { // Condición de amistad
            System.out.println(num1 + " y " + num2 + " son números amigos."); // Mensaje si son amigos
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos."); // Mensaje si no son amigos
        }
    }

    /*
     * Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado
     * de elementos de la serie de Fibonacci, teniendo en cuenta que cada uno es la
     * suma de los dos elementos anteriores, con la excepción de los dos primeros,
     * que son 0 y 1. Así, la serie estaría formada por los números: 0, 1, 1, 2, 3,
     * 5, 8, 13, 21…
     */

    public static void ejercicio13() {
        System.out.println("Ejercicio 13");
        System.out.print("Introduce el número de elementos de la serie de Fibonacci que deseas calcular: ");
        int n = sc.nextInt();
        int a = 0, b = 1; // Los dos primeros elementos de la serie
        System.out.print("Serie: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // Imprime el elemento actual
            int siguiente = a + b; // Calcula el siguiente elemento como la suma de los dos anteriores
            a = b; // Actualiza 'a' al valor de 'b'
            b = siguiente; // Actualiza 'b' al siguiente elemento calculado
        }
    }

    public static void main(String[] args) {
        // ejercicio1();
        System.out.println("============================");
        // ejercicio2();
        System.out.println("============================");
        // ejercicio3();
        System.out.println("============================");
        // ejercicio4();
        System.out.println("============================");
        // ejercicio5();
        System.out.println("============================");
        ejercicio6();
        System.out.println("============================");
        // ejercicio7();
        System.out.println("============================");
        // ejercicio8();
        System.out.println("============================");
        // ejercicio9();
        System.out.println("============================");
        // ejercicio10();
        System.out.println("============================");
        // ejercicio11();
        System.out.println("============================");
        // ejercicio12();
        System.out.println("============================");
        // ejercicio13();

    }
}
