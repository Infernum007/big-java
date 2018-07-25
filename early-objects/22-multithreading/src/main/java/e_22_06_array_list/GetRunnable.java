package e_22_06_array_list;

public class GetRunnable implements Runnable
{
    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public GetRunnable(final ArrayList arrayList, final int count)
    {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                final Object o = arrayList.get(i);
                System.out.println("GetRunnable.run >>> " + o.toString() + " >>> running in " + Thread.currentThread().getName());
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
