package concurrency.inpracticebook.listing3.t1;

public class NoVisibility {

    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Run!");
        new ReaderThread().start();
//        Thread.sleep(10);
        number = 42;
        ready = true;
        System.out.println("Finish");
    }
}
