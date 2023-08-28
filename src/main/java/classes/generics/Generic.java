package classes.generics;

public class Generic<T> {

    private T parameter;

    public Generic(T o) {
        this.parameter = o;
    }

    public T getType() {
        return parameter;
    }

    public void printType() {
        System.out.println(getType().getClass());
    }
}
