
/*
 * Dado um array de inteiros arr, duplique cada ocorrência de zero, deslocando os
 * elementos restantes para a direita (shifting right).
 * Observe que elementos além do tamanho do array original não são escritos.
 * Utilize a abordagem "In-place" na qual a modificação é feita diretamente no array. 
 * 
 * Exemplo
 * entrada: nums = [1,0,2,3,0,4,5,0]
 * saída: [1,0,0,2,3,0,0,4]
 */

import java.util.Arrays;

public class DuplicarZeros {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicate(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void duplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length - 2; j > i; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[i + 1] = 0;
                i = i + 1;
            }
        }
    }

}
