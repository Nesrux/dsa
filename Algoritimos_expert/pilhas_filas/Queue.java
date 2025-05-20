package pilhas_filas;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> list;

    public Queue() {
        this.list = new ArrayList<>();
    }

    public void add(T elem){
        this.list.add(elem);
    }
    public void remove(T elem){
        if(isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
        list.remove(0);

    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalAccessError("Queue is empty");
        }
        return this.list.get(0);
    }

    public int count(){
        return this.list.size();
    }


}
