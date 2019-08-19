package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleSumPairsTest {

    static Stream<Arguments> testDivisibleSumPairs() {
        return Stream.of(
                Arguments.of(6, 3, new int[]{1, 3, 2, 6, 1, 2}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDivisibleSumPairs(int n, int k, int[] ar, int expected) {
        int actual = DivisibleSumPairs.divisibleSumPairs(n,k,ar);
        assertEquals(expected, actual);
    }
}