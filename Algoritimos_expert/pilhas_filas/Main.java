package pilhas_filas;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(10);
        stack.push("João");
        stack.push("Carlos");
        stack.push("Maria");
        stack.push("Jéssica");

        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }

}
