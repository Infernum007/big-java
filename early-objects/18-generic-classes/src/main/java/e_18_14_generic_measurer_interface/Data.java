package e_18_14_generic_measurer_interface;

public class Data
{
    /**
     * Computes the average of the measures of the given objects.
     *
     * @param objects an array of objects
     * @param meas    the measurer for the objects
     * @return the average of the measures
     */
    public static <T> double average(T[] objects, Measurer<T> meas)
    {
        double sum = 0;
        for (T obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.length > 0) { return sum / objects.length; }
        else { return 0; }
    }

    /**
     * Computes the maximum of the measures of the given object
     *
     * @param values an array of generic objects
     * @param meas   the measurer for the objects
     * @return the object with maximum measure
     */
    public static <T> T max(T[] values, Measurer<T> meas)
    {
        T maxRectangle = values[0];
        for (T o : values)
        {
            if (meas.measure(o) > meas.measure(maxRectangle)) {
                maxRectangle = o;
            }
        }
        return maxRectangle;
    }
}
