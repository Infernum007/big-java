package e_22_06_array_list;

import java.util.Random;

public class SetRunnable implements Runnable
{
    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public SetRunnable(final ArrayList arrayList, final int count)
    {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < count; i++) {
                Object obj = "Tom-" + i;
                arrayList.set(new Random().nextInt(count), obj);
                System.out.println("SetRunnable.run >>> " + obj.toString() + " >>> running in " + Thread.currentThread().getName());
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
