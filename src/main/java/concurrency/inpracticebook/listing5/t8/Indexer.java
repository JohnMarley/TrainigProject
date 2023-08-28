package concurrency.inpracticebook.listing5.t8;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class Indexer implements Runnable {

    private final BlockingQueue<File> queue;


    public Indexer(BlockingQueue<File> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
//                indexFile(queue.take());
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
