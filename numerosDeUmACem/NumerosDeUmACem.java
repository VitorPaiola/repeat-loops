package numerosDeUmACem;

import java.util.stream.IntStream;

/*
 * Faça um programa que exiba todos os números de 1 a 100
*/

public class NumerosDeUmACem {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}
