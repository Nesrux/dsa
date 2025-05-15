package pilhas_filas;

public class Main2 {
    public static void main(String[] args) {
        Pilha<Integer> list = new Pilha<>();
        list.push(1);
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        System.out.println(list.count());
        System.out.println(list.peek());

        while (!list.isEmpty()) {
            System.out.println("O número é : " + list.pop());
        }
        System.out.println(list.count());
    }

}
