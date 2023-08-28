package concurrency.inpracticebook.listing5.t11latch;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class LatchExample {
    /**
     * Measuring time for task executing by n number of threads using CountDownLatch
     * A latch acts as a gate: until the latch reaches the terminal state the gate is
     * closed and no thread can pass, and in the terminal state the gate opens,
     * allowing all threads to pass
     * @param nThreads
     * @param task
     * @return
     * @throws InterruptedException
     */
    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(() -> {
                try {
                    startGate.await();
                    try {
                        task.run();
                    } finally {
                        endGate.countDown();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        long sTime = System.currentTimeMillis();
        startGate.countDown();
        endGate.await();
        long eTime = System.currentTimeMillis();
        return eTime - sTime;
    }

    @Test
    public void test() {
        LatchExample th = new LatchExample();
        Runnable task = () -> System.out.println("just a test task");
        try {
            var time = th.timeTasks(5, task);
            System.out.println( "Execution time is: " + time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
