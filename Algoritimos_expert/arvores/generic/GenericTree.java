package arvores.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericTree<T> {

    private Node<T> root;
    private int size;

    public GenericTree() {
        this.root = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Position<T> root() {
        return this.root;
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

    public List<Position<T>> children(Position<T> position) {
        Node<T> node = validate(position);
        return Collections.unmodifiableList(node.getChildren());
    }

    public List<T> elements() {
        List<T> elements = new ArrayList<>();
        collectElements(elements, root);
        return elements;
    }

    private void collectElements(List<T> list, Node<T> node) {
        list.add(node.element());
        for (Node<T> child : node.getChildren()) {
            collectElements(list, child);
        }
    }

    public List<Position<T>> positions() {
        List<Position<T>> positions = new ArrayList<>();
        collectPositions(positions, root);
        return positions;
    }

    private void collectPositions(List<Position<T>> list, Node<T> node) {
        list.add(node);
        for (Node<T> child : node.getChildren()) {
            collectPositions(list, child);
        }
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
