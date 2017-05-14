package p_18_08_list_of_pairs_functional;

/**
 * This class collects a pair of elements of different types.
 */
public class Pair<T, S>
{
    private T first;
    private S second;

    /**
     * Constructs a pair containing two given elements.
     *
     * @param firstElement  the first element
     * @param secondElement the second element
     */
    public Pair(T firstElement, S secondElement)
    {
        this.first = firstElement;
        this.second = secondElement;
    }

    /**
     * Gets the first element of the pair.
     *
     * @return the first element
     */
    public T getFirst()
    {
        return first;
    }

    /**
     * Gets the second element of the pair.
     *
     * @return the second element
     */
    public S getSecond()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return "Pair[first=" + first + ",second=" + second + "]";
    }
}
