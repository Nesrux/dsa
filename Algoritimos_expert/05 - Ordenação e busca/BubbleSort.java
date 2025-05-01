import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 1, 30, 4, 11, 20, 3, 312, 0 };
        System.out.println(Arrays.toString(sort(nums)));
    }

    public static int[] sort(int[] nums) {
        int size = nums.length; // tamanho do array

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size -1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp1 = nums[j];
                    int temp2 = nums[j+1];

                    nums[j] = temp2;
                    nums[j+1] = temp1;
                }
                
            }
        }


        return nums;
    }
}
