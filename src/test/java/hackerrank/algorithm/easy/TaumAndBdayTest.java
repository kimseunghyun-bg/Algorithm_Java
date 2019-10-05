package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TaumAndBdayTest {

    static Stream<Arguments> testTaumBday() {
        return Stream.of(
                Arguments.of(10, 10, 1, 1, 1, 20),
                Arguments.of(5, 9, 2, 3, 4, 37),
                Arguments.of(3, 6, 9, 1, 1, 12),
                Arguments.of(7, 7, 4, 2, 1, 35),
                Arguments.of(3, 3, 1, 9, 2, 12)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testTaumBday(int b, int w, int bc, int wc, int z, long expected) {
        // given
        // when
        long actual = TaumAndBday.taumBday(b, w, bc, wc, z);
        // then
        assertThat(actual, is(expected));
    }
}