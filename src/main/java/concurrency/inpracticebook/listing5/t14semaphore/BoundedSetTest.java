package concurrency.inpracticebook.listing5.t14semaphore;

import org.junit.Test;

public class BoundedSetTest {

    @Test
    public void test() {
        BoundedSetSemaphoreExample<String> bounderSet = new BoundedSetSemaphoreExample<>(1);
        System.out.println("----adding 1 element");
        try {
            bounderSet.add("Test");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----done\nadding 2-nd element");
        try {
            // will wait until element be removed
            bounderSet.add("element2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
