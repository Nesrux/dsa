package conjuntos;
/*
 * Problema "two sum" (leet code),
 * dado um array de inteiros e de um inteiro
 * target, retorne os indices dos dois números
 * de tal forma que eles somem target, você pode
 * assumir que cada entrada terá exatamente uma solução
 * e você nao pode usar o mesmo elemento duas vezes, você 
 * pode retornar a resposta em qualquer ordem;
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sum(new int[] {2,7,11,15}, 9)));
		System.out.println(Arrays.toString(sum(new int[] {3,2,4}, 6)));
		System.out.println(Arrays.toString(sum(new int[] {3,5,7,2,4,8,1,6}, 15)));

    }

    public static int[] sum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                result[0] = index;
                result[1] = i;
                return result;
            }
            map.put (nums[i], i);
        }

        return result;
    }

}
