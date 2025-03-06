package numerosPrimos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Escreva um programa que solicite ao usuário um
 * número N e exiba todos os números primos menores que N
 * e a quantidade de números primos presentes naquele intervalo.
*/

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero inteiro: ", entrada);

        mensagem(numero);

        List<Integer> primos = verificarNumeroPrimo(numero);

        imprimirPrimos(primos);

        contarPrimos(primos);

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

    public static void mensagem(int numero) {
        System.out.printf("Numeros primos menores que (%d): %n", numero);
    }

    public static List<Integer> verificarNumeroPrimo(int numero) {
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i < numero; i++) {
            if (numeroPrimo(i)) {
                primos.add(i);
            }
        }

        return primos;
    }

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void imprimirPrimos(List<Integer> primos) {
        System.out.print("[");
        for (int i = 0; i < primos.size(); i++) {
            System.out.print(primos.get(i));
            if (i < primos.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void contarPrimos(List<Integer> primos) {
        System.out.println("Total de numeros primos: " + primos.size());
    }
}
