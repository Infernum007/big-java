package e_22_02_stack_as_linkedList;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MySafeStackImpl<E> implements MySafeStack<E> {

    private LinkedList<E> list;
    private Lock lock;

    public MySafeStackImpl() {
        this.list = new LinkedList<>();
        this.lock = new ReentrantLock();
    }

    @Override
    public void push(final E e) {
        lock.lock();
        try {
            this.list.addFirst(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public E pop() {
        lock.lock();
        try {
            return this.list.remove();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return this.list.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            return list.toString();
        } finally {
            lock.unlock();
        }
    }

}
