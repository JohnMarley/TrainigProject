package concurrency.inpracticebook;

public class Test {

    public void test() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ).start();
    }
}
