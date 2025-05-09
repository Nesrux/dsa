package listas.java.src;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addAtEnd(T elem) {
        Node<T> node = new Node<>(elem);
        if (this.head == null) {
            this.head = node;
            this.size++;
            return;
        }
        var current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();

        }
        current.setNext(node);
        this.size = this.size + 1;
    }

    public void addAtInit(T elem) {
        Node<T> node = new Node<>(elem);
        var temp = getHead();
        
        this.head = node;
        head.setNext(temp);
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public void print() {
        var current = getHead();
        List<T> list = new ArrayList<>();

        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }
        System.out.println(list);

    }
}
