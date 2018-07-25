package e_22_06_array_list;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayListRunnableDemo
{
    public static void main(String[] args)
    {
        Object[] staffNames = { "Anna", "James", "Michael", "Tony" };
        Lock theLock = new ReentrantLock();
        ArrayList staff = new ArrayList(staffNames, theLock);

        final int REPETITIONS = 10;
        final int THREADS = 10;

        for (int i = 1; i <= THREADS; i++) {
            AddLastRunnable addLast = new AddLastRunnable(staff, REPETITIONS);
            AddRunnable add = new AddRunnable(staff, REPETITIONS);
            RemoveRunnable remove = new RemoveRunnable(staff, REPETITIONS);
            SetRunnable set = new SetRunnable(staff, REPETITIONS);

            Thread addLastThread = new Thread(addLast);
            Thread removeThread = new Thread(remove);
            Thread addThread = new Thread(add);
            Thread setThread = new Thread(set);

            addLastThread.start();
            removeThread.start();
            addThread.start();
            setThread.start();
        }

        System.out.println(staff.toString());
    }
}
