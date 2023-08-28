package concurrency.inpracticebook.listing5.t10;

import java.util.concurrent.BlockingQueue;

/**
 * Restoring the Interrupted Status
 * Sometimes you cannot throw InterruptedException, for instance when your code is part of a
 * Runnable. In these situations, you must catch InterruptedException and restore the interrupted status by calling
 * interrupt on the current thread
 */
public class TaskRunnable implements Runnable {

    BlockingQueue<Integer> queue;

    @Override
    public void run() {
        try {
            queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
