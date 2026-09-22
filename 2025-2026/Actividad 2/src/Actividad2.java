import java.util.Scanner;

public class Actividad2 {
    static Scanner sc = new Scanner(System.in);

    public static void ejercicio1() {
        System.out.println("Ejercicio 1"); // Nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
    }

    public static void ejercicio2() {
        System.out.println("Ejercicio 2");
        // Números

        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        sc.nextLine(); // limpiar buffer
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3"); // Raíz cuadrada

        System.out.print("Introduce un número: ");
        double num = sc.nextInt();
        double raiz = Math.sqrt(num);
        System.out.printf("Raíz cuadrada: %.2f%n", raiz);
        sc.nextLine();
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");

        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exp: ");
        int exp = sc.nextInt();

        int Potencias = (int) Math.pow(base, exp);
        System.out.println("Potencias: " + Potencias);
        sc.nextLine(); // limpiar buffer
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
        double radio = 5.0; // número fijo

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Radio: " + radio);
        System.out.printf("Área del círculo: %.2f%n", area); // solo 2 decimales
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
        double radio = 5.0; // número fijo

        double longitud = 2 * Math.PI * radio;

        System.out.println("Radio: " + radio);
        System.out.printf("Longitud de la circunferencia: %.2f%n", longitud); // 2 decimales
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        String passwordCorrecta = "1234"; // contraseña fija

        System.out.print("Introduce la contraseña: ");
        String passwordIntroducida = sc.nextLine(); // leer texto

        if (passwordIntroducida.equals(passwordCorrecta)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        // Pedir una frase
        System.out.print("Introduce una frase: ");
        String frase = scan.nextLine();

        // Calcular longitud
        int longitud = frase.length();

        // Obtener primera y última letra
        String primeraLetra = frase.substring(0, 1);
        String ultimaLetra = frase.substring(longitud - 1);

        // Mostrar resultados
        System.out.println("La frase introducida es: " + frase);
        System.out.println("Longitud: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);
    }

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
        
        // Pedir al usuario una frase
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        // Palabra a buscar
    
        int pos = frase.indexOf("palabra");
        
        // Comprobar si se encuentra
        if (posicion != -1) {
            int longitud = frase.length();
            String mostrar = frase.substring(pos, pos + palabra.lenght()); 
            
            // Mostrar resultados
            System.out.println("Se ha encontrado la palabra: " + palabra); 
            System.out.println("La palabra aparece en la posición: " + pos);
        } else {
            System.out.println("La frase no contiene la palabra 'amigo'.");
        }
    }
    

    public static void main(String[] args) {
        // ejercicio1();
        System.out.println("============");
        // ejercicio2();
        System.out.println("============");
        //ejercicio3();
        System.out.println("============");
        // ejercicio4();
        System.out.println("============");
        // ejercicio5();
        System.out.println("============");
        // ejercicio6();
        System.out.println("============");
        // ejercicio7();
        System.out.println("============");
        // ejercicio8();
        System.out.println("============");
        ejercicio9();
        sc.close();
    }
}