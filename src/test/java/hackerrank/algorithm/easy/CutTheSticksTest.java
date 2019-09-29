package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CutTheSticksTest {

    static Stream<Arguments> testCutTheSticks() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 4, 2, 2, 8}, new int[]{6, 4, 2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 3, 3, 2, 1}, new int[]{8, 6, 4, 1})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCutTheSticks(int[] arr, int[] expected) {
        // given
        // when
        int[] actual = CutTheSticks.cutTheSticks(arr);
        // then
        assertThat(actual, is(expected));
    }
}