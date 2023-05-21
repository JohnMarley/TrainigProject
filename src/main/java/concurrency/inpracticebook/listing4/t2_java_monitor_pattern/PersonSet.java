package concurrency.inpracticebook.listing4.t2_java_monitor_pattern;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import java.util.HashSet;
import java.util.Set;

/**
 * Using Confinement to Ensure Thread Safety
 * The state of PersonSet is managed by a HashSet, which is not threadsafe.
 * But because mySet is private and not allowed to escape, the HashSet is confined to the PersonSet.
 * The only code paths that can access mySet are addPerson and containsPerson,
 * and each of these acquires the lock on the PersonSet. All its
 * state is guarded by its intrinsic lock, making PersonSet threadsafe.
 */

@ThreadSafe
public class PersonSet {

    @GuardedBy("this")
    private final Set<Person> mySet = new HashSet<>();

    public synchronized void addPerson(Person p) {
        this.mySet.add(p);
    }

    public synchronized boolean containsPerson(Person p) {
        return this.mySet.contains(p);
    }
}
