package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PickingNumbersTest {

    static Stream<Arguments> testPickingNumbers() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1)), 3),
                Arguments.of(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 2)), 5)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testPickingNumbers(List<Integer> a, int expected) {
        // given
        // when
        int actual = PickingNumbers.pickingNumbers(a);
        // then
        assertThat(actual, is(expected));
    }
}