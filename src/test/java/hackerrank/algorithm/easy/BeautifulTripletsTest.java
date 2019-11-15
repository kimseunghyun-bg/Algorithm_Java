package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BeautifulTripletsTest {

    static Stream<Arguments> testBeautifulTriplets() {
        return Stream.of(
                Arguments.of(3, new int[]{1, 2, 4, 5, 7, 8, 10}, 3)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testBeautifulTriplets(int d, int[] arr, int expected) {
        // given
        // when
        int actual = BeautifulTriplets.beautifulTriplets(d, arr);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGetNumberCount() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 4, 5, 7, 8, 10}, new int[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1})
        );
    }

    @MethodSource
    @ParameterizedTest
    void testGetNumberCount(int[] arr, int[] expected) {
        // given
        // when
        int[] actual = BeautifulTriplets.getNumberCount(arr);
        // then
        assertArrayEquals(actual, expected);
    }
}