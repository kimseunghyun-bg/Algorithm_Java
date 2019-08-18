package hackerrank.algorithm.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleArraySumTest {

    private static Stream<Arguments> testSimpleArraySum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 10, 11}, 31)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testSimpleArraySum(int[] param1, int expected) {
        // given
        // when
        int actual = SimpleArraySum.simpleArraySum(param1);

        // then
        assertEquals(expected, actual);
    }
}