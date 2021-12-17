package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

    private static Stream<Arguments> testGetMax() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 4),
                Arguments.of(new int[]{1,2,3,4,5,Integer.MAX_VALUE}, Integer.MAX_VALUE)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetMax(int[] arr, int expected) {
        // given
        // when
        int actual = MiniMaxSum.getMax(arr);

        // then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testGetMin() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 1),
                Arguments.of(new int[]{1,2,3,4,5,Integer.MIN_VALUE}, Integer.MIN_VALUE)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetMin(int[] arr, int expected) {
        // given
        // when
        int actual = MiniMaxSum.getMin(arr);

        // then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testGetSum() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 10),
                Arguments.of(new int[]{1,2,3,4,5}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testGetSum(int[] arr, int expected) {
        // given
        // when
        int actual = MiniMaxSum.getSum(arr);

        // then
        assertEquals(expected, actual);
    }
}