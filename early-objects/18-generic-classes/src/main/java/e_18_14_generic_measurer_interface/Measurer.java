package e_18_14_generic_measurer_interface;

/**
 * Describes any class whose objects can measure other objects.
 */
public interface Measurer<T>
{
    /**
     * Computes the measure of an object.
     *
     * @param anObject the object to be measured
     * @return the measure
     */
    double measure(T anObject);
}
