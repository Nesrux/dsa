package arvores.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Node<T> implements Position<T> {
    private T element;
    private Node<T> parent;
    private List<Node<T>> children;

    public Node(T element, Node<T> parent) {
        this.element = element;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    @Override
    public T element() {
        return this.element;
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void addChild(Node<T> child) {
        this.children.add(child);
        child.setParent(this);
    }

    public void removechild(Node<T> child) {
        this.children.remove(child);
        child.setParent(null);
    }

    public void setElement(final T element) {
        this.element = element;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(final Node<T> parent) {
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(element, node.element);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(element);
    }

}
