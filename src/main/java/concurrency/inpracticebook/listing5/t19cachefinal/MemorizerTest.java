package concurrency.inpracticebook.listing5.t19cachefinal;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

public class MemorizerTest {

    public static class TestComputable implements Computable<Object, String> {

        @Override
        public String compute(@NotNull java.lang.Object a) throws InterruptedException {
            System.out.println("wait 3 sec and compute..");
            Thread.sleep(3000);
            System.out.println(a + " computed!");
            return a.toString();
        }
    }

    @Test
    public void memorizerTest() throws InterruptedException {
        Memorizer<Object,String> memorizer = new Memorizer<>(new MemorizerTest.TestComputable());
        var o1 = new Object();
        var o2 = new Object();

        String result1 = "not_ready";
        // start computing for o1 in another parallel thread
        new Thread(() -> {
            try {
                System.out.println("compute o1 started");
                memorizer.compute(o1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("computing o1");

        // start computing for o1 in the same main thread
//        result1 = memorizer.compute(o1);

        System.out.println("o1 computation called\n result1 = " + result1 +
                "\n in progress...");
        System.out.println("compute o2");
        var result2 = memorizer.compute(o2);
        System.out.println("o2 computation called\n result2 = " + result2 +
                "\n in progress...");
    }
}
