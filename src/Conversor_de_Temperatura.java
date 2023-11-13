import java.util.Scanner;

public class Conversor_de_Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        System.out.print("Digite a unidade de origem (Celsius (c) ou Fahrenheit (f)): ");
        String unidadeOrigem = input.next();

        double resultado;

        if (unidadeOrigem.equalsIgnoreCase("c")) {
            resultado = celsiusToFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (unidadeOrigem.equalsIgnoreCase("f")) {
            resultado = fahrenheitToCelsius(temperatura);
            System.out.println("A temperatura em Celsius é: " + resultado);
        } else {
            System.out.println("Unidade de origem inválida!");
        }

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
