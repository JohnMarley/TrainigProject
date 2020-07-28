package interfaces;

@FunctionalInterface
public interface Converter<F, T> {

    T covert(F from);
    
    String testMethod(){
        System.out.println("Test");
    }
    
    String toString(){
        return getClass()+"Test";
    }
}
