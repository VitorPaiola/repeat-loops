package numerosParesV2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que exiba todos
 * os números pares de 1 a 100. E exiba
 * seu primeiro e último número.
*/

public class NumerosParesV2 {
    public static void main(String[] args) {
        String resultado = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Numeros pares: " + resultado);

        // Convertendo de volta para int[]
        int[] numeros = Arrays.stream(resultado.substring(1, resultado.length() - 1)
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Primeiro numero par: " + numeros[0]);
        System.out.println("Ultimo numero par: " + numeros[numeros.length - 1]);
    }
}
