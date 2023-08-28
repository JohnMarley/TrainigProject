package classes.generics;

import org.junit.Test;

public class GenericTest {

    @Test
    public void test() {
        Generic<Integer> gi = new Generic<>(5);
        Generic<Object> go = new Generic<>(new Object());
        Generic<String> gs = new Generic<>("test");
        gi.printType();
        go.printType();
        gs.printType();
    }
}
