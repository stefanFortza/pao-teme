package ex1;

public class Queue implements Container {
    private Task[] tasks;
    private int size;

    public Queue(int size) {
        this.size = 0;
        tasks = new Task[size];
    }

    @Override
    public void add(Task task) {
        if (size == tasks.length) {
            System.out.println("Queue is full");
            return;
        }

        tasks[size] = task;
        size++;
    }

    @Override
    public Task remove() {
        Task taskToRemove = tasks[0];
        for (int i = 0; i < size - 1; i++) {
            tasks[i] = tasks[i + 1];
        }
        tasks[tasks.length - 1] = null;
        size--;
        return taskToRemove;
    }

}
