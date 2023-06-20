import java.util.Scanner;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_BLUE + "**************************************************************");
        System.out.println("\t CALCULADORA DE AREA DE UN TRIÁNGULO CON EL MÉTODO HERÓN");
        System.out.println("**************************************************************" + ANSI_RESET);

        do {
            System.out.println("Ingrese el valor del lado 1 del triángulo:");
            double lado1 = scanner.nextDouble();

            System.out.println("Ingrese el valor del lado 2 del triángulo:");
            double lado2 = scanner.nextDouble();

            System.out.println("Ingrese el valor del lado 3 del triángulo:");
            double lado3 = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            double area = triangulo.calcularArea();
            System.out.println("**********************************************");
            System.out.println("El área del triángulo es: " + area);
            System.out.println("**********************************************");

            System.out.println("¿Desea realizar otro cálculo? (S/N)");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);

        System.out.println(ANSI_BLUE +"********************************************************************");
        System.out.println("\tGracias por utilizar la calculadora de área de triángulos.\n \t\t\t\t\t¡HASTA LUEGO!");
        System.out.println("********************************************************************"+ ANSI_RESET);

    }
}
