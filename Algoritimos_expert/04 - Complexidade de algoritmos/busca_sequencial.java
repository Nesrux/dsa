import java.util.Arrays;
import java.util.List;
public class busca_sequencial {
/*
 * Análise de tempo: O(n)
 * Análise de espaço: O(1)
 */
    public static int sequencial_search(List<Integer> list, Integer number) {
        for(int i = 0; i < list.size() -1; i++) {
            if (list.get(i) == number ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        var list = Arrays.asList(1,3,5,6,7,8,11,12);
        var list2 = Arrays.asList(10,34,41,11,53,193,1, 5,450,31);

        System.out.println(sequencial_search(list, 1));
        System.out.println(sequencial_search(list2, 5));
        System.out.println(sequencial_search(list2, 3));
    }

}
