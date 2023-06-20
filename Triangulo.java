import java.text.DecimalFormat;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        if (!esTrianguloValido()) {
            System.out.println("Los lados proporcionados no forman un triángulo válido.");
            return -1.0;
        }

        double semiperimetro = calcularSemiperimetro();
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        DecimalFormat df = new DecimalFormat("#.##");
        String areaRedondeadaStr = df.format(area);
        double areaRedondeada = Double.parseDouble(areaRedondeadaStr.replace(",", "."));

        return areaRedondeada;
    }

    private double calcularSemiperimetro() {
        return (lado1 + lado2 + lado3) / 2;
    }

    private boolean esTrianguloValido() {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
