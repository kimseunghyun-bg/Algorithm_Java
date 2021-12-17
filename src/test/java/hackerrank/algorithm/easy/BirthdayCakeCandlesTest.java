package hackerrank.algorithm.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirthdayCakeCandlesTest {

    private static Stream<Arguments> testBirthdayCakeCandles() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testBirthdayCakeCandles(int[] param1, int expected) {
        // given
        // when
        int actual = BirthdayCakeCandles.birthdayCakeCandles(param1);
        // then
        assertEquals(expected, actual);
    }
}
