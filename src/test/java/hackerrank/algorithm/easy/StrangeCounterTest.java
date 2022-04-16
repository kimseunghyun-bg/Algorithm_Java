package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StrangeCounterTest {

    static Stream<Arguments> testStrangeCounter() {
        return Stream.of(
                Arguments.of(4, 6),
                Arguments.of(10, 12),
                Arguments.of(22, 24),
                Arguments.of(1, 3),
                Arguments.of(17, 5),
                Arguments.of(21, 1)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testStrangeCounter(long t, long expected) {
        // given

        // when
        long actual = StrangeCounter.strangeCounter(t);

        // then
        assertThat(actual, is(expected));
    }
}