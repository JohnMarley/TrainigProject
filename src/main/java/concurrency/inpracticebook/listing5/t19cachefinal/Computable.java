package concurrency.inpracticebook.listing5.t19cachefinal;

@FunctionalInterface
public interface Computable<A,V> {

    V compute(A a) throws InterruptedException;
}
