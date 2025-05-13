public class BuscaBinariaRecursiva {

    public static int busca_binaria_recursiva(int[] nums, int key, int low, int high) {
        if (low > high)
            return -1;
        int middle = (low + high) / 2;

        if (key == nums[middle])
            return middle;
        else if (key < nums[middle]) {
            return busca_binaria_recursiva(nums, key, low, middle - 1);
        } else {
            return busca_binaria_recursiva(nums, key, middle + 1, high);
        }

    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 9;

        System.out.println(busca_binaria_recursiva(nums, key, 0, nums.length -1)); // saida 4
        
    }
}
