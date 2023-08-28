package concurrency.inpracticebook.listing5.t16cachememorization;

import java.math.BigInteger;

public class ExpensiveFunction implements Computable<String, BigInteger> {

    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        // after deep thought...
        return new BigInteger(arg);
    }
}
