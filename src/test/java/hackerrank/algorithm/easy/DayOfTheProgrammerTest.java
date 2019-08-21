package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfTheProgrammerTest {

    static Stream<Arguments> testDayOfProgrammer() {
        return Stream.of(
                Arguments.of(2017, "13.09.2017"),
                Arguments.of(2016, "12.09.2016"),
                Arguments.of(1800, "12.09.1800")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testDayOfProgrammer(int year, String expected) {
        String actual = DayOfTheProgrammer.dayOfProgrammer(year);
        assertEquals(expected, actual);
    }
}