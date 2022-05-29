package programmers.lv2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CompressStringTest {

    static Stream<Arguments> testSolution() {
        return Stream.of(
                Arguments.of("aabbaccc", 7),
                Arguments.of("ababcdcdababcdcd", 9),
                Arguments.of("abcabcdede", 8),
                Arguments.of("abcabcabcabcdededededede", 14),
                Arguments.of("xababcdcdababcdcd", 17)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSolution(String str, int expected) {
        // given

        // when
        CompressString compressString = new CompressString();
        int actual = compressString.solution(str);

        // then
        assertThat(actual, is(expected));
    }
}