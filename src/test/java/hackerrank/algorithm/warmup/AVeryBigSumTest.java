package hackerrank.algorithm.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVeryBigSumTest {

    private static Stream<Arguments> testAVeryBigSum() {
        return Stream.of(
                Arguments.of(new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L}, 5000000015L)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testAVeryBigSum(long[] param1, long expectedValue) {
        // given
        // when
        long actualValue = AVeryBigSum.aVeryBigSum(param1);

        // then
        assertEquals(expectedValue, actualValue);
    }
}