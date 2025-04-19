/*
 * Ideia da solução com recursividade de cauuda:
 * intermediário como um parâmentro adicional da função.
 */
public class Fatorial_recursividade_de_cauda {

    public static int fatorial(int i) {
        return fatorialTailRecursive(i, 1);
    }

    public static int fatorialTailRecursive(int n, int total) {
        if (n == 0) return total;
        return fatorialTailRecursive(n - 1, n * total);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

}
