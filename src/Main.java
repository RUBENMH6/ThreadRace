import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Thread> list = new Vector<>();
        for (int i = 0; i < 10 ; i++) {
            Thread t = new Thread(new MyRunnable(list));
            list.add(t);
            t.start();
        }
    }
}
