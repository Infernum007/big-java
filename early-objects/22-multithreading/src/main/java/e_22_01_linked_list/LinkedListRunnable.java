package e_22_01_linked_list;

import java.util.LinkedList;

/**
 * Write a program in which multiple threads add and remove elements from a
 * {@code java.util.LinkedList}. Demonstrate that the list is being corrupted.
 */
public class LinkedListRunnable
{
    public static void main(String[] args)
    {
        final LinkedList<Integer> list = new LinkedList<>();
        final int REPETITIONS = 10;
        final int THREADS = 10;

        for (int i = 0; i < THREADS; i++) {
            AddRunnable a = new AddRunnable(list, REPETITIONS);
            RemoveRunnable r = new RemoveRunnable(list, REPETITIONS);

            Thread at = new Thread(a);
            Thread rt = new Thread(r);

            at.start();
            rt.start();
        }
    }
}
