import java.util.Scanner;
public class examen {
    static Scanner sc = new Scanner(System.in);
    // Funcion que invierte una frase y elminar frase
    public static String iventirfrase(String frase) {
        String fraseinvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            if (frase.charAt(i) != ' ') {
                fraseinvertida += frase.charAt(i);
            }
        }
        return fraseinvertida;
    }

    public static void ejercicio2() {
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String fraseinvertida = iventirfrase(frase);
        System.out.println("La frase original es: " + frase + "\nLa frase invertida sin espacios es: " + fraseinvertida);
    }

    public static void numeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;  // Sumar los divisores
            }
        }
        if (numero == suma) {
        System.out.println(numero + " es un número perfecto.");
        } else {
        System.out.println(numero + " no es un número perfecto.");
        }
    }

    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;  // Sumar los divisores
            }
        }
        if (numero == suma) {
            System.out.println(numero + " es un número perfecto.");
            return true;
        } else {
            System.out.println(numero + " no es un número perfecto.");
            return false;
        }
    }
    public static void main(String[] args) {
        ejercicio2();
        System.out.println("Introduce un número para comprobar si es perfecto: ");
        int numero = sc.nextInt();
        numeroPerfecto(numero);  
    }
}
