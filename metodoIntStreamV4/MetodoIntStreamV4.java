package metodoIntStreamV4;

import java.util.stream.IntStream;
import java.util.OptionalDouble;

/*
 * 4. Quando precisar de cálculos estatísticos rapidamente
 * A API de Streams facilita cálculos como média, máximo e mínimo:
*/

public class MetodoIntStreamV4 {
    public static void main(String[] args) {
        OptionalDouble media = IntStream.rangeClosed(1, 100).average();
        media.ifPresent(m -> System.out.println("Media: " + m));
    }
}
