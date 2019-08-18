package hackerrank.algorithm.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheRecordsTest {

    static Stream<Arguments> testBreakingRecords() {
        return Stream.of(
                Arguments.of(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1}, new int[]{2, 4})
        );
    }

    @ParameterizedTest
    @MethodSource
    void testBreakingRecords(int[] scores, int[] expected) {
        int[] actual = BreakingTheRecords.breakingRecords(scores);
        assertArrayEquals(expected, actual);
    }
}