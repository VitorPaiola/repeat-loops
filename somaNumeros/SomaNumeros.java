package somaNumeros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Escreva um programa que solicite ao usuário um número
 * N e exiba a soma de todos os números de 1 a N.
*/

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero: ", entrada);

        calcularSomaV1(numero);

        calcularSomaV2(numero);

        calcularSomaV3(numero);

        calcularSomaV4(numero);
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    // ? Utilizando o laço de repetição for
    public static void calcularSomaV1(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.printf("A soma de todos os numeros de 1 ate %d e: %d%n", numero, soma);
    }

    // ? Utilizando o laço de repetição while
    public static void calcularSomaV2(int numero) {
        int soma = 0;
        int i = 1;

        while (i <= numero) {
            soma += i;
            i++;
        }

        System.out.printf("A soma de todos os numeros de 1 ate %d e: %d%n", numero, soma);
    }

    // ? Utilizando o IntStream
    public static void calcularSomaV3(int numero) {
        int soma = IntStream.rangeClosed(1, numero).sum();

        System.out.printf("A soma de todos os numeros de 1 ate %d e: %d%n", numero, soma);
    }

    // ? Utilizando Map
    public static void calcularSomaV4(int numero) {
        Map<String, Integer> somaMap = new HashMap<>();
        int soma = IntStream.rangeClosed(1, numero).sum();
        somaMap.put("Soma", soma);

        somaMap.forEach((chave, valor) -> System.out.printf("A %s de todos os numeros de 1 ate %d e: %d%n", chave, numero, valor));
    }
}
