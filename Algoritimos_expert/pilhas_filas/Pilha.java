package pilhas_filas;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> list;

    public Pilha() {
     
        list = new LinkedList<>();
    }

    public void push(T elem) {
        this.list.add(elem);
    }

    public T pop() {
        if (isEmpty())
            return null;

        return this.list.removeLast();
    }

    public boolean isEmpty() {
        // this.list.isEmpty();
        return this.list.size() == 0;
    }

    public T peek(){
        return this.list.getLast();
    }

    public int count(){
        return this.list.size();
    }

}
