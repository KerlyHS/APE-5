import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿CUANTOS TERMINOS DESEA INGRESAR?: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("CANTIDAD INCORRECTA DE TERMINOS... INGRESE UN NUMERO MAYOR");
            scanner.close();
            return;
        }

        double[] terminos = new double[n];

        System.out.println("INGRESE LA CANTIDAD DE TERMINOS QUE ESCOGIO:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " TERMINO: ");

            terminos[i] = scanner.nextDouble();
        }

        CalcularPromedio calcularPromedio = new CalcularPromedio();
        double promedio = calcularPromedio.calcularPromedio(terminos);
        System.out.println("EL PROMEDIO DE LOS " + n + " TERMINOS QUE INGRESO ES: " + promedio);


        scanner.close();
    }
}
