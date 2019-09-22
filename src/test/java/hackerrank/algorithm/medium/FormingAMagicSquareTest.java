package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FormingAMagicSquareTest {

    static Stream<Arguments> testFormingMagicSquare() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 3, 4},{1, 5, 8},{6, 4, 2}},7),
                Arguments.of(new int[][]{{4, 9, 2},{3, 5, 7},{8, 1, 5}},1),
                Arguments.of(new int[][]{{4, 8, 2},{4, 5, 7},{6, 1, 6}},4)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testFormingMagicSquare(int[][] s, int expected) {
        // given
        // when
        int actual = FormingAMagicSquare.formingMagicSquare(s);
        // then
        assertThat(actual, is(expected));
    }
}