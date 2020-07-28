package interfaces;

@FunctionalInterface
public interface Converter<F, T> {

    T covert(F from);
}
