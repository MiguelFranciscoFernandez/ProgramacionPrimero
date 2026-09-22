import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        double totalIngresado = 0;
        double totalRetirado = 0;
        int numIngresos = 0;
        int numRetiros = 0;

        int opcion;

        do {
            System.out.println("---------------------------------");
            System.out.println("|      Cajero Automático        |"); 
            System.out.println("|-----------------------------  |");
            System.out.println("| 1. Consultar saldo            |");
            System.out.println("| 2. Depositar dinero           |");
            System.out.println("| 3. Retirar dinero             |");
            System.out.println("| 4. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(">> Saldo actual: " + saldo + " €");
                    break;

                case 2:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        totalIngresado += deposito;
                        numIngresos++;
                        System.out.println(">> Depósito exitoso!");
                    } else {
                        System.out.println(">> ERROR: La cantidad debe ser mayor que 0.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println(">> ERROR: La cantidad debe ser mayor que 0.");
                    } else if (retiro > saldo) {
                        System.out.println(">> ERROR: Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        totalRetirado += retiro;
                        numRetiros++;
                        System.out.println(">> Retiro exitoso!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== Estadisticas uso ===");
                    System.out.println("Total ingresado: " + totalIngresado + " €");
                    System.out.println("Número de ingresos: " + numIngresos);
                    System.out.println("Total retirado: " + totalRetirado + " €");
                    System.out.println("Número de retiradas: " + numRetiros);
                    System.out.println("Saldo final: " + saldo + " €");
                    System.out.println("---------------------------------");
                    System.out.println("Gracias por usar el cajero!");
                    break;

                default:
                    System.out.println(">> Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
