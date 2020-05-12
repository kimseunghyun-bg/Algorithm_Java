package programmers.lv3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Seunghyun Kim
 * @since 2020-05-13
 */
class ThanksgivingTrafficTest {

    static Stream<Arguments> testSolution() {
        return Stream.of(
                Arguments.of(new String []{"2016-09-15 01:00:04.001 2.0s","2016-09-15 01:00:07.000 2s"}, 1),
                Arguments.of(new String []{"2016-09-15 01:00:04.002 2.0s","2016-09-15 01:00:07.000 2s"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSolution(String[] lines, int expected) {
        // given
        // when
        ThanksgivingTraffic traffic = new ThanksgivingTraffic();
        int actual = traffic.solution(lines);
        // then
        assertThat(expected, is(actual));
    }
}