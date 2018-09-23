package e_22_02_stack_as_linkedList;

/**
 * Implement a stack as a linked list in which the {@code push}, {@code pop},
 * and {@code isEmpty} methods can be safely accessed from multiple threads.
 */
public class MySafeStackThreadRunner {

    public static void main(String[] args) {
        final MySafeStack<Integer> stack = new MySafeStackImpl<>();
        final int REPETITIONS = 100;
        final int THREADS = 100;

        for (int i = 0; i < THREADS; i++) {

            System.out.println(stack.toString());

            StackPushRunnable<Integer> push = new StackPushRunnable<>(stack, i, REPETITIONS);
            StackIsEmptyRunnable<Integer> isEmpty = new StackIsEmptyRunnable<>(stack, REPETITIONS);
            StackPopRunnable<Integer> pop = new StackPopRunnable<>(stack, REPETITIONS);

            Thread pushThread = new Thread(push);
            Thread isEmptyThread = new Thread(isEmpty);
            Thread popThread = new Thread(pop);

            pushThread.start();
            isEmptyThread.start();
            popThread.start();

            System.out.println(stack.toString());
        }
    }

}
