package listas.java.src;

public class Main {
    public static void main(String[] args) {
        
        var node1 = new Node<Integer>(1);
        var node2 = new Node<Integer>(3);
        var node3 = new Node<Integer>(11);

        node1.setNext(node2);
        node2.setNext(node3);
        
        LinkedList<Integer> list = new LinkedList<>(node1);
        list.addAtEnd(22);

        System.out.println(node3.getNext().getValue());
        
    }

}
