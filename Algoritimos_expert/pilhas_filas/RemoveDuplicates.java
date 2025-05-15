package pilhas_filas;

import java.util.Stack;

/*
 * Problema **Remove-duplicates";
 * Crie uma função que remova repetidamente os dois primeiros caracteres 
 * adjacesntes iguais em uma string de letras, até que mão haja mais dois
 * caracteres adjacestes repetidos
 * 
 * Exemplo:
 * Entrada : abbaca ; Saida: ca
 * Entrada: Azxxzy ; saida ay
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(remove("abbaca")); // c, a
        System.out.println(remove("azxxzy")); // a, y
        System.out.println(remove("aaabbbccc")); // a, b, c
    }

    public static String remove(String word) {
        Stack<Character> st = new Stack<>();

        for (char letra : word.toCharArray()) {
            if (!st.empty() && st.peek() == letra) {
                st.pop();
            } else {
                st.push(letra);
            }
        }

        return st.toString();

    }

}
