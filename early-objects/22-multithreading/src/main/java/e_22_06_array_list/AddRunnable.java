package e_22_06_array_list;

public class AddRunnable implements Runnable {

    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public AddRunnable(final ArrayList arrayList, final int count) {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                final Object o = i;
                arrayList.add(i, o);
                System.out.println("add    " + arrayList.toString());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
