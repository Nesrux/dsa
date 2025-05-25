package arvores.generic;

import java.util.ArrayList;
import java.util.List;

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

}
