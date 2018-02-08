package e_19_19_character_position_in_string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a function that returns a list of all positions of a given
 * character in a string. Produce two versions — one with streams and
 * one without. Which one is easier to implement?
 */
public class CharacterPositionFinder
{
    public List<Integer> functionalPositionFinder(final String s, final char c)
    {
        return IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == c)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> iterativePositionFinder(final String s, final char c)
    {
        final List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                positions.add(i);
            }
        }
        return positions;
    }
}
