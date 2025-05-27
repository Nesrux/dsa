package arvores.BSTree;

public class BinarySearchTreeSet<K> {

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
