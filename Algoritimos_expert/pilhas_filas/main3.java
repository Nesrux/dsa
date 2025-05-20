package pilhas_filas;

public class main3 {
    public static void main(String[] args) {
        var queue = new Queue<String>();
        System.out.println(queue.isEmpty());

        queue.add("João");
        queue.add("maria");
        queue.add("clebber");
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
