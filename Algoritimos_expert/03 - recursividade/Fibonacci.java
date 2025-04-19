public class Fibonacci {
    /*
     * A sequencia de fibonacci começa com 0,1 depois
     * cada número é a soma de seus dois antecessores.
     * Faça uma função para retornar o valor de uma dada posição
     * da sequência de fibonacci
     */
    // Solução ineficiente
    public static int sequence(int i) {
        if (i <= 1) return i;
        return sequence(i-1) + sequence(i -2);
    }

    public static void main(String[] args) {
        System.out.println(sequence(5));
    }
}
