package e_19_05_stream_to_commaseparated_list

import spock.lang.Specification

/**
 * {@code CommaSeparatedStreamSpec} class.
 */
class CommaSeparatedListSpec extends Specification {

    CommaSeparatedList csl

    void setup() {
        csl = new CommaSeparatedList()
    }

    def "toString method works with stream of strings"() {
        given: "stream of strings"
        def stream = ['Alice', 'was', 'beginning', 'to', 'get', 'very', 'tired'].stream()

        when: "toString method is invoked on the given stream"
        String commaSeparatedList = csl.toString(stream, 3)

        then: "toString method returns comma-separated list of strings"
        assert commaSeparatedList == 'Alice,was,beginning'
    }

    def "toString method works with stream of Integers"() {
        given: "stream of integers"
        def stream = [1, -6, 100, -13, 3, -56].stream()

        when: "toString method is invoked on the given stream"
        String commaSeparatedList = csl.toString(stream, 5)

        then: "toString method returns comma-separated list of integers"
        assert commaSeparatedList == '1,-6,100,-13,3'
    }
}
