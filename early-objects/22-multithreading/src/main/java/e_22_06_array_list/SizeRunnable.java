package e_22_06_array_list;

public class SizeRunnable implements Runnable
{
    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public SizeRunnable(final ArrayList arrayList, final int count)
    {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                final int size = arrayList.size();
                System.out.println("SizeRunnable.run >>> " + size + " >>> running in " + Thread.currentThread().getName());
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
