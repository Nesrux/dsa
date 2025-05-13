/**
 * LEETCODE Máximo de 1s consecutivos
 */

// Dado um array binário nums, retorne número máximo de 1s consecutivos no array

//exemplo entrada  nums = [1,1,0,1, 0, 0, 1, 1 , 1]

public class Maximo_uns_consecutivos {
    public static void main(String[] args) {
        int[] entrada_um = { 1, 1, 0, 1, 0, 0, 1, 1, 1 };
        int[] entrada_dois = { 1, 0, 1, 1, 0, 1 };

        System.out.println(maxNums(entrada_um));
        System.out.println(maxNums(entrada_dois));
    }

    public static Integer maxNums(int[] nums) {
        int maxOnes = 0; // Maior sequencia de 1's registrada
        int countOnes = 0; // Sequencia de 1s atual

        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            }
            if (num != 1 && countOnes > 0) {
                if (countOnes > maxOnes) {
                    maxOnes = countOnes;
                }
                countOnes = 0;
            }
        }

        if (countOnes > maxOnes) {
            maxOnes = countOnes;
        }

        return maxOnes;
    }
}
