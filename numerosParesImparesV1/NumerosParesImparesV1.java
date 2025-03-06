package numerosParesImparesV1;

/*
 * Escreva um programa que exiba os números
 * pares de 1 a 50 e os números ímpares de 51
 * a 100 utilizando um laço de repetição (while).
*/

//? O StringBuilder altera seu próprio conteúdo, sem a necessidade de criar um novo array a cada modificação.

public class NumerosParesImparesV1 {
    private static final int MIN_ALCANCE = 50;
    private static final int MAX_ALCANCE = 100;

    public static void main(String[] args) {
        System.out.println("Numeros pares: " + numerosPares());
        System.out.println("Numeros impares: " + numerosImpares());
    }

    public static String numerosPares() {
        int i = 1;
        StringBuilder resultado = new StringBuilder("[");
        while (i <= MIN_ALCANCE) {
            if (i % 2 == 0) {
                resultado.append(i).append(", ");
            }
            i++;
        }
        return formatarResultado(resultado);
    }

    public static String numerosImpares() {
        int i = 51;
        StringBuilder resultado = new StringBuilder("[");
        while (i <= MAX_ALCANCE) {
            if (i % 2 != 0) {
                resultado.append(i).append(", ");
            }
            i++;
        }
        return formatarResultado(resultado);
    }

    public static String formatarResultado(StringBuilder resultado) {
        if (resultado.length() > 1) {
            resultado.setLength(resultado.length() - 2); // Remove a última vírgula e espaço
        }
        resultado.append("]");
        return resultado.toString();
    }
}
