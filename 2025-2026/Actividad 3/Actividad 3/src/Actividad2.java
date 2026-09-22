import java.util.Scanner;
import java.lang.Math;

public class Actividad2 {

    static Scanner sc = new Scanner(System.in);
    /*
       Ejercicio 1
       Pide por teclado un String que contenga preguntando por tu nombre, 
       después muestra un mensaje de bienvenida por consola. 
       Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
    */
    public static void ejercicio1(){
        System.out.println("Introduzca su nombre");
        String nombre = sc.next();

        System.out.println("Su nombre es: " + nombre);
    }

    /*
       Ejercicio 2
       Pedir dos números y realizar operaciones básicas de suma, resta y multiplicación, 
       enseñando el resultado.
    */

    public static void ejercicio2(){
        System.out.println("Introduzca el número 1");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el numero 2");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
    }

    /*
       Ejercicio 3
       Pedir un número calcular su raíz cuadra.
    */

    public static void ejercicio3(){
        System.out.println("Introduzca el número");
        double numero = sc.nextDouble();

        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada es: " + raiz);
    }

    /*
       Ejercicio 4
       Pedir dos números (base y exponente) y calcular la potencia.
    */

    public static void ejercicio4(){
        System.out.println("Introduzca la base");
        double base = sc.nextDouble();
        System.out.println("Introduzca el exponente");
        double exponente = sc.nextDouble();

        double potencia = Math.pow(base, exponente);
        System.out.println("La potencia es: " + potencia);


    }

    /*
       Ejercicio 5
       Pedir el radio de un circulo y calcular su área. (A=pi*r^2) 
       (Podemos usar Math.PI para el valor de pi o poner directamente el valor)
    */

    public static void ejercicio5(){
        System.out.println("Introduzca el radio de la circunferencia a calcular");
        Double radio = sc.nextDouble();
        Double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area es: " + area); 
    }

    /*
       Ejercicio 6     
       Pedir el radio de una circunferencia y calcular su longitud.(L=2+pi*r)
    */

    public static void ejercicio6(){
        System.out.println("Introduzca el radio de la circunferencia a calcular");
        Double radio = sc.nextDouble();
        Double longitud = 2 + (Math.PI*radio);
        System.out.println("El area es: " + longitud);   
    }

    /*
       Ejercicio 7     
       Pedir un password y comprobar si es igual que un String definido 
       en el programa. Enseñar el resultado por pantalla.
    */

    public static void ejercicio7(){
        System.out.println("Introduzca una contraseña");
        String pass = sc.next();
        String cadena = "cadenaBuscar";

        if(pass.equals(cadena)){
            System.out.println("Contraseña correcta");
        }
        else{
            System.out.println("Contraseña incorrecta");
        }
    }

    /*
       Ejercicio 8     
       Pedir una frase y enseñar por pantalla, la longitud, la primera y última letra.

       Pista: La función substring nos permite extraer una subcadena de una cadena.
    */

    public static void ejercicio8(){
        System.out.println("Introduzca una frase");
        String oracion = sc.nextLine();

        int longitud = oracion.length();
        char posIni = oracion.charAt(0);
        char posFin = oracion.charAt(longitud-1);
        
        System.out.println("La longitud es: " + longitud);
        System.out.println("La posicion inicial es: " + posIni);
        System.out.println("La posicion final es: " + posFin);


    }

    /*
       Ejercicio 9     
       Pedir por consola o pantalla una frase que contenga la palabra "amigo", 
       como por ejemplo: “Hola amigo ¿cómo estás?”. El programa deberá enseñar 
       el substring "amigo" extraído de la cadena introducida por consola.

       Pista: La función indexOf del objeto cadena nos devuelve la posición 
       en la que se encuentra una cadena dentro de otra.

       Modificación: se solicita la palabra a buscar (substring)
    */

    public static void ejercicio9(){
        System.out.println("Introduzca una oración");
        String oracion = sc.nextLine();

        System.out.println("Introduzca la palabra a buscar en la oración");
        String palabra = sc.nextLine();

        int posicion = oracion.indexOf(palabra);

        if(posicion >=0 ){
            int longitudPalabra = palabra.length();
            String mostrar = oracion.substring(posicion, posicion + longitudPalabra);
            System.out.println(mostrar);
            System.out.println("La palabra " + palabra + " comienza en la posición: " + posicion);
        }
        else{
            System.out.println("La palabra no existe en la oración");
        }
    }
        
    public static void main(String[] args) throws Exception {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
    }
}