import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    /*
     * Encontre números com número par de digitos
     * dado um arrays de nums de inteiros, retornes quantos deles
     * contêm um número par de digitos.
     * 
     * Explicação
     * 12 contém 2 digitos (número par de digitos)
     * 345 contém 3 digitos (número impar de digitos)
     * 2 contém 1 digito (número impar de digitos)
     * 1234 contém 4 digitos (número par de digitos)
     * saida : 2
     */

    public static void main(String[] args) {
        // Saida esperada = 2
        var nums_1 = new ArrayList<>(Arrays.asList(12, 345, 2, 6, 7896));

        // Saida esperada = 1
        var nums_2 = new ArrayList<>(Arrays.asList(555, 901, 482, 1771));

        System.out.println(findEven(nums_1));
        System.out.println(findEven(nums_2));

    }

    public static int findEven(List<Integer> nums) {
        int result = 0;
        for (Integer num : nums) {
            if (num.toString().length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
