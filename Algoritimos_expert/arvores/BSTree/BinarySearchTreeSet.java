package arvores.BSTree;

import java.util.Objects;

public class BinarySearchTreeSet<K extends Comparable<K>> {

    private Node root;
    private int size;

    public BinarySearchTreeSet() {
        this.size = 0;
        this.root = new Node(null, null);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(K key) {
        Objects.requireNonNull(key, "key not be null");
        if (this.isEmpty()) {
            root = new Node(key, null);
            root.left = new Node(null, root);
            root.right = new Node(null, root);
            size++;
            return;
        }
        Node node = findKeyLocation(root, key);
        if (node.isSentinel()) {
            Node parent = node.parent;
            Node newNode = new Node(key, parent);
            newNode.left = new Node(null, newNode);
            newNode.right = new Node(null, newNode);

            if (node == parent.left) {
                parent.left = newNode;
            } else if (node == parent.right) {
                parent.right = newNode;
            }
            this.size++;
        }
    }

    private Node findKeyLocation(Node node, K key) {
        while (!node.isSentinel()) {
            int cmp = key.compareTo(node.key);
            if (cmp == 0) {
                return node;
            } else if (cmp < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return node;
    }

    private class Node {
        K key;
        Node left, right, parent;

        Node(K key, Node parent) {
            this.key = key;
            this.left = this.right = null;
            this.parent = parent;
        }

        boolean isSentinel() {
            return key == null;
        }
    }

}
