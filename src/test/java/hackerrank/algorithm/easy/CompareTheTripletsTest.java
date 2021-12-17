package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareTheTripletsTest {

    private static Stream<Arguments> testCompareTriplets() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(5, 6, 7)), new ArrayList<>(Arrays.asList(3, 6, 10)), new ArrayList<>(Arrays.asList(1, 1))),
                Arguments.of(new ArrayList<>(Arrays.asList(17, 28, 30)), new ArrayList<>(Arrays.asList(99, 16, 8)), new ArrayList<>(Arrays.asList(2, 1)))
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCompareTriplets(List<Integer> param1, List<Integer> param2, List<Integer> expected) {
        // given
        // when
        List<Integer> actual = CompareTheTriplets.compareTriplets(param1, param2);
        // then
        assertEquals(expected, actual);
    }
}