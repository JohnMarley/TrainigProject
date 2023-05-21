package concurrency.inpracticebook.listing4.t3_private_lock;

import io.appium.java_client.pagefactory.Widget;

import javax.annotation.concurrent.GuardedBy;

public class PrivateLock {

    private final Object myLock = new Object();
    @GuardedBy("myLock")
    Widget widget;

    void someMethod() {
        synchronized (myLock) {
            // access or modify the state of widget
        }
    }
}
