package concurrency.inpracticebook.listing5.t16cachememorization;

import javax.annotation.concurrent.GuardedBy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memorizer2<A, V> implements Computable<A, V> {

    @GuardedBy("this")
    private final Map<A, V> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> computable;

    public Memorizer2(Computable<A, V> computable) {
        this.computable = computable;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            result = computable.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}
