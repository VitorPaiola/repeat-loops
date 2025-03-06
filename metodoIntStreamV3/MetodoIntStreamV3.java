package metodoIntStreamV3;

import java.util.stream.IntStream;

/*
 * 3. Quando precisar de paralelismo para melhor performance
 * Se estiver lidando com grandes quantidades de dados, pode usar parallel():
*/

public class MetodoIntStreamV3 {
    public static void main(String[] args) {
        long count = IntStream.range(1, 1_000_000)
                .parallel() // Usa múltiplas threads
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Quantidade de pares: " + count);
    }
}
