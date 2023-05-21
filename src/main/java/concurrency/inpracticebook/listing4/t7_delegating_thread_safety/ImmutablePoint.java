package concurrency.inpracticebook.listing4.t7_delegating_thread_safety;

import javax.annotation.concurrent.Immutable;

@Immutable
public class ImmutablePoint {

    private final int x,y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
