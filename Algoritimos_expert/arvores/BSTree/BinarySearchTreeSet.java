package arvores.BSTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class BinarySearchTreeSet<K extends Comparable<K>> {

    private Node root;
    private int size;

    public BinarySearchTreeSet() {
        this.size = 0;
        this.root = new Node(null, null);
    }

    public BinarySearchTreeSet(Collection<K> collection) {
        this.size = 0;
        this.root = new Node(null, null);
        this.addAll(collection);
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

    public void addAll(Collection<K> values) {
        values.stream().forEach(item -> add(item));
    }

    public String toStringFormat() {
        StringBuilder sb = new StringBuilder();
        toStringFormat(root, 0, sb);
        return sb.toString();
    }

    // Percurso interfixo
    public List<K> keys() {
        ArrayList<K> keys = new ArrayList<>();
        collectKeys(root, keys);
        return keys;
    }

    private void collectKeys(Node node, List<K> keyslist) {
        if (!node.isSentinel()) {
            collectKeys(node.left, keyslist);
            keyslist.add(node.key);
            collectKeys(node.right, keyslist);
        }
    }

    private void toStringFormat(Node node, int depth, StringBuilder sb) {
        if (!node.isSentinel()) {
            toStringFormat(node.right, depth + 1, sb);
            String space = (depth > 0) ? "  ".repeat(depth - 1) + "--" : "";
            String parent = (depth > 0) ? node.parent.key.toString() : "";
            sb.append(space + "(" + node.key + ")" + parent + "\n");
            toStringFormat(node.left, depth + 1, sb);
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
