package e_18_10_hashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * {@code HashMapDemo} class.
 */
public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Tony Tester");
        map.put(1, "Carl Cracker");
        map.put(2, "Harry Hacker");

        System.out.println("map.isEmpty()" + map.isEmpty());
        System.out.println("map.size(): " + map.size());

        System.out.println("map.containsKey(5): " + map.containsKey(5));
        System.out.println("map.containsKey(3): " + map.containsKey(2));
        System.out.println("map.containsKey(0): " + map.containsKey(0));

        System.out.println("map.containsValue(Tony Tester): " + map.containsValue("Tony Tester"));
        System.out.println("map.containsValue(Harry Cracker): " + map.containsValue("Harry Cracker"));
        System.out.println("map.containsValue(Carl Hacker): " + map.containsValue("Carl Hacker"));

        System.out.println("map.get(0): " + map.get(0));
        System.out.println("map.get(1): " + map.get(1));
        System.out.println("map.get(2): " + map.get(2));
        System.out.println("map.get(3): " + map.get(3));

        System.out.println("map.remove(0): " + map.remove(0));
        System.out.println("map.size(): " + map.size());
        System.out.println("map.remove(1): " + map.remove(1));
        System.out.println("map.size(): " + map.size());
        System.out.println("map.remove(2): " + map.remove(2));
        System.out.println("map.size(): " + map.size());
        System.out.println("map.remove(3): " + map.remove(3));

        map.put(0, "Tony Tester");
        map.put(1, "Carl Cracker");
        map.put(2, "Harry Hacker");
        map.clear();
        System.out.println("map.clear(); map.size(): " + map.size());

        map.put(0, "Tony Tester");
        map.put(1, "Carl Cracker");
        map.put(2, "Harry Hacker");

        Set<Integer> keySet = map.keySet();
        System.out.println("map.keySet()" + keySet.toString());

        Collection<String> mapValues = map.values();
        System.out.println("map.values(): " + mapValues);
    }
}
