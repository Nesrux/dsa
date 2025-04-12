import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dados dois arrays de integer, calcule o produto escalar.
 * 
 * produto escalar é a multiplicação de dois arrays no mesmo indice
 * por exemplo o array [0, 3, 1] e [2, 3, 4]
 * ficaria como (0*1), (3*2), (1*4) e depois a soma deles
 * 1 + 6 +4 = 11, Então o retorno do produto escalarm desses 2 arrays é
 * 11
 */

public class produto_escalar_dois_vetores {
    public static void main(String[] args) {
        var prod1 = produto_escalar(new ArrayList<>(Arrays.asList(1, 3, 5, 7)),
                new ArrayList<>(Arrays.asList(1, 3, 5, 7)));
        var prod2 = produto_escalar(new ArrayList<>(Arrays.asList(0, 5, 3, 4)),
        new ArrayList<>(Arrays.asList(4, 2, 5, 2)));

        var prod3 = produto_escalar(new ArrayList<>(Arrays.asList(1, 3, 5, 7)),
        new ArrayList<>(Arrays.asList(1, 3, 5, 7, 5)));

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
    }

    public static int produto_escalar(List<Integer> lis1, List<Integer> list2) {
        if (lis1.size() != list2.size())
            return -1;

        int pointer_list1 = 0;
        int pointer_list2 = 0;
        List<Integer> accList = new ArrayList<>();
        int produto_escalar = 0;

        for (int i = 0; i < lis1.size(); i++) {
            pointer_list1 = lis1.get(i);
            pointer_list2 = list2.get(i);

            accList.add(pointer_list1 * pointer_list2);
        }

        for (Integer produto : accList) {
            produto_escalar += produto;
        }

        return produto_escalar;
    }

}
