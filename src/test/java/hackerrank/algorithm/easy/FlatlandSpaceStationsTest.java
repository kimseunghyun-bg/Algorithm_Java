package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FlatlandSpaceStationsTest {

    static Stream<Arguments> testFlatlandSpaceStations() {
        return Stream.of(
                Arguments.of(5, new int[]{0, 4}, 2),
                Arguments.of(5, new int[]{0, 5}, 2),
                Arguments.of(6, new int[]{0, 1, 2, 4, 3, 5}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testFlatlandSpaceStations(int n, int[] c, int expected) {
        // given

        // when
        int actual = FlatlandSpaceStations.flatlandSpaceStations(n, c);

        // then
        assertThat(actual, is(expected));
    }
}