package e_18_10_hashMap;

import java.util.*;

/**
 * {@code HashMap} class.
 */
public class HashMap<K, V>
{
    private Set<Pair<K, V>> set;

    public HashMap()
    {
        this.set = new HashSet<>();
    }

    public int size()
    {
        return this.set.size();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public boolean containsKey(final K key)
    {
        for (final Pair<K, V> aSet : set)
        {
            K pairKey = aSet.getFirst();
            if (pairKey.equals(key)) { return true; }
        }
        return false;
    }

    public boolean containsValue(final V value)
    {
        for (final Pair<K, V> aSet : set)
        {
            V pairValue = aSet.getSecond();
            if (pairValue.equals(value)) { return true; }
        }
        return false;
    }

    public V get(final K key)
    {
        for (final Pair<K, V> aSet : set)
        {
            K pairKey = aSet.getFirst();
            if (pairKey.equals(key)) { return aSet.getSecond(); }
        }
        return null;
    }

    public V put(K key, V value)
    {
        this.set.add(new Pair<>(key, value));
        return value;
    }

    public V remove(final K key)
    {
        for (final Pair<K, V> aSet : set)
        {
            K pairKey = aSet.getFirst();
            if (pairKey.equals(key))
            {
                V pairValue = aSet.getSecond();
                set.remove(aSet);
                return pairValue;
            }
        }
        return null;
    }

    public void clear()
    {
        this.set.clear();
    }

    public Set<K> keySet()
    {
        Set<K> result = new HashSet<>();
        for (final Pair<K, V> kvPair: set)
        {
            K key = kvPair.getFirst();
            result.add(key);
        }
        return result;
    }

    public Collection<V> values()
    {
        Collection<V> result = new LinkedHashSet<>();
        for (final Pair<K, V> kvPair : set)
        {
            V value = kvPair.getSecond();
            result.add(value);
        }
        return result;
    }
}

