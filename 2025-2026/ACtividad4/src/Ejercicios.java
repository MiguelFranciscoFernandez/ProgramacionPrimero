import java.util.Scanner;

public class Ejercicios {

    // Creamos un Scanner estático para poder usarlo en todos los métodos
    static Scanner sc = new Scanner(System.in);

    /*
     * Ejercicio 1:
     * Escribe un programa que pida un número y diga si es o no múltiplo de 3.
     */
    public static void ejercicio1() {
        System.out.println("Ejercicio1");

        System.out.print("Introduce un número: ");
        int num = sc.nextInt(); // Leemos el número introducido por el usuario

        // Comprobamos si el número es divisible entre 3
        if (num % 3 == 0)
            System.out.println("El número " + num + " es múltiplo de 3.");
        else
            System.out.println("El número " + num + " NO es múltiplo de 3.");
    }

    /*
     * Ejercicio 2:
     * Escribe un programa que lee por teclado tres números enteros y calcula y
     * muestra el mayor de los tres.
     */
    public static void ejercicio2() {
        System.out.println("Ejercicio2");

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();

        int mayor;

        // Determinar el mayor usando
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);
    }

    /*
     * Ejercicio 3:
     * Escribe un programa que lea por teclado tres números enteros H, M, S
     * correspondientes a hora, minutos y segundos respectivamente, y comprueba si
     * la hora que indican es una hora válida.
     */
    public static void ejercicio3() {
        System.out.println("Ejercicio3");

        System.out.print("Introduce las horas (0-23): ");
        int h = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int m = sc.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        int s = sc.nextInt();

        // Validación de hora, minutos y segundos
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60)
            System.out.println("La hora es válida.");
        else
            System.out.println("La hora NO es válida.");
    }

    /*
     * Ejercicio 4:
     * Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en
     * pantalla el nombre en letras de ese número. Se debe controlar que se
     * introduzca un número válido.
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio4");

        String[] numeros = { "cero", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez" };

        System.out.print("Introduce un número entre 0 y 10: ");
        int n = sc.nextInt();

        if (n >= 0 && n <= 10)
            System.out.println("El número " + n + " se escribe " + numeros[n] + "'.");
        else
            System.out.println("Número inválido.");
    }

    /*
     * Ejercicio 5:
     * Escribe un programa que realice lo contrario que el anterior, es decir pide
     * un número en letras y enseña un número.
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio5");

        String[] numeros = { "cero", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez" };

        System.out.print("Introduce un número en letras (cero a diez): ");
        sc.nextLine(); // Limpiamos el buffer
        String texto = sc.nextLine().toLowerCase(); // Convertimos a minúsculas para comparar

        int valor = -1;
        // Buscamos la palabra introducida en el array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].equals(texto)) { // Comparamos el elemento con el texto
                valor = i;  // Guardamos el índice donde encontramos la palabra
                break; // Salimos del bucle porque ya encontramos la palabra
            }
        }

        if (valor != -1)
            System.out.println("El número '" + texto + "' es " + valor + ".");
        else
            System.out.println("Texto inválido.");
    }

    /*
     * Ejercicio 6:
     * Escribe un programa que lea una variable entera mes y compruebe si el valor
     * corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene
     * 28 días. Se mostrará además el nombre del mes
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio6");

        System.out.print("Introduce un número de mes (1-12): ");
        int mes = sc.nextInt();
        String nombreMes;
        int dias;

        // Determinamos el nombre y número de días según el mes
        switch (mes) {
            case 1 -> {
                nombreMes = "Enero";
                dias = 31;
            }
            case 2 -> {
                nombreMes = "Febrero";
                dias = 28;
            }
            case 3 -> {
                nombreMes = "Marzo";
                dias = 31;
            }
            case 4 -> {
                nombreMes = "Abril";
                dias = 30;
            }
            case 5 -> {
                nombreMes = "Mayo";
                dias = 31;
            }
            case 6 -> {
                nombreMes = "Junio";
                dias = 30;
            }
            case 7 -> {
                nombreMes = "Julio";
                dias = 31;
            }
            case 8 -> {
                nombreMes = "Agosto";
                dias = 31;
            }
            case 9 -> {
                nombreMes = "Septiembre";
                dias = 30;
            }
            case 10 -> {
                nombreMes = "Octubre";
                dias = 31;
            }
            case 11 -> {
                nombreMes = "Noviembre";
                dias = 30;
            }
            case 12 -> {
                nombreMes = "Diciembre";
                dias = 31;
            }
            default -> {
                nombreMes = "Inválido";
                dias = 0;
            }
        }

        if (mes >= 1 && mes <= 12)
            System.out.println(nombreMes + " tiene " + dias + " días.");
        else
            System.out.println("Mes inválido.");
    }
    
    /*
     * Ejercicio 7:
     * Escribe un programa que pida la nota de las tres evaluaciones, y si están
     * aprobadas realizar la media para calcular la nota final. Evaluación aprobada
     * >= 5. Si no, escribe que evaluación debe recuperar.
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio7");

        System.out.print("Nota de la primera evaluación: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota de la segunda evaluación: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota de la tercera evaluación: ");
        double n3 = sc.nextDouble();

        // Comprobamos si todas las evaluaciones están aprobadas
        if (n1 >= 5 && n2 >= 5 && n3 >= 5) {
            double media = (n1 + n2 + n3) / 3;
            System.out.printf("Todas aprobadas. Nota final: %.2f\n", media);
        } else {
            // Indicamos cuáles deben recuperarse
            if (n1 < 5)
                System.out.println("Debes recuperar la evaluación 1 (" + n1 + ")");
            if (n2 < 5)
                System.out.println("Debes recuperar la evaluación 2 (" + n2 + ")");
            if (n3 < 5)
                System.out.println("Debes recuperar la evaluación 3 (" + n3 + ")");
        }
    }

    /*
     * Ejercicio 8:
     * Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el
     * número de horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y
     * a partir de ahí, las restantes horas que superen las 150 se pagan a 20€. Debe
     * aparecer por pantalla el total del sueldo.
     */
    public static void ejercicio8() {
        System.out.println("Ejercicio8");

        System.out.print("Horas trabajadas este mes: ");
        int horas = sc.nextInt();
        int sueldo;

        // Primeras 150 horas a 10€, el resto a 20€
        if (horas <= 150)
            sueldo = horas * 10;
        else
            sueldo = (150 * 10) + ((horas - 150) * 20);

        System.out.println("El sueldo total es: " + sueldo);
    }

    /*
     * Ejercicio 9:
     * Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar
     * años negativos. Un año es bisiesto si cumple una de las siguientes reglas:
     * 1. Divisible entre 4, divisible entre 100 y divisible entre 400.
     * 2. Divisible entre 4, NO divisible entre 100.
     */
    public static void ejercicio9() {
        System.out.println("Ejercicio9");

        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        if (año < 0) {
            System.out.println("El año no puede ser negativo.");
        } else if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " NO es bisiesto.");
        }
    }

    public static void main(String[] args) {
        // Llamamos a cada ejercicio
        ejercicio1();
        System.out.println("==============================");
        ejercicio2();
        System.out.println("==============================");
        ejercicio3();
        System.out.println("==============================");
        ejercicio4();
        System.out.println("==============================");
        ejercicio5();
        System.out.println("==============================");
        ejercicio6();
        System.out.println("==============================");
        ejercicio7();
        System.out.println("==============================");
        ejercicio8();
        System.out.println("==============================");
        ejercicio9();

        sc.close(); // Cerramos el Scanner al final
    }
}