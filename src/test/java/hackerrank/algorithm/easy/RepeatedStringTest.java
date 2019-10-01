package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RepeatedStringTest {

    static Stream<Arguments> testRepeatedString(){
        return Stream.of(
                Arguments.of("abcac", 10, 4),
                Arguments.of("aba", 10, 7),
                Arguments.of("a", 1000000000000L, 1000000000000L)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testRepeatedString(String s, long n, long expected) {
        // given
        // when
        long actual = RepeatedString.repeatedString(s, n);
        // then
        assertThat(actual, is(expected));
    }
}