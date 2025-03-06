package numerosParesV3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que exiba todos
 * os números pares de 1 a 100 e 
 * calcule a soma entre eles.
*/

//? Se precisar dos números como int para outros cálculos antes da conversão, pode armazená-los em uma List<Integer> ou um int[] antes de transformar em String

public class NumerosParesV3 {
    public static void main(String[] args) {
        // Lista com os números pares
        List<Integer> numerosPares = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .boxed() // Converte para Integer (necessário para List<Integer>)
                .collect(Collectors.toList());

        // Formatar a saída como String
        String resultado = numerosPares.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Numeros pares: " + resultado);

        // Exemplo de uso com int
        int soma = numerosPares.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos pares: " + soma);
    }
}
