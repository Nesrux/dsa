import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,30,11, 4, 392, 5, 8, 43, 32};
        System.out.println(Arrays.toString(selection_sort(nums)));
    }

    public static int[] selection_sort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != 1) {
                int aux = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = aux;
            }
        }
        return nums;
    }
}
