package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AppendAndDeleteTest {

    static Stream<Arguments> testAppendAndDelete(){
        return Stream.of(
                Arguments.of("hackerhappy", "hackerrank", 9, "Yes"),
                Arguments.of("aba", "aba", 7, "Yes"),
                Arguments.of("ashley", "ash", 2, "No"),
                Arguments.of("qwerasdf", "qwerbsdf", 6, "No"),
                Arguments.of("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 20, "Yes")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testAppendAndDelete(String s, String t, int k, String expected) {
        // given
        // when
        String actual = AppendAndDelete.appendAndDelete(s, t, k);
        // then
        assertThat(actual, is(expected));
    }
}