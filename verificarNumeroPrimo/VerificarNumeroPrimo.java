package verificarNumeroPrimo;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Escreva um programa que solicite ao usuário um
 * número N e diga se o mesmo é primo ou não.
*/

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero: ", entrada);

        verificarNumeroPrimoV1(numero);

        verificarNumeroPrimoV2(numero);

        verificarNumeroPrimoV3(numero);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                valor = Integer.parseInt(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void verificarNumeroPrimoV1(int numero) {
        if (numero <= 1) {
            imprimirNaoPrimo(numero);
            return;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                imprimirNaoPrimo(numero);
                return;
            }
        }

        imprimirPrimo(numero);
    }

    // ? IntStream
    public static void verificarNumeroPrimoV2(int numero) {
        if (numero <= 1) {
            imprimirNaoPrimo(numero);
            return;
        }

        boolean primo = IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                .noneMatch(i -> numero % i == 0);

        if (primo) {
            imprimirPrimo(numero);
        } else {
            imprimirNaoPrimo(numero);
        }
    }

    // ? Map + IntStream
    public static void verificarNumeroPrimoV3(int numero) {
        if (numero <= 1) {
            imprimirNaoPrimo(numero);
            return;
        }

        Map<Integer, Boolean> divisores = IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                .boxed()
                .collect(Collectors.toMap(i -> i, i -> numero % i == 0));

        boolean primo = divisores.values().stream().noneMatch(divisor -> divisor);

        if (primo) {
            imprimirPrimo(numero);
        } else {
            imprimirNaoPrimo(numero);
        }
    }

    public static void imprimirPrimo(int numero) {
        System.out.printf("Numero (%d): Primo.%n", numero);
    }

    public static void imprimirNaoPrimo(int numero) {
        System.out.printf("Numero (%d): Nao e primo.%n", numero);
    }
}
