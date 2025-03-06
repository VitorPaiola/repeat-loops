package somaNumerosPares;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

/*
 * Faça um programa que calcule e exiba
 * a soma dos números pares de 1 a 100
 * utlizando um laço de repetição.
*/

public class SomaNumerosPares {
    public static void main(String[] args) {
        somaNumerosParesV1();

        somaNumerosParesV2();

        somaNumerosParesV3();

        somaNumerosParesV4();
    }

    // ? Utilizando o laço de repetição for
    public static void somaNumerosParesV1() {
        int soma = 0;
        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos numeros pares de 1 a 100 e: " + soma);
    }

    // ? Utilizando o laço de repetição while
    public static void somaNumerosParesV2() {
        int soma = 0;
        int i = 2;

        while (i <= 100) {
            soma += i;
            i += 2;
        }

        System.out.println("A soma dos numeros pares de 1 a 100 e: " + soma);
    }

    // ? Utilizando o IntStream
    public static void somaNumerosParesV3() {
        int soma = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println("A soma dos numeros pares de 1 a 100 e: " + soma);
    }

    // ? Utilizando o Map
    public static void somaNumerosParesV4() {
        Map<Integer, Integer> somaMap = new LinkedHashMap<>(); // Garante a ordem de inserção

        int soma = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .reduce(0, (acumulador, numero) -> {
                    somaMap.put(numero, (acumulador + numero));
                    return acumulador + numero;
                });

        // somaMap.forEach((numero, somaAtual) ->
        // System.out.printf("Somando %d -> Soma Parcial: %d%n", numero, somaAtual)
        // );

        System.out.println("\nA soma dos numeros pares de 1 a 100 e: " + soma);
    }
}
