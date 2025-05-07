public class Fibonacci {
    /*
     * A sequencia de fibonacci começa com 0,1 depois
     * cada número é a soma de seus dois antecessores.
     * Faça uma função para retornar o valor de uma dada posição
     * da sequência de fibonacci
     */
    // Solução ineficiente
    public static int fib_not_tail_recursive(int i) {
        if (i <= 1)
            return i;
        return fib_not_tail_recursive(i - 1) + fib_not_tail_recursive(i - 2);
    }

    public static int fib(int n) {
        return fibTailRecursive(n, 0, 1);
    }
    // Fibonacci Eficiente em O (N)
    public static int fibTailRecursive(int n, int l, int r) {
        if (n == 0) return l;
        if (n == 1) return r;

        return fibTailRecursive(n - 1, r, l + r);
    }

    public static void main(String[] args) {
        System.out.println(fib_not_tail_recursive(5)); // Não eficiente
        System.out.println(fib(45)); // Eficiente
    }
}
