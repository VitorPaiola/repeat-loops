package metodoIntStreamV2;

import java.util.stream.IntStream;

/*
 * 2. Quando precisar de operações encadeadas (Map, Filter, Reduce)
 * Se precisar transformar números, filtrar valores ou calcular somas/médias:
*/
public class MetodoIntStreamV2 {
    public static void main(String[] args) {
        int soma = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).sum();
        System.out.println("Soma dos pares: " + soma);
    }
}
