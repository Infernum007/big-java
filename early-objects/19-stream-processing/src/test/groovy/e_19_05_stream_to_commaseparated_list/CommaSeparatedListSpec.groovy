package e_19_05_stream_to_commaseparated_list

import spock.lang.Specification
import spock.lang.Unroll

/**
 * {@code CommaSeparatedStreamSpec} class.
 */
class CommaSeparatedListSpec extends Specification {

    CommaSeparatedList csl

    void setup() {
        csl = new CommaSeparatedList()
    }

    @Unroll
    def "stream correctly converted to '#result' limited by #limit"() {
        when:
        String cslResult = csl.toString(stream, limit)

        then:
        cslResult == result

        where:
        stream                                              | limit || result
        ['Alice', 'was', 'beginning', 'to', 'get'].stream() | 4     || 'Alice,was,beginning,to'
        [0, 3, -5, 4, 12, -6].stream()                      | 3     || '0,3,-5'
        [0.906, -0.114, 45.14, 4.0, 13.1111].stream()       | 5     || '0.906,-0.114,45.14,4.0,13.1111'
    }

    void cleanup() {
        csl = null
    }
}
