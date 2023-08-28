package concurrency.inpracticebook.listing5.t14semaphore;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * semaphores are used to control the number of activities that can access a certain resource
 * using a Semaphore to turn collection into a blocking bounded collection
 *
 * A Semaphore manages a set of virtual permits; the initial number of permits is passed
 * to the Semaphore constructor. Activities can acquire permits (as long as some remain)
 * and release permits when they are done with them. If no permit is available,
 * acquire blocks until one is (or until interrupted or the operation times out).
 * The release method returns a permit to the semaphore.
 * @param <T>
 */
public class BoundedSetSemaphoreExample<T> {

    private final Set<T> set;
    private final Semaphore semaphore;

    public BoundedSetSemaphoreExample(int bound) {
        this.set = Collections.synchronizedSet(new HashSet<T>());
        this.semaphore = new Semaphore(bound);
    }

    public boolean add(T o) throws InterruptedException {
        semaphore.acquire();
        boolean wasAdded = false;
        try {
            wasAdded = set.add(o);
            return wasAdded;
        } finally {
            if (!wasAdded) {
                semaphore.release();
            }
        }
    }

    public boolean remove(T o) {
        boolean wasRemoved = set.remove(o);
        if (wasRemoved) {
            semaphore.release();
        }
        return wasRemoved;
    }

}
