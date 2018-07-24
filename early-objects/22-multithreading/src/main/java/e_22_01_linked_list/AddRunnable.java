package e_22_01_linked_list;

import java.util.LinkedList;

public class AddRunnable implements Runnable
{
    private static final int DELAY = 1;
    private LinkedList<Integer> list;
    private int count;

    public AddRunnable(final LinkedList<Integer> list, final int count)
    {
        this.list = list;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                list.add(i);
                System.out.print(Thread.currentThread().getName() + " ");
                System.out.println(" Add: " + list.get(i));
                Thread.sleep(DELAY);
            }
            System.out.println();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
