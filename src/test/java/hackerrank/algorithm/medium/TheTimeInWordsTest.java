package hackerrank.algorithm.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TheTimeInWordsTest {

    static Stream<Arguments> testTimeInWords() {
        return Stream.of(
                Arguments.of(3, 0, "three o' clock")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testTimeInWords(int h, int m, String expected) {
        // given
        // when
        String actual = TheTimeInWords.timeInWords(h, m);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testBuildPreposition() {
        return Stream.of(
                Arguments.of(0, ""),
                Arguments.of(1, "past"),
                Arguments.of(30, "past"),
                Arguments.of(31, "to"),
                Arguments.of(59, "to")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testBuildPreposition(int m, String expected) {
        // given
        // when
        String actual = TheTimeInWords.buildPreposition(m);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGenerateHourString() {
        return Stream.of(
                Arguments.of(1, "one"),
                Arguments.of(2, "two"),
                Arguments.of(12, "twelve")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testGenerateHourString(int m, String expected) {
        // given
        // when
        String actual = TheTimeInWords.generateHourString(m);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testModifyHourToString() {
        return Stream.of(
                Arguments.of(1, 0, 1),
                Arguments.of(1, 31, 2),
                Arguments.of(12, 0, 0),
                Arguments.of(12, 31, 1)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testModifyHourToString(int h, int m, int expected) {
        // given
        // when
        int actual = TheTimeInWords.modifyHourToString(h, m);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testGenerateMinutesString() {
        return Stream.of(
                Arguments.of(1, "one minute"),
                Arguments.of(2, "two minutes"),
                Arguments.of(15, "quarter"),
                Arguments.of(30, "half")
        );
    }

    @MethodSource
    @ParameterizedTest
    void testGenerateMinutesString(int m, String expected) {
        // given
        // when
        String actual = TheTimeInWords.generateMinutesString(m);
        // then
        assertThat(actual, is(expected));
    }

    static Stream<Arguments> testModifyMinuteToString() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(30, 30),
                Arguments.of(59, 1)
        );
    }

    @MethodSource
    @ParameterizedTest
    void testModifyMinuteToString(int m, int expected) {
        // given
        // when
        int actual = TheTimeInWords.modifyMinuteToString(m);
        // then
        assertThat(actual, is(expected));
    }
}