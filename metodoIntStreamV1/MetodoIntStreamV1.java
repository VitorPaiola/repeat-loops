package metodoIntStreamV1;

import java.util.stream.IntStream;

/*
 * Quando Usar IntStream?
 * 1 - Quando quiser código mais conciso e legível
 * Em vez de um for tradicional, um IntStream pode simplificar a iteração:
*/

public class MetodoIntStreamV1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).forEach(System.out::println);
    }
}
