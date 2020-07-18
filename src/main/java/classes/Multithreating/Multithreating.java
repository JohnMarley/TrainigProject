package classes.Multithreating;

public class Multithreating implements Runnable {

    Thread t;

    public Multithreating(){
        t = new Thread(this,"A new Thread");
        System.out.println("Child thread:" + t);
        t.start();
    }

    public void run(){
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        System.out.println("Finishing the child thread!");
    }

}
