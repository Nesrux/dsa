import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[] { 20, 9, 80, -2, 36 })));
        System.out.println(Arrays.toString(sort(new int[] { 5, 4, 3, 2, 1 })));
        System.out.println(Arrays.toString(sort(new int[] { -5, 0, 2, 8, 13, 16, 19, 23, 29, 34, 38 })));

    }

    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int temp = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j -= 1;
            }
            nums[j + 1] = temp;
        }

        return nums;
    }

}
