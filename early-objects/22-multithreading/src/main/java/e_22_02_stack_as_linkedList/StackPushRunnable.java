package e_22_02_stack_as_linkedList;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StackPushRunnable<E> implements Runnable {

    private final static Logger LOGGER = Logger.getLogger(StackPushRunnable.class.getName());

    private final static int DELAY = 1;
    private MySafeStack<E> stack;
    private E element;
    private int count;

    public StackPushRunnable(final MySafeStack<E> stack, final E element, final int count) {
        this.stack = stack;
        this.element = element;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < this.count; i++) {
                LOGGER.log(Level.INFO, Thread.currentThread().getName() + " PUSH: " + element);
                stack.push(element);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
