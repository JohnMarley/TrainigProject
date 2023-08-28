package concurrency.inpracticebook.listing5.t19cachefinal;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@AllArgsConstructor
public class Memorizer<A,V> implements Computable<A, V> {

    private final ConcurrentMap<A, Future<V>> cache = new ConcurrentHashMap<>();
    private final Computable<A,V> computable;

    @Override
    public V compute(final A arg) throws InterruptedException {
        while (true) {
            Future<V> future = cache.get(arg);
            if (future == null) {
                Callable<V> eval = () -> computable.compute(arg);
                FutureTask<V> fTask = new FutureTask<>(eval);
                future = cache.putIfAbsent(arg, fTask);
                if (future == null) {
                    future = fTask;
                    System.out.println("future task computation starts here");

                    // to run in another parallel thread
                    ExecutorService es = Executors.newFixedThreadPool(2);
                    es.execute(fTask);

                    // to run in the same (main) thread
//                    fTask.run();
                }
            }
            try {
                System.out.println("waiting 5 secs and exec future.get()");
                System.out.println("another line in main thread");
                Thread.sleep(5000);
                var start = System.currentTimeMillis();
                var result = future.get();
                var execTime = System.currentTimeMillis() - start;
                System.out.println("time to execute future.get() = " + execTime);
                return result;
            } catch (CancellationException e) {
                cache.remove(arg, future);
            } catch (ExecutionException e) {
                e.getCause().printStackTrace();
            }
        }
    }
}
