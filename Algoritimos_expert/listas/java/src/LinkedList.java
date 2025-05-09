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

    public void addAtPosition(int index, T Elem) {
        if (index == 0) {
            addAtStart(Elem);
            return;
        }
        if (index > this.size || index < 0) {
            addAtEnd(Elem);
            return;
        }
        Node<T> node = new Node<>(Elem);
        var aux = this.getNode(index - 1);
        node.setNext(aux.getNext());
        aux.setNext(node);
        this.size++;
    }

    public void addAtStart(T elem) {
        Node<T> node = new Node<>(elem);
        var temp = getHead();

        this.head = node;
        head.setNext(temp);
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public T get(int index) {
        var current = this.getNode(index);
        if (current != null)
            return current.getValue();
        return null;
    }

    public Node<T> getNode(int index) {
        if (index < 0 || index > getSize())
            return null;
        var current = this.head;
        int i = 0;
        while (i != index) {
            current = current.getNext();
            i++;
        }
        if (current != null) {
            return current;
        }

        return null;
    }

    public int indexOf(T elem) {
        int index = 0;
        var current = this.head;

        while (current != null) {
            if (current.getValue() == elem) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(T elem) {
        var indexElemen = indexOf(elem);
        if (indexElemen == -1) {
            return false;
        }
        return true;
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
