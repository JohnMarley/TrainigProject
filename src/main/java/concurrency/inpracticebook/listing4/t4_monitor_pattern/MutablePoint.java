package concurrency.inpracticebook.listing4.t4_monitor_pattern;

public class MutablePoint {

    public int x, y;

    public MutablePoint() {
        x = 0; y = 0;
    }

    public MutablePoint(MutablePoint p) {
        this.x = p.x;
        this.y = p.y;
    }
}
