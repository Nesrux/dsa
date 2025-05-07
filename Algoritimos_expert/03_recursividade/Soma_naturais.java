/*
 * Faça uma função que dado um número natual
 * N retorne a soma dos numeros de  0 até 
 * N
 */

public class Soma_naturais {
    public static void main(String[] args) {
            System.out.println(sumNaturals(10));
    }
     
    public static int sumNaturals (int n) {
        if (n == 0) return 0;
        return n + sumNaturals(n -1);
    }
}
