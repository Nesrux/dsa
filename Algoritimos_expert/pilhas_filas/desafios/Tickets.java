package pilhas_filas.desafios;
/*
 * Problema "Tickets", (Leet code time-needed-to-buy-tickets)
 * 
 * há uma fila de N pessoas que querem comprar tickets de um evento.
 * 
 * a quantidade de tickets que cada pessoa deseja comprar deve ser
 * representada por um array de "tickets", por exemplo, se há 3
 * pessoas, A, B e C na fila, e o array de tickets for [2, 4, 3],
 * significa que a pessoa A quer comprar 2 tickets a pessoa B quer 
 * comprar 4 tickets e a pessoa c quer comprar 3 tickets.
 * 
 * cada pessoa leva exatamente 1 segundo para comprar 1 ticket, e 
 * pode comprar  apenas 1 tickets por vez, após comprar 1 ticket, 
 * se a pessoa ainda quer comprar mais tickets, ela deve ir para
 * o final da fila, quando a pessoa compra o ultimo ticket que deseja
 * ela sai da fila.
 * 
 * Faça uma função que receba um array de tickets, e um indice K,
 * a função deve retornar quantos segundos a pessoa na posição k, 
 * demora para comprar todos os seus tickets.
 * 
 */

public class Tickets {

    public static void main(String[] args) {
        System.out.println(getTime(new int[] { 1, 4, 5 }, 1));
      

    }


    public static int getTime(int[] arr, int indice) {
        if (arr.length == 1) {
            return arr[0];
        }
        int time = 0;

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[i] -= 1;
                    time++;
                }
                if (arr[indice] == 0) {
                    return time;
                }
            }
        }
    }
}
