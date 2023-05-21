package concurrency.inpracticebook.listing4.t1;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/**
 * Java Monitor pattern
 * encapsulates all its mutable state (var value) and guards it with the object's own intrinsic
 * lock
 * It encapsulates one state variable, value, and all access
 * to that state variable is through the methods of Counter, which are all synchronized
 * The primary advantage of the Java monitor pattern is its simplicity.
 */
@ThreadSafe
public final class Counter {

    @GuardedBy("this")
    private long value = 0;

    public synchronized long getValue() {
        return this.value;
    }

    public synchronized long increment() {
        if (this.value == Long.MAX_VALUE) {
            throw new IllegalStateException("counter overflow");
        }
        return ++this.value;
    }
}
