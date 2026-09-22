import java.util.Scanner;

public class Calculador {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        // PASO 1: solicitar valores y leerlos
        System.out.print("Introduce un valor entero: ");
        int primerValor = lector.nextInt();

        System.out.print("Introduce otro valor entero: ");
        int segundoValor = lector.nextInt();

        // Paso 2 : Menu y leer opcion
        System.out.println("Elige una operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Selecciona la opción: 1-4: ");
        int opcion = lector.nextInt();

        // Paso 3: Realizar la operacion
        switch (opcion) {
            case 1:
                int resultadoSuma = sumar(primerValor, segundoValor);
                System.out.println("El resultado de la suma es: " + resultadoSuma);
                break;
            case 2:
                int resultadoResta = primerValor - segundoValor;
                System.out.println("El resultado de la resta es: " + resultadoResta);
                break;
            case 3:
                int resultadoMultiplicacion = primerValor * segundoValor;
                System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                break;
            case 4:
                System.out.println("Has elegido dividir...");
                if (segundoValor == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                    lector.close();
                    return; // salimos del programa
                }
                double resultado = (double) primerValor / segundoValor;
                System.out.printf("El resultado de la división es: %.2f\n", resultado);
                break;

            default:
                System.out.println("Opción no válida.");
        }
        // Paso 6: Fin del programa
        lector.close();

    }
}
// Hacer que salgan solo dos decimales en la division %.2f\n