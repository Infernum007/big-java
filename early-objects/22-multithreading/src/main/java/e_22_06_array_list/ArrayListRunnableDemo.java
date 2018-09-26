package e_22_06_array_list;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayListRunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        Object[] integers = {1, 2, 3, 4, 5};
        Lock theLock = new ReentrantLock();
        ArrayList integerList = new ArrayList(integers, theLock);

        final int REPETITIONS = 5;
        final int THREADS = 5;

        for (int i = 0; i < THREADS; i++) {
            AddLastRunnable addLast = new AddLastRunnable(integerList, REPETITIONS);
            AddRunnable add = new AddRunnable(integerList, REPETITIONS);
            RemoveRunnable remove = new RemoveRunnable(integerList, REPETITIONS);
            SetRunnable set = new SetRunnable(integerList, REPETITIONS);

            Thread addLastThread = new Thread(addLast);
            Thread addThread = new Thread(add);
            Thread removeThread = new Thread(remove);
            Thread setThread = new Thread(set);

            addLastThread.start();
            addThread.start();
            removeThread.start();
            setThread.start();

        }

        Thread toStringThread = new Thread(new ToStringRunnable(integerList));
        Thread.sleep(1000);

        System.out.print("final  ");
        toStringThread.start();
    }

}
