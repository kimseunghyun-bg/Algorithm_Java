package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ModifiedKaprekarNumbersTest {

    static Stream<Arguments> testIsKaprekarNumber() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(9, true),
                Arguments.of(4000, false)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testIsKaprekarNumber(int p, boolean expected) {
        // given
        // when
        boolean actual = ModifiedKaprekarNumbers.iskaprekarNumbers(p);
        // then
        assertThat(actual, is(expected));
    }
}