import java.util.List;

public class MyRunnable implements Runnable {

    private List<Thread> list;


    public MyRunnable(List<Thread> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long counter = 0;
        int countRand = 0;

        while (!Thread.currentThread().isInterrupted() && counter < 10000) {
            int randomNumber = (int) (Math.random() * 11);
            if (randomNumber == 10) {
                counter++;
            }
            countRand++;
        }
        if (counter == 10000) {
            for (Thread t : list) {
                t.interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " is a winner ");
        } else {
            System.out.println(Thread.currentThread().getName() + " - Random number: " + countRand);
        }
    }
}
