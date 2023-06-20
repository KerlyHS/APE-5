import java.util.Scanner;
public class CalcularPromedio {
    public double calcularPromedio(double[] terminos) {
        Sumatoria sumatoria = new Sumatoria();

        for (double termino : terminos) {
            sumatoria.agregarTermino(termino);
        }

        double totalSumatoria = sumatoria.obtenerSumatoria();
        double promedio = totalSumatoria / terminos.length;

        return promedio;
    }
}
