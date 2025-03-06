package calculoPotencia;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Escreva um programa que calcule e exiba o valor da potência
 * de um número informado pelo usuário elevado a um expoente
 * também informado pelo usuário, utilizando laços de repetição.
*/

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base = solicitarValor("Digite o numero base: ", entrada);
        double expoente = solicitarValor("Digite o expoente: ", entrada);

        calcularPotenciaV1(base, expoente);

        calcularPotenciaV2(base, expoente);

        calcularPotenciaV3(base, expoente);

        calcularPotenciaV4(base, expoente);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um valor valido.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    // ? for loop
    public static void calcularPotenciaV1(double base, double expoente) {
        double resultado = calcularPotencia(base, expoente);
        imprimirResultado(base, expoente, resultado);
    }

    // ? while loop
    public static void calcularPotenciaV2(double base, double expoente) {
        double resultado = 1;
        int i = 0;
        boolean negativo = expoente < 0;
        int exp = Math.abs((int) expoente);

        while (i < exp) {
            resultado *= base;
            i++;
        }

        if (negativo) {
            resultado = 1 / resultado;
        }

        imprimirResultado(base, expoente, resultado);
    }

    // ? IntStream
    public static void calcularPotenciaV3(double base, double expoente) {
        int exp = Math.abs((int) expoente);
        boolean negativo = expoente < 0;

        double resultado = IntStream.rangeClosed(1, exp)
                .reduce(1, (acumulador, valor) -> (int) (acumulador * base));

        if (negativo) {
            resultado = 1 / resultado;
        }

        imprimirResultado(base, expoente, resultado);
    }

    // ? Map + IntStream
    public static void calcularPotenciaV4(double base, double expoente) {
        Map<Integer, Double> potenciaMap = new LinkedHashMap<>();
        potenciaMap.put(0, 1.0);

        boolean negativo = expoente < 0;
        int exp = Math.abs((int) expoente);

        double resultado = IntStream.rangeClosed(1, exp)
                .reduce(1, (acumulador, valor) -> {
                    double novoValor = acumulador * base;
                    potenciaMap.put(valor, novoValor);
                    return (int) novoValor;
                });

        if (negativo) {
            resultado = 1 / resultado;
        }

        imprimirResultado(base, expoente, resultado);
    }

    public static double calcularPotencia(double base, double expoente) {
        boolean negativo = expoente < 0;
        int exp = Math.abs((int) expoente);
        double resultado = 1.0;

        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }

        if (negativo) {
            resultado = 1 / resultado;
        }

        return resultado;
    }

    public static void imprimirResultado(double base, double expoente, double resultado) {
        System.out.printf(Locale.US, "%.2f ^ %.2f = %.2f%n", base, expoente, resultado);
    }
}
