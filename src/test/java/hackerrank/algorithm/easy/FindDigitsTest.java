package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FindDigitsTest {

    static Stream<Arguments> testFindDigits(){
        return Stream.of(
                Arguments.of(12, 2),
                Arguments.of(1012, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testFindDigits(int n, int expected) {
        // given
        // when
        int actual = FindDigits.findDigits(n);
        // then
        assertThat(actual, is(expected));
    }
}