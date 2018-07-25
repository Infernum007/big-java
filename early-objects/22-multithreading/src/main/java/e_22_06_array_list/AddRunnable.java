package e_22_06_array_list;

public class AddRunnable implements Runnable
{
    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public AddRunnable(final ArrayList arrayList, final int count)
    {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                Object o = "John-" + i;
                boolean added = arrayList.add(i, o);
                System.out.println("AddRunnable.run >>> " + added + " " + o.toString() + " >>> running in " + Thread.currentThread().getName());
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
