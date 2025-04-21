import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    /*
     * Faça uma função que receba uma lista
     * de qualquer tipo e retorne a lista reversa.
     * 
     */

    public static <T> List<T> reversao(List<T> list) {
        if (list.size() < 1) {
            return new ArrayList<>(list);
        }

        T head = list.get(0);
        List<T> tail = list.subList(1, list.size());
        List<T> newList = reversao(tail);
        newList.add(head);

        return newList;
    }

    public static void main(String[] args) {
        List<String> ListString = new ArrayList<>(Arrays.asList("João", "Marcos", "sousa", "rebelo"));
        List<Integer> ListInteger = new ArrayList<>(Arrays.asList(7, 14, 18, 21, 35, 156));

        System.out.println(reversao(ListString));
        System.out.println(reversao(ListInteger));

    }

}
