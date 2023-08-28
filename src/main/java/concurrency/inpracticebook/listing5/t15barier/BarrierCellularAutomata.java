package concurrency.inpracticebook.listing5.t15barier;

/**
 * The key difference is that with a barrier, all the threads must come together
 * at a barrier point at the same time in order to proceed.
 * Latches are for waiting for events; barriers are for waiting for other threads.
 */
public class BarrierCellularAutomata {

//    private final Board mainBoard;
//    private final CyclicBarrier barrier;
//    private final Worker[] workers;
//
//    public BarrierCellularAutomata(Board board) {
//        this.mainBoard = board;
//        int count = Runtime.getRuntime().availableProcessors();
//        this.barrier = new CyclicBarrier(count, ()->mainBoard.commitNewValues());
//        this.workers = new Worker[count];
//        for (int i = 0; i < count; i++) {
//            workers[i] = new Worker(mainBoard.getSubBoard(count, i));
//        }
//    }
//
//    private class Worker implements Runnable {
//        private final Board board;
//
//        public Worker(Board board) { this.board = board; }
//
//        @Override
//        public void run() {
//            while (!board.hasConverged()) {
//                for (int x = 0; x < board.getMaxX(); x++) {
//                    for (int y = 0; y < board.getMaxY(); y++) {
//                        board.setNewValue(x, y, computeValue(x, y));
//                    }
//                }
//                try {
//                    barrier.await();
//                } catch (InterruptedException ex) {
//                    return;
//                } catch (BrokenBarrierException ex) {
//                    return;
//                }
//            }
//        }
//    }
//
//    public void start() {
//        for (Worker worker : workers) {
//            new Thread(worker).start();
//        }
//        mainBoard.waitForConvergence();
//    }
}
