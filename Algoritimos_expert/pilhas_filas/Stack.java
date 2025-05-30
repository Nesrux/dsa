package pilhas_filas;

/*Classe de uma pilha de dados feitos com array, para ficar mais simples,
 a stack com a implementação utilizando "ponteiros", vai ser chamado de pilha (pt-bt) */
@SuppressWarnings("unchecked")
public class Stack<T> {
    private final Integer size;
    private T[] arr;
    private int top;

    public Stack(Integer size) {
        this.size = size;
        this.top = -1;
        this.arr = (T[]) new Object[size];
    }

    public Stack() {
        this(100);
    }

    public void push(T elem) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        this.top++;
        this.arr[top] = elem;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = this.arr[this.top];
        this.top--;
        return item;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public int count() {
        return this.top + 1;
    }

    public T peek() {
        return arr[this.top];
    }

    public void clear() {
        this.arr = (T[]) new Object[size];
        this.top = -1;
    }

}
