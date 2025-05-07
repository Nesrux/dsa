import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortedSquare {
    /*
     * Dado um array de números inteiros nums ordenado em ordem crescente,
     * retorne um array com os quadrados de cada número, também ordenado de forma
     * crescente.
     */

    /*
     * entrada: nums = [-4,-1,0,3,10]
     * saída: [0,1,9,16,100]
     * 
     * Explicação: Após elevar ao quadrado, temos como resultado o array [16, 1, 0,
     * 9, 100]. Em seguida, após ordenar os valores do array, temos [0, 1, 9, 16,
     * 100].
     */
    public static void main(String[] args) {
        var nums_1 = new ArrayList<>(Arrays.asList(-4, -1, 0, 3, 10));
        var nums_2 = new ArrayList<>(Arrays.asList(-7, -3, 2, 3, 11));
        // saída: [0,1,9,16,100]
        System.out.println(ordenededSquare(nums_1));

        // saída: [4,9,9,49,121]
        System.out.println(ordenededSquare(nums_2));
    }

    public static List<Integer> ordenededSquare(List<Integer> nums) {
        var sortedNums = new ArrayList<Integer>();
    
        for (Integer num : nums) {
           sortedNums.add(num * num);
        }
        sortedNums.sort(Integer::compareTo);
        return sortedNums;
    }
}
