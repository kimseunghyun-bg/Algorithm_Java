package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
class SherlockAndSquaresTest {

    static Stream<Arguments> testSquares(){
        return Stream.of(
                Arguments.of(3, 9, 2),
                Arguments.of(17, 24, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSquares(int a, int b, int expected) {
        // given
        // when
        int actual = SherlockAndSquares.squares(a, b);
        // then
        assertThat(actual, is(expected));
    }
}