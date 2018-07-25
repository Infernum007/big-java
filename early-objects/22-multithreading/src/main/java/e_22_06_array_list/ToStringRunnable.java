package e_22_06_array_list;

public class ToStringRunnable implements Runnable
{
    private static final int DELAY = 1;
    private ArrayList arrayList;

    public ToStringRunnable(final ArrayList arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public void run()
    {
        try {
            System.out.println(arrayList.toString());
            Thread.sleep(DELAY);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
