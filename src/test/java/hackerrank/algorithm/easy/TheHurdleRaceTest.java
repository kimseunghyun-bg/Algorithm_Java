package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TheHurdleRaceTest {

    static Stream<Arguments> testHurdleRace() {
        return Stream.of(
                Arguments.of(4, new int[]{1, 6, 3, 5, 2},2),
                Arguments.of(7, new int[]{2, 5, 4, 5, 2},0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testHurdleRace(int k, int[] height, int expected) {
        // given
        // when
        int actual = TheHurdleRace.hurdleRace(k, height);
        // then
        assertThat(actual, is(expected));
    }
}