package e_18_10_hashMap;

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
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o) { return true; }
        if (!(o instanceof Pair)) { return false; }

        final Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null)
        { return false; }
        return second != null ? second.equals(pair.second) : pair.second == null;
    }

    @Override
    public int hashCode()
    {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
