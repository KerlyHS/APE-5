import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NumerosPares {


    public static void generarYMostrarNumerosPares() {
        Scanner scanner = new Scanner(System.in);

        do {
            // Crear un conjunto de números aleatorios
            Set<Integer> numeros = generarConjuntoNumeros(10, 1, 100);

            // Mostrar los números pares del conjunto
            mostrarNumerosPares(numeros);

            System.out.println("¿Desea generar más números aleatorios? (s/n)");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

        System.out.println("Gracias por usar nuestro programa. Vuelva pronto!! :) ");
    }

    // Generar un conjunto de números aleatorios
    public static Set<Integer> generarConjuntoNumeros(int cantidad, int minimo, int maximo) {
        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < cantidad) {
            int numero = random.nextInt(maximo - minimo + 1) + minimo;
            numeros.add(numero);
        }

        return numeros;
    }

    // Mostrar los números pares de un conjunto
    public static void mostrarNumerosPares(Set<Integer> numeros) {
        System.out.println("Números pares:");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}






