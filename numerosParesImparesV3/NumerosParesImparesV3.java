package numerosParesImparesV3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que exiba os números
 * pares de 1 a 50 e os números ímpares de 51
 * a 100 utilizando o (IntStream).
*/

public class NumerosParesImparesV3 {
    private static final int MIN_ALCANCE = 50;
    private static final int MAX_ALCANCE = 100;

    public static void main(String[] args) {
        System.out.println("Numeros pares: " + numerosPares());
        System.out.println("Numeros impares: " + numerosImpares());
    }

    public static String numerosPares() {
        return IntStream.rangeClosed(1, MIN_ALCANCE)
                .filter(i -> i % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));
    }

    public static String numerosImpares() {
        return IntStream.rangeClosed(51, MAX_ALCANCE)
                .filter(i -> i % 2 != 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
