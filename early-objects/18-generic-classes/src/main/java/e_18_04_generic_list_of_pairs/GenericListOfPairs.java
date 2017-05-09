package e_18_04_generic_list_of_pairs;

import java.util.*;

/**
 * Implement a static generic method that, given a {@code Map<K, V>},
 * yields a {@code List<Pair<K, V>>} of the key/value pairs in the map.
 */
public class GenericListOfPairs
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tony", 4);
        map.put("Carl", 1);
        map.put("Harry", 5);

        List<Pair<String, Integer>> list = mapToListOfPairs(map);

        System.out.println(list);

        Map<Integer, Object> map1 = new HashMap<>();
        map1.put(4, "Tony");
        map1.put(1, "Carl");
        map1.put(5, "Harry");

        List<Pair<Integer, Object>> list1 = mapToListOfPairs(map1);

        System.out.println(list1);
    }

    public static <K, V> List<Pair<K, V>> mapToListOfPairs(Map<K, V> map)
    {
        List<Pair<K, V>> list = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet())
        {
            list.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        return list;
    }
}
