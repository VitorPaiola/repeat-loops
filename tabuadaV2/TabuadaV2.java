package tabuadaV2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que imprima na tela a
 * tabuada de todos os números de 1 a 10.
*/

public class TabuadaV2 {
    public static void main(String[] args) {
        calcularTabuadaV4();
    }

    // ? Utilizando o laço de repetição for
    public static void calcularTabuadaV1() {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %2d = %3d%n", numero, i, (numero * i));
            }

            System.out.println();
        }
    }

    // ? Utilizando o laço de repetição while
    public static void calcularTabuadaV2() {
        int numero = 1;
        while (numero <= 10) {
            System.out.println("Tabuada do " + numero + ":");

            int i = 1;
            while (i <= 10) {
                System.out.printf("%d x %2d = %3d%n", numero, i, (numero * i));
                i++;
            }

            System.out.println();
            numero++;
        }
    }

    // ? Utilizando o IntStream
    public static void calcularTabuadaV3() {
        IntStream.rangeClosed(1, 10)
                .forEach(numero -> {
                    System.out.println("Tabuada do " + numero + ":");
                    IntStream.rangeClosed(1, 10)
                            .forEach(i -> System.out.printf("%d x %2d = %3d%n", numero, i, (numero *
                                    i)));
                    System.out.println();
                });
    }

    // ? Usando Map
    public static void calcularTabuadaV4() {
        // Cria um Map para armazenar o número e sua tabuada
        Map<Integer, List<String>> tabuadaMap = new HashMap<>();

        // Preenche o Map com as tabuadas de 1 a 10
        for (int numero = 1; numero <= 10; numero++) {
            List<String> resultados = calcularResultadosTabuada(numero);
            tabuadaMap.put(numero, resultados);
        }

        // Imprime as tabuadas armazenadas no Map
        tabuadaMap.forEach((numero, resultados) -> {
            System.out.println("Tabuada do " + numero + ":");
            resultados.forEach(System.out::println);
            System.out.println();
        });
    }

    // Método que gera os resultados de uma tabuada pera um número específico
    public static List<String> calcularResultadosTabuada(int numero) {
        // Cria uma lista com os resultados das multiplicações usando IntStream
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> String.format("%d x %2d = %3d", numero, i, (numero * i)))
                .collect(Collectors.toList());
    }
}
