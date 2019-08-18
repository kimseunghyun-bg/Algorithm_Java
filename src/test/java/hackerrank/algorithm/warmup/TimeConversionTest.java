package hackerrank.algorithm.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    private static Stream<Arguments> testTimeConversion() {
        return Stream.of(
                Arguments.of("07:05:45PM", "19:05:45")
        );
    }

    @ParameterizedTest
    @MethodSource
    void testTimeConversion(String time, String expectedTime) {
        // given
        // when
        String actualTime = TimeConversion.timeConversion(time);
        // then
        assertEquals(expectedTime, actualTime);
    }
}