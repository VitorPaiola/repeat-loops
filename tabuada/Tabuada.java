package tabuada;

import java.util.Scanner;
// import java.util.stream.IntStream;

/*
 * Crie um programa que solicite ao usuário
 * um número e exiba a tabuada desse número
 * utilizando um laço de repetição.
*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero: ", entrada);

        calcularTabuada(numero);

        entrada.close();
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

    //? Utilizando o laço de repetição for
    public static void calcularTabuada(int numero) {
        System.out.println("\nTabuada do " + numero + ":\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d%n", numero, i, (numero * i));
        }
    }

    //? Utilizando o laço de repetição while
    // public static void calcularTabuada(int numero) {
    //     System.out.println("\nTabuado do " + numero + ":\n");
    //     int i = 1;
    //     while (i <= 10) {
    //         System.out.printf("%d x %2d = %3d%n", numero, i, (numero * i));
    //         i++;
    //     }
    // }

    //? Utilizando o IntStream
    // public static void calcularTabuada(int numero) {
    //     System.out.println("\nTabuada do " + numero + ":\n");

    //     IntStream.rangeClosed(1, 10)
    //             .forEach(i -> System.out.printf("%d x %2d = %3d%n", numero, i, (numero * i)));
    // }
}
