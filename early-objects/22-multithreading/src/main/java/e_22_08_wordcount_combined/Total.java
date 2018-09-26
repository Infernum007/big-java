package e_22_08_wordcount_combined;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Total {

    private long total;
    private Lock theLock;

    public Total() {
        this.total = 0;
        this.theLock = new ReentrantLock();
    }

    public long getTotal() {
        theLock.lock();
        try {
            return total;
        } finally {
            theLock.unlock();
        }
    }

    public void setTotal(long total) {
        theLock.lock();
        try {
            this.total = this.total + total;
        } finally {
            theLock.unlock();
        }
    }

}
