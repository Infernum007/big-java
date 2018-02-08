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
        Character character = "A"

        expect:
        finder.functionalPositionFinder(string, character) == [0, 8]
    }

    def "IterativePositionFinder returns a list of all positions of a given character in a string"() {
        setup:
        String string = "Alice's Adventures in Wonderland"
        Character character = "A"

        expect:
        finder.iterativePositionFinder(string, character) == [0, 8]
    }
}
