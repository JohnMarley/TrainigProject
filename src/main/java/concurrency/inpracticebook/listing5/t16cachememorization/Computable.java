package concurrency.inpracticebook.listing5.t16cachememorization;

public interface Computable<A, V> {

    V compute(A a) throws InterruptedException;
}
