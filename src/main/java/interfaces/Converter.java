package interfaces;

@FunctionalInterface
public interface Converter<F, T> {

    T covert(F from);

    @Override
    String toString();

    default void testMethod(){
        System.out.println("Test");
    }

   default String toStrin(){
        return getClass()+"Test";
    }
}
