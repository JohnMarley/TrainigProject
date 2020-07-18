package classes.Heritage.PrivateClassC;

public class PrivateClassC {

    private final int count = 0;

    int nonAccessor = 100;

    public final int getCount() {
        return count;
    }

//    public void setCount(int count) {
//        this.count = count;
//    }

    public int getNonAccessor() {
        return nonAccessor;
    }

    public void setNonAccessor(int nonAccessor) {
        this.nonAccessor = nonAccessor;
    }

    class Te extends PrivateClassC {
        int nonAccessor;

        int count;
    }
}
