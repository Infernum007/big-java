package e_19_19_character_position_in_string

import spock.lang.Specification

class CharacterPositionFinderSpec extends Specification {

    CharacterPositionFinder finder

    void setup() {
        finder = new CharacterPositionFinder()
        assert finder != null
    }

    def "FunctionalPositionFinder returns a list of all positions of a given character in a string"() {
        setup:
        String string = "Alice's Adventures in Wonderland"

        expect:
        finder.functionalPositionFinder(string, character) == result

        where:
        character         || result
        'A' as Character  || [0, 8]
        'a' as Character  || [29]
        'l' as Character  || [1, 28]
        '\'' as Character || [5]
    }

    def "IterativePositionFinder returns a list of all positions of a given character in a string"() {
        setup:
        String string = "Alice's Adventures in Wonderland"

        expect:
        finder.iterativePositionFinder(string, character) == result

        where:
        character         || result
        'A' as Character  || [0, 8]
        'a' as Character  || [29]
        'l' as Character  || [1, 28]
        '\'' as Character || [5]
    }
}
