import java.util.Scanner;

public class Actividad5 {
    static Scanner sc = new Scanner(System.in);

    /*
     * Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1
     * al 100.
     * (Debes hacerlo con las tres estructuras iterativas vistas: while, do while y
     * for).
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");

        System.out.println("Usando while:");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Usando do-while:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
        System.out.println("Usando for:");
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    /*
     * Ejercicio 2: Escribir un programa que solicite un valor positivo y nos
     * muestre desde 1
     * hasta el valor ingresado de uno en uno.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        int valor = sc.nextInt();
        if (valor > 0) {
            for (int i = 1; i <= valor; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("El valor ingresado no es positivo.");

        }
    }
    /*
     * Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por
     * teclado
     * y nos muestre posteriormente la suma de los valores ingresados
     * y su promedio
     */

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        int suma = 0;
        int cantidad = 10;
        for (int i = 1; i <= cantidad; i++) { // Bucle para 10 valores
            System.out.print("Ingrese el valor " + i + ": "); // Solicita al usuario que ingrese un valor
            int valor = sc.nextInt();
            suma += valor; // Acumula la suma de los valores ingresados
        }
        double promedio = (double) suma / cantidad; // Calcula el promedio
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("El promedio de los valores ingresados es: " + promedio);
    }

    /*
     * Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
     * o Guarda en una variable tu nombre.
     * o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca
     * por teclado.
     * o El programa finaliza cuando el usuario adivina tu nombre.
     * Sino el programa debe continuar pidiendo al usuario que lo intente otra vez.
     */

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
        String miNombre = "Miguel Francisco";
        String intento = ""; // Variable para almacenar el intento del usuario
        System.out.println("Adivina mi nombre:");
        do {
            System.out.print("Adivina mi nombre: ");
            intento = sc.nextLine();
            if (intento.equalsIgnoreCase(miNombre)) {
                System.out.println("Incorrecto, intenta de nuevo.");
            }
        } while (intento.equals(miNombre));
        System.out.println("¡Correcto! Has adivinado mi nombre.");
    }
    /*
     * Diseña una aplicación que simule la tirada de dos dados y muestre al usuario
     * el resultado de la tirada.
     * Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que
     * el resultado es el mismo.
     * La aplicación se debe repetir hasta que el usuario indique que no quiere
     * tirar más
     * (preguntando por ‘s’ o ‘n’, o “si” o “no”).
     */

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        String respuesta = ""; // Variable para almacenar la respuesta del usuario
        do {

            int dado1 = (int) (Math.random() * 6) + 1; // Genera un número aleatorio entre 1 y 6
            int dado2 = (int) (Math.random() * 6) + 1; // Genera otro número aleatorio entre 1 y 6

            System.out.println("Resultado de la tirada: Dado 1 = " + dado1 + ", Dado 2 = " + dado2);

            if (dado1 == dado2) { // Verifica si ambos dados tienen el mismo número
                System.out.println("¡Los dados tienen el mismo número!");
            }

            System.out.print("¿Quieres tirar los dados de nuevo? (s/n): ");
            respuesta = sc.nextLine().toLowerCase(); // Lee la respuesta del usuario y la convierte a minúsculas
        } while (respuesta.equals("s") || respuesta.equals("si")); // Repite si la respuesta es 's' o 'si'
        System.out.println("Gracias por jugar. ¡Hasta luego!");
    }

    /*
     * Ejercicio 6: Realizar un juego para adivinar un número.
     * Para ello primero, el programa debe guardar un número en una variable y el
     * usuario debe introducir números hasta acertarlos.
     * Para darle pistas al usuario se le indicará “mayor” o “menor” según sea mayor
     * o menor con respecto al número guardado.
     * El proceso termina cuando el usuario acierta
     */

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        int numeroSecreto = (int) (Math.random() * 10) + 1; // Número aleatorio entre 1 y 100
        int intento = 0; // Variable para almacenar el intento del usuario
        System.out.println("Adivina el número entre 1 y 10:");
        do {
            System.out.println("Introduce tu intento:");
            intento = sc.nextInt();
            if (intento < numeroSecreto) { // Si el intento es menor que el número secreto
                System.out.println("Mayor"); // Indica que el número es mayor
            } else if (intento > numeroSecreto) { // Si el intento es mayor que el número secreto
                System.out.println("Menor");// Indica que el número es menor
            } else { // Si el intento es igual al número secreto
                System.out.println("¡Correcto! Has adivinado el número.");

            }
        } while (intento != numeroSecreto); // Repite hasta que el usuario acierte

    }

    /*
     * Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la
     * hora sin parar. Debe esperar un segundo real para darle más realismo. Pasos:
     * o Pide al usuario que introduzca la hora y los minutos.
     * o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
     * o Cada vez que transcurra un segundo incrementa la hora comprobando si hay
     * cambio de minuto y hora
     * o Muéstralo por pantalla.
     * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa
     * durante 1000 milisegundos = 1 segundo).
     */

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();
        int segundos = 0; // empezamos en 0 segundos

        System.out.println("Reloj iniciado...");

        int contador = 0; // contará los segundos que han pasado

        // Bucle que se ejecuta durante 10 segundos
        while (contador < 10) {
            System.out.printf("Hora: %02d:%02d:%02d%n", hora, minutos, segundos); // Muestra la hora en formato HH:MM:SS

            try {
                Thread.sleep(1000); // Esperar 1 segundo real
            } catch (InterruptedException e) { // Manejo de la excepción
                e.printStackTrace(); // Imprime el error si ocurre una interrupción
            }

            segundos++; // Incrementa los segundos
            contador++; // Incrementa el contador de segundos

            // Incrementar minutos y horas si corresponde
            if (segundos == 59) {
                segundos = 0;
                minutos++;
                if (minutos == 59) {
                    minutos = 0;
                    hora++;
                    if (hora == 23) {
                        hora = 0;
                    }
                }
            }
        }
    }

    /*
     * Ejercicio8: Escriba un programa que calcule el factorial de un número.
     * El factorial de un número es igual al producto de todos los números enteros
     * positivos desde 1 hasta dicho número.
     */

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt();
        long factorial = 1; // Usamos long para manejar números grandes

        for (int i = 1; i <= numero; i++) { // Bucle desde 1 hasta el número
            factorial = i * factorial; // Multiplica el factorial por el número actual
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    /*
     * Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. La
     * altura de la escalera se lee por teclado.
     * Ejemplo: Si introducimos un 5 nos queda:
     * 
     ** 
     *** 
     **** 
     ***** 
     * Posteriormente hacer lo mismo, pero con la pirámide invertida.
     */

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        System.out.print("Introduce la altura de la escalera: ");
        int altura = sc.nextInt();

        // Dibuja la escalera
        for (int i = 1; i <= altura; i++) { // Bucle para cada nivel de la escalera
            for (int j = 1; j <= i; j++) { // Bucle para imprimir asteriscos en cada nivel
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada nivel
        }

        System.out.println(); // Línea en blanco entre la escalera y la pirámide invertida

        // Dibuja la pirámide invertida
        for (int i = altura; i >= 1; i--) { // Bucle para cada nivel de la pirámide invertida
            for (int j = 1; j <= i; j++) { // Bucle para imprimir asteriscos en cada nivel
                System.out.print("*");
            }
            System.out.println(); // Salto de línea después de cada nivel
        }
    }

    public static void main(String[] args) {
        // ejercicio1();
        System.out.println("=========================");
        // ejercicio2();
        System.out.println("=========================");
        // ejercicio3();
        System.out.println("=========================");
        // ejercicio4();
        System.out.println("=========================");
        // ejercicio5();
        System.out.println("=========================");
        // ejercicio6();
        System.out.println("=========================");
        // ejercicio7();
        System.out.println("=========================");
        // ejercicio8();
        System.out.println("=========================");
        ejercicio9();
    }

}