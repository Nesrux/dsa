package conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Problema Votação
 * na contagem de vosots de uma eleição, são gerados vários 
 * registros de votação, contendo o nome do cnadidato e a
 * quantidade de votos que ele obteve em uma votação, você
 * deve fazer uma função para receber todos os registros de votação
 * das urnas, e dai retornar um consolidado com os totais de cada candidato
 * o resoltado pode ser mostrado em qualquer order.
 */
public class Votacao {

    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "Alex Blue,15",
                "Maria Green,22",
                "Bob Brown,21",
                "Alex Blue,30",
                "Bob Brown,15",
                "Maria Green,27",
                "Maria Green,22",
                "Bob Brown,25",
                "Alex Blue,31");

        List<String> result = counting(input);
        System.out.println(result);

    }

    public static List<String> counting(List<String> elements) {
        HashMap<String, Integer> dict = new HashMap<>();
        var list = new ArrayList<String>();

        for (String text : elements) {
            String key = text.split(",")[0];
            Integer value = Integer.parseInt(text.split(",")[1]);
            dict.put(key, value);
        }
        
        for (String keys : dict.keySet()) {
            list.add("o candidato: " + keys + "teve de votos: " + dict.get(keys));
        }
        return list;
    }

}
