package e_19_07_replace_string_w_periods;

import utils.ListUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a lambda expression for a function that turns a string into a string
 * made of the first letter, three periods, and the last letter, such as
 * {@code "W...d"}. (Assume the string has at least two letters.) Then write
 * a program that reads words into a stream, applies the lambda expression to
 * each element, and prints the result. Filter out any words with fewer than
 * two letters.
 */
public class StringTransformer
{
    public static void main(String[] args)
    {
        List<String> wordList = ListUtils.getListOfWordsFromString("I wonder if I" +
                " shall fall right THROUGH the earth!  How funny it'll seem to" +
                " come out among the people that walk with their heads downward!"
        );

        StringTransformer transformer = new StringTransformer();
        List<String> result = transformer.replaceWithDots(wordList);

        System.out.println(result);
    }

    public List<String> replaceWithDots(List<String> stringList)
    {
        try (Stream<String> stream = stringList.stream()) {
            return stream
                    .filter(w -> w.length() >= 2)
                    .map(w -> {
                        String first = w.substring(0, 1);
                        String last = w.substring(w.length() - 1);
                        return first + "..." + last;
                    })
                    .collect(Collectors.toList());
        }
    }
}
