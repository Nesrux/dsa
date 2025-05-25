package arvores.generic;

public class GenericTree<T> {

    private Node<T> root;
    private int size;

    public GenericTree() {
        this.root = null;
        this.size = 0;
    }

    public Position<T> add(T element, Position<T> parent) {
        if (!isEmpty() && parent == null) {
            throw new IllegalArgumentException("Parent position can't be null for a non empty tree");
        }
        Node<T> parentNode = parent == null ? null : validate(parent);
        Node<T> newNode = new Node<>(element, parentNode);

        if (parentNode == null) {
            root = newNode;
        } else {
            parentNode.addChild(newNode);
        }
        size++;
        return newNode;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private Node<T> validate(Position<T> position) {
        if (!(position instanceof Node)) {
            throw new IllegalArgumentException("Invalid position type");
        }
        Node<T> node = (Node<T>) position;
        if (node.getParent() == node) {
            throw new IllegalArgumentException("Position is no longer in the tree");
        }
        return node;
    }

}
