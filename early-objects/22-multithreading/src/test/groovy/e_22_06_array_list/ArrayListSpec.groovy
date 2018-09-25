package e_22_06_array_list


import spock.lang.Specification

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

class ArrayListSpec extends Specification {

    int THREADS = 5
    int REPETITIONS = 5
    Object[] integers = [1, 2, 3, 4, 5]
    ArrayList arrayList

    void setup() {
        Lock theLock = new ReentrantLock()
        arrayList = new ArrayList(integers, theLock)
    }

    def "add() method inserts an element at a given position"() {
        given:
        for (x in 1..THREADS) {
            Thread addThread = new Thread(new AddRunnable(arrayList, REPETITIONS))
            addThread.start()
        }
        Thread.sleep(500)

        expect:
        arrayList.size() == (THREADS * REPETITIONS + integers.size())
        arrayList.elements.count(value) == result

        where:
        value || result
        0     || 5
        1     || 6
        2     || 6
        3     || 6
        4     || 6
        5     || 1

    }

    def "addLast() method inserts elements in the end of list"() {
        given:
        for (x in 1..THREADS) {
            Thread addLastThread = new Thread(new AddLastRunnable(arrayList, REPETITIONS))
            addLastThread.start()
        }
        Thread.sleep(500)

        expect:
        arrayList.size() == (THREADS * REPETITIONS + integers.size())
        arrayList.elements.count(count) == result

        where:
        count || result
        0     || 5
        1     || 6
        2     || 6
        3     || 6
        4     || 6
        5     || 1
    }
}
