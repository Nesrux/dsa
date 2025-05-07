package listas.java.src;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList(Node<T> head) {
        this.head = head;
        this.size = 0;
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

}
