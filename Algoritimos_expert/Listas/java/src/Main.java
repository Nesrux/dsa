package Listas.java.src;
public class Main {
    public static void main(String[] args) {

        var task1 = new Task(1, "Daily with a team", "meeting");
        var task2 = new Task(2, "Implement some feature", "job");
        var task3 = new Task(3, "Implement a bug fix", "fix");
        var task4 = new Task(4, "descrições insanas", "meeting");

        TaskList list = new TaskList();

        list.addTask(task1);
        list.addTask(task2);
        list.addTask(task3);
        list.addTask(task4);

        System.out.println(list.getTasksByTag("meeting"));
        System.out.println(list.getTaskById(4));
        System.out.println(list.removeTaskById(2));

    }

}
