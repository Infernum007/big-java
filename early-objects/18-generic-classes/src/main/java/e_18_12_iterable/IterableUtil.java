package e_18_12_iterable;

/**
 * {@code IterableUtil} class.
 */
public class IterableUtil
{
    /**
     * Iterates over the elements in iterable collection.
     *
     * @param iterable iterable collection.
     */
    public static <T extends Iterable<E>, E> void print(T iterable)
    {
        for (E element : iterable)
        {
            System.out.println(element);
        }
    }
}
