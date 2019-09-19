package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CountingValleysTest {

    static Stream<Arguments> testCountingValleys() {
        return Stream.of(
                Arguments.of(8, "UDDDUDUU", 1),
                Arguments.of(12, "DDUUDDUDUUUD", 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCountingValleys(int n, String s, int expected) {
        // given
        // when
        int actual = CountingValleys.countingValleys(n, s);
        // then
        assertThat(actual, is(expected));
    }
}