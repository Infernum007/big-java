package e_22_06_array_list;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayListRunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        Object[] integers = {1, 2, 3, 4, 5};
        Lock theLock = new ReentrantLock();
        ArrayList integerList = new ArrayList(integers, theLock);

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
