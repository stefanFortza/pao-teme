package ex1;

public class RandomOutTask implements Task {

    @Override
    public void execute() {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("Random number: " + randomNumber);
    }

}