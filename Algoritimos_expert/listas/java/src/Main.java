package listas.java.src;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.isEmpty());

        list.addAtEnd(2);
        list.addAtEnd(4);
        list.addAtEnd(6);
        list.addAtEnd(42);
        list.addAtEnd(31);
        list.print();

        list.addAtPosition(0, 11);
        list.print();

    }

}
