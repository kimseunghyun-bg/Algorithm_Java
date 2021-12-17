package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {

    private static Stream<Arguments> testDiagonalDifference() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(
                        new ArrayList<>(Arrays.asList(11, 2, 4)),
                        new ArrayList<>(Arrays.asList(4, 5, 6)),
                        new ArrayList<>(Arrays.asList(10, 8, -12)))
                ), 15)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDiagonalDifference(List<List<Integer>> arr, int expected) {
        // given
        // when
        int actual = DiagonalDifference.diagonalDifference(arr);
        // then
        assertEquals(expected, actual);
    }
}