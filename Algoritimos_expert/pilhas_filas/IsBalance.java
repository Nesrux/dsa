package pilhas_filas;

import java.util.Stack;

/* Resoução do problema Is balance */
/*Fazer uma função para verificar se os parênteses
 * em uma string estão corretamente balanceados,
 * ou seja, cada parênteses aberto "(" tem um
 * correspondente fechado ")" e vice-versa
 */
public class IsBalance {
    public static void main(String[] args) {
        var a1 = isBalance("()()()"); // true
        var a2 = isBalance("public static void main (String[] args)()"); // true
        var a3 = isBalance("(()))("); // false
        var a4 = isBalance("(())()");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }

    public static boolean isBalance(String word) {
        char[] arr = word.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            }
            if (arr[i] == ')' && !stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
