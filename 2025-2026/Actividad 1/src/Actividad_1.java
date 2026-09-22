public class Actividad_1 {
    public static void ejercicio1() { // Ejercicio de mi nombre
        String minombre = "Miguel Francisco Fernandez";
        System.out.println("Ejercicio 1");
        System.out.println("Me llamo: " + minombre);
    }

    public static void ejercicio2() {
        String edad = "20"; // ejercicio de mi edad y correo
        String correo = "mfranciscof01@iesalbarregas.es";
        System.out.println("Ejercicio 2");
        System.out.println("Mi correo es:" + correo);
        System.out.println("Mi edad es: " + edad);
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3"); // ejercicio de tabla de traduccion
        System.out.println("Inglés\tEspañol");
        System.out.println("computer\tordenador");
        System.out.println("student\talumno");
        System.out.println("class\tclase");
        System.out.println("school\tcolegio");
        System.out.println("book\tlibro");
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4"); // ejercicio de horario
        System.out.println("Hora\t\tLunes\t\tMartes\t\t\tMiércoles\t\t\tJueves\t\t\tViernes"); // Encabezado
        System.out.println("16:00\t\tIngles\t\tProgramacion\t\tLenguaje de Marcas\t\tBase de Datos\t\tProgramacion"); // Primera
        System.out.println("16:55\t\tEmpresa\t\tProgramacion\t\tLenguaje de Marcas\t\tBase de Datos\t\tProgramacion"); // Segunda
        System.out.println("17:50\t\tBase de datos\tSistemas\t\tProgramacion\t\t\tIngles\t\t\tEmpresa"); // Tercera hora
        System.out.println("18:45\t\tBase de datos\tSistemas\t\tProgramacion\t\t\tEntorno Desarollo\tSistemas"); // Cuarta hora                                                                                                         
        System.out.println("18:45\t\tSistemas\tLenguaje de Marca\tEntorno de Desarrollo\t\tEntorno Desarollo\tBase de Datos"); // Quinta hora
        System.out.println("18:45\t\tSistemas\tLenguaje de Marca\tEmpresa\t\t\t\tProgramacion\t\tBase de Datos"); // Sexta hora
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5"); // ejercio de piramide
        int altura = 5; // 9 cacteriscos en la base da a 5 de altura
        int anchoBase = 9;

        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco a la izquierda
            for (int j = 1; j <= (anchoBase / 2 + 1 - i); j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6"); // ejercio de piramide hueca
        int altura = 5; // 9 cacteriscos en la base da a 5 de altura
        int anchoBase = 9;

        for (int i = 1; i <= altura; i++) {
            // Espacios a la izquierda
            for (int j = 1; j <= (anchoBase / 2 + 1 - i); j++) {
                System.out.print(" ");
            }

            // Asteriscos huecos
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Salto de línea
            System.out.println();
        }
    }

    public static void ejercicio7() { 
        System.out.println("Ejercicio 7"); // ejercio de piramide invertida hueca
        int altura = 5; // con 5 filas la base es de 9
        int anchoBase = 9;

        for (int i = altura; i >= 1; i--) {
            // Espacios a la izquierda (aumentan al bajar)
            for (int j = 1; j <= (anchoBase / 2 + 1 - i); j++) {
                System.out.print(" ");
            }

            // Asteriscos y huecos
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Salto de línea
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ejercicio1();
        System.out.println("============");
        ejercicio2();
        System.out.println("============");
        ejercicio3();
        System.out.println("============");
        ejercicio4();
        System.out.println("============");
        ejercicio5();
        System.out.println("============");
        ejercicio6();
        System.out.println("============");
        ejercicio7();
    }
}