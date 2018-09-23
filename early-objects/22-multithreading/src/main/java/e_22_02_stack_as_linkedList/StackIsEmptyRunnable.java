package e_22_02_stack_as_linkedList;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StackIsEmptyRunnable<E> implements Runnable {

    private final static Logger LOGGER = Logger.getLogger(StackIsEmptyRunnable.class.getName());

    private final static int DELAY = 1;
    private MySafeStack<E> stack;
    private int count;

    public StackIsEmptyRunnable(final MySafeStack<E> stack, final int count) {
        this.stack = stack;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < this.count; i++) {
                LOGGER.log(Level.INFO, Thread.currentThread().getName() + " ISEMPTY: " + stack.isEmpty());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
