package listas.java.src;

import listas.java.src.types.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addAtEnd(2);
        list.addAtEnd(4);
        list.addAtEnd(6);
        list.addAtEnd(42);
        list.addAtEnd(31);
        list.print();

    }

}
