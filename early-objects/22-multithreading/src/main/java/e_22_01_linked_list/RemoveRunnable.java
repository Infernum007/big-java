package e_22_01_linked_list;

import java.util.LinkedList;

public class RemoveRunnable implements Runnable
{
    private static final int DELAY = 1;
    private LinkedList<Integer> list;
    private int count;

    public RemoveRunnable(final LinkedList<Integer> list, final int count)
    {
        this.list = list;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                System.out.print(Thread.currentThread().getName() + " ");
                System.out.println(" Remove: " + list.removeLast());
                Thread.sleep(DELAY);
            }
            System.out.println();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
