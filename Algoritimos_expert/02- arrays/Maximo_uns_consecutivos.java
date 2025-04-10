// Dado um array binário nums, retorne número máximo de 1s consecutivos no array

//exemplo entrada  nums = [1,1,0,1, 0, 0, 1, 1 , 1]

public class Maximo_uns_consecutivos {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 0, 0, 1, 1, 1 };
        System.out.println(maxNums(nums));
    }

    public static Integer maxNums(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 1) {
                count++;
            }
            count = 0;
        }

        return count;
    }
}
