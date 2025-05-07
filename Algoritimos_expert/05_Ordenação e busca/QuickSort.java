import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quick_sort(new int[]{4,5,12,33,3,441,2,3,6}, 0, 8)));
        System.out.println(Arrays.toString(quick_sort(new int[]{-21, 32, 19, -10, 9, 3}, 0, 5)));
       
    }

    public static int[] quick_sort(int[] nums, int left, int right) {
        if (left < right) {
            int pivo = partition(nums, left, right);
            quick_sort(nums, left, pivo - 1);
            quick_sort(nums, pivo + 1, right);
        }
        return nums;
    }

    public static int partition(int[] nums, int left, int right) {
        int pivo = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivo) {
                swap(nums, j, i);
                i += 1;
            }
        }
        swap(nums,i, right);
        return i;
    }

    public static int[] swap(int[] nums, int a, int b) {
        int aux = nums[a];
        nums[a] = nums[b];
        nums[b] = aux;
        return nums;
    }

}
