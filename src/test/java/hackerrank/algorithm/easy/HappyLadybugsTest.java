package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HappyLadybugsTest {

    static Stream<Arguments> testHappyLadybugs() {
        return Stream.of(
                Arguments.of("RBY_YBR", "YES"),
                Arguments.of("X_Y__X", "NO"),
                Arguments.of("__", "YES"),
                Arguments.of("B_RRBR", "YES"),
                Arguments.of("AABBC", "NO"),
                Arguments.of("AABBC_C", "YES"),
                Arguments.of("_", "YES"),
                Arguments.of("DD__FQ_QQF", "YES"),
                Arguments.of("AABCBC", "NO")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testHappyLadybugs(String s, Object expected) {
        // given

        // when
        String actual = HappyLadybugs.happyLadybugs(s);

        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testEqualsBefore() {
        return Stream.of(
                Arguments.of("SS".toCharArray(), 0, false),
                Arguments.of("SS".toCharArray(), 1, true),
                Arguments.of("SSS".toCharArray(), 2, true)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testEqualsBefore(char[] target, int index, boolean expected) {
        // given

        // when
        boolean actual = HappyLadybugs.equalsBefore(target, index);

        // then
        assertThat(actual, is(expected));
    }


    static Stream<Arguments> testEqualsAfter() {
        return Stream.of(
                Arguments.of("SS".toCharArray(), 0, true),
                Arguments.of("SS".toCharArray(), 1, false),
                Arguments.of("SSS".toCharArray(), 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testEqualsAfter(char[] target, int index, boolean expected) {
        // given

        // when
        boolean actual = HappyLadybugs.equalsAfter(target, index);

        // then
        assertThat(actual, is(expected));
    }
}