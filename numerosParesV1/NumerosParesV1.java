package numerosParesV1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que exiba todos
 * os números pares de 1 a 100.
*/

public class NumerosParesV1 {
    public static void main(String[] args) {
        String resultado = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0)
                .mapToObj(String::valueOf) // Converte os números para String
                .collect(Collectors.joining(", ", "[", "]")); // Junta com vírgula e adiciona colchetes

        System.out.println("Numeros pares: " + resultado);
    }
}
