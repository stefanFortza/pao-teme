package ex1;

public class Stack implements Container {
    private Task[] tasks;
    private int size;

    public Stack(int capacity) {
        this.tasks = new Task[capacity];
        this.size = 0;
    }

    @Override
    public void add(Task task) {
        if (size == tasks.length) {
            System.out.println("Stack is full. Cannot add more tasks.");
            return;
        }
        tasks[size] = task;
        size++;
    }

    @Override
    public Task remove() {
        if (size == 0) {
            return null;
        }
        Task task = tasks[size - 1];
        tasks[size - 1] = null;
        size--;
        return task;
    }

}
