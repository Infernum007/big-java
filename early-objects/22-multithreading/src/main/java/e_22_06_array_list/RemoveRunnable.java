package e_22_06_array_list;

/**
 * {@code RemoveRunnable} class.
 */
public class RemoveRunnable implements Runnable {

    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public RemoveRunnable(final ArrayList arrayList, final int count) {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                if (arrayList.size() > 0) {
                    Object o = arrayList.remove(i);
                    System.out.println("remove " + arrayList.toString());
                }
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
