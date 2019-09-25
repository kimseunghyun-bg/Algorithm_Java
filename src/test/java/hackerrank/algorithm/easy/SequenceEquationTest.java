package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SequenceEquationTest {

    static Stream<Arguments> testPermutationEquation() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1}, new int[]{2, 3, 1}),
                Arguments.of(new int[]{4, 3, 5, 1, 2}, new int[]{1, 3, 5, 4, 2})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testPermutationEquation(int[] p, int[] expected) {
        // given
        // when
        int[] actual = SequenceEquation.permutationEquation(p);
        // then
        assertThat(actual, is(expected));
    }
}