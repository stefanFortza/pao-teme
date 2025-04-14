package ex1;

public class Main {
    public static void main(String[] args) {
        OutTask outTask = new OutTask("Hello, World!");
        outTask.execute();

        RandomOutTask randomOutTask = new RandomOutTask();
        randomOutTask.execute();

        CounterOutTask counterOutTask = new CounterOutTask();
        counterOutTask.execute();
        counterOutTask.execute();
        counterOutTask.execute();

        Stack stack = new Stack(5);
        stack.add(outTask);
        stack.add(randomOutTask);
        stack.remove().execute();

        Queue queue = new Queue(5);
        queue.add(outTask);
        queue.add(randomOutTask);
        queue.remove().execute();
        queue.remove().execute();
    }
}