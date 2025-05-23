package conjuntos;

import java.time.Instant;
import java.util.HashMap;

public class testDicionario {
    public static void main(String[] args) {
        var cookies = new HashMap<String, String>();

        cookies.put("user", "maria69");
        cookies.put("email", "maria@gmail.com");
        cookies.put("last-login", Instant.now().toString());

        System.out.println("valores");
        for (String value : cookies.values()) {
            System.out.println(value);
        }
        for (String value : cookies.keySet()) {
            System.out.println(value);
        }

        System.out.println(cookies.containsKey("last-login"));
        System.out.println(cookies.containsKey("first-login"));
        System.out.println(cookies.size());
        var keys = cookies.keySet().toArray();
        int i = 0;
        while (!cookies.isEmpty()) {
            cookies.remove((String ) keys[i]);
            i++;
        }

        System.out.println(cookies.size());

    }

}
